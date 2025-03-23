package JavaTraining;

public class Airthmetic_Operator {

	public static void main(String[] args) {
		double d =10.21;
        int i = 5;
// 	    double k = d + i; can also do this 
		byte a = 127;
		byte b = 120;
		byte c= (byte) (a + b);
		double m=9/4;
		
//		byte c = a+b; will produce error because byte + byte will give integer
//     	System.out.println(c); 
//		System.out.println(true+false); it will also produce error
//		System.out.println(true+10); error
		System.out.println(c); 
		System.out.println(m); 
		// It will give 2.0 not 2.25 as it does work of division operator not float divison		
		System.out.println(d+i);
		System.out.println(10+10+"10");
		System.out.println("20"+30+10);
		System.out.println('a'+10);
		System.out.println('a'-2);
		System.out.println(20-30);
//		System.out.println("20"-30);
		System.out.println('a'*2);

//		System.out.println(10/0); Runtime ArithmeticException Error


		

	}

}
