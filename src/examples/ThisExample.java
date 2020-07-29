package examples;

public class ThisExample 
{
	int rollno;
	String name,course;
	float fees;
	
	ThisExample(int rollno,String name,String course)
	{
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}
	
	ThisExample(int rollno,String name,String course,float fees)
	{
		this(rollno, name, course);
		this.fees=fees;
	}
	
	void displayInfo()
	{
		System.out.println(rollno+" "+name+" "+course+" "+fees);
	}
	

	public static void main(String[] args) 
	{
		ThisExample t1 = new ThisExample(111, "Dhaval", "IBM");
		ThisExample t2 = new ThisExample(222, "Dhaval", "IT Business", 7000);
		
		t1.displayInfo();
		t2.displayInfo();
	}
}
