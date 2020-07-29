package examples;

public class ConstructorExample 
{
	
	int id;
	String name;
	
	public ConstructorExample(int i,String n) 
	{
		id = i;
		name = n;
	}
	
	public ConstructorExample () 
	{
		
	}
	void displayInfo()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) 
	{
		/*
		ConstructorExample c1 = new ConstructorExample(111, "Dhaval");
		ConstructorExample c2 = new ConstructorExample(222, "Afsheen");
		
		c1.displayInfo();
		c2.displayInfo();
		*/
		
		ConstructorExample c1 = new ConstructorExample(111, "Dhaval");
		ConstructorExample c2 = new ConstructorExample();
		
		c2.id = c1.id;
		c2.name = c1.name;
		
		c1.displayInfo();
		c2.displayInfo();
	}
}
