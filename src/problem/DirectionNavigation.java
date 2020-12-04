package problem;

public class DirectionNavigation {
	public static void main(String[] args) {
		System.out.println(isPathCrossing("NESWW"));
	}

	public static boolean isPathCrossing(String path) {
		Point[] visitedPoints = new Point[path.length()+1];
		Point p = new Point(0, 0);
		visitedPoints[0] = new Point(p);
		for (int i = 0; i < path.length(); i++) {
			char c = path.charAt(i);
			if (c == 'S')
				p.setX(p.getX() + 1);
			else if (c == 'N')
				p.setX(p.getX() - 1);
			else if (c == 'E')
				p.setY(p.getY() + 1);
			else if (c == 'W')
				p.setY(p.getY() - 1);

			for (int j = 0; visitedPoints[j] != null && j < visitedPoints.length; j++) {
				if (p.equals(visitedPoints[j]))
					return true;
			}
			visitedPoints[i+1] = new Point(p);
		}
		return false;
	}
}

class Point {
	private int x;
	private int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public boolean equals(Object p) {
		if (p == null || !this.getClass().getName().equals(p.getClass().getName()))
			return false;

		if (this.x == ((Point) p).getX() && this.y == ((Point) p).getY())
			return true;

		return false;
	}

	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}

}
