package examples;

public class StaticExample 
{
	static int cube(int x)
	{
		return x*x*x;
	}
	
	public static void main(String args[])
	{
		int result = StaticExample.cube(3);
		System.out.println(result);
	}

}
