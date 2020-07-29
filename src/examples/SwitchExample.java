package examples;

public class SwitchExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		int num = 50;
		switch (num) 
		{
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
			break;
		default:
			System.out.println("Number you entered is not correct");
			break;
		*/
		char area = 'A';
		int areaCode = 3;
		switch (areaCode) 
		{
			case 1:
				System.out.println("Ahmedabad");
			break;
			
			case 2:
				switch (area) 
				{
					case 'A':
						System.out.println("Ambavadi");
					break;
					
					case 'B':
						System.out.println("Bodakdev");
					break;
					
					case 'C':
						System.out.println("CG Road");
					break;
				}
			break;
			
			case 3:
				switch (area) 
				{
					case 'A':
						System.out.println("Science City");
					break;
					
					case 'B':
						System.out.println("Thaltej");
					break;
					
					case 'C':
						System.out.println("Prahladnagar");
					break;
				}
			break;
		}
	}
}
