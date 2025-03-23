package JavaTraining;
import java.util.Scanner;

public class CheckChar {

	public static void main(String[] args) {
		//To check if it is vowel or consonant
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=ip.next().charAt(0);
		if (ch=='a'||ch=='i'||ch =='o'|| ch=='e'||ch=='u'||ch=='A'||ch=='I'||ch =='O'|| ch=='E'||ch=='U') {
		    System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
		
		ip.close();
	}
	

}
