package JavaTraining;
import java.util.Scanner;
public class InputHasNextFun {

	public static void main(String[] args) {
		Scanner sc=new Scanner("10 20 30");
		Scanner ip=new Scanner("30:120:50");
		ip.useDelimiter(":");
		System.out.println(ip.nextInt() + ip.nextInt() + ip.nextInt());
	
		System.out.println(sc.next());
		System.out.println(sc.hasNext());
		System.out.println(sc.next());
		System.out.println(sc.hasNext());
		System.out.println(sc.next());
		System.out.println(sc.hasNext());

		// To change default delimiter 
		sc.close();
		ip.close();
	}

}
