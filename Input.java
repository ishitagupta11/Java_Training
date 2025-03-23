package JavaTraining;
import java.util.Scanner;
public class Input {
	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Enter Name");
		String num1=ip.next(); // If u enter anything with space then InputMismatchException
		
		System.out.println("Enter age");
		int num2=ip.nextInt();
		
		System.out.println("You like tea? Y OR N");
		char num3=ip.next().charAt(0);
		
		System.out.println("Address");
		ip.nextLine(); //if u don't use this extra line then it will return empty output 
		String num4=ip.nextLine();
		
		System.out.println("True or False");
		boolean num5=ip.nextBoolean();
	    
	    System.out.println("Age " + num1);
		System.out.println("Name " + num2);
		System.out.println("You like tea? " + num3);
		System.out.println("Address " + num4);
		System.out.println("True or False " + num5);
		ip.close();
	}

}
