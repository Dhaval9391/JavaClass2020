package examples;

public class StaticExamples 
{
	int rollno;
	String name;
	static String cName = "Fanshawe";
	
	static void changeName()
	{
		cName = "Cambrian";
	}
	
	public StaticExamples(int r, String n) 
	{
		rollno = r;
		name = n;
	}
	
	void displayInfo()
	{
		System.out.println(rollno+" "+name+" "+cName);
	}

	
	public static void main(String[] args) 
	{
		StaticExamples.changeName();
		
		StaticExamples s1 = new StaticExamples(111, "Dhaval");
		StaticExamples s2 = new StaticExamples(222, "Afsheen");
		
		s1.displayInfo();
		s2.displayInfo();
	}
	
}
