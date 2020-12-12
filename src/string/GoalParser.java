package string;

public class GoalParser 
{
	public static void main(String[] args) {
		interpret("G()(al)");
	}
	
	public static String interpret(String command) 
	{
		return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
	}
}
