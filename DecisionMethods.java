package JavaTraining;

import java.util.Scanner;

public class DecisionMethods {
	//To find if first number is multiple of second number

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number 1 ");
		int num1=input.nextInt();
		System.out.print("Enter a number 2 ");
		int num2=input.nextInt(); 
		System.out.println(ismultiple(num1,num2));
		input.close();
	}
   public static int ismultiple(int num1,int num2) {
	   if (num1==0||num2==0) {
		   return 3;
	   }
	   if (num2%num1==0) {
		   return 2;
	   }
	   return 1;
	   }
}
