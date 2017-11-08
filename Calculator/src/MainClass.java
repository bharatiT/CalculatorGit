import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		Calculator ref = new CalculatorImpl();
		try(Scanner sc = new Scanner(System.in))
		{
			int choice = 0;
			System.out.println("1-Add");
			System.out.println("2-Sub");
			System.out.println("3-Division");
			System.out.println("4-Multiply");
			
			do
			{
				System.out.println("1-Add");
				System.out.println("1-Sub");
				System.out.println("1-Division");
				System.out.println("1-Multiply");
				
				System.out.println("Enter choice::");
				choice = sc.nextInt();
				switch(choice)
				{
				case 1 : result = ref.add(10,20);
				break;
				
				case 2 : result = ref.sub(20, 10);
				break;
				
				case 3 : result = ref.division(20,5);
				break;
				
				case 4 : result = ref.multiply(5, 4);
				break;
				}
				System.out.println("result = "+result);
			}while(choice!=0);
		}
	}

}
