package JavaTraining;

import java.util.Scanner;

public class Switchcondition {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number 1 ");
		int num1=input.nextInt();
		System.out.print("Enter a number 2 ");
		int num2=input.nextInt();
		System.out.println("Choose operation (+,-,*,/) ");
		int op=input.next().charAt(0);
		if (num2==0 && op =='/') {
			System.out.println(" Arithmetic Exception");
			input.close();
			return;
		}
		switch (op) {
		case '+':
			System.out.println(num1+num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		default:
			System.out.println(-1);
		}
		input.close();
		

	}

}
