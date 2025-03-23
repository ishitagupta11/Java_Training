package JavaTraining;

public class MethodOverloading {

	public static void main(String[] args) {

		
		add(55.3,60);
		add(50,60);
		add(50,60,30);
		add(50,30.4);
		//print(10,10); It will give The method print(int, float) is ambiguous for the type MethodOverloading 

	}
	public static void add(int num1,int num2) {
		System.out.println(num1+num2);
	}
     public static void add(double num1,double num2) {
	   System.out.println(num1+num2);
	  }
     
     public static void add(int num1,int num2,int num3) {
	System.out.println(num1+num2+num3);
	} 
     public static void print(int num1,float num2) {
 		System.out.println("int-float");
 	}
     public static void print(float num1,int num2) {
  		System.out.println("float-int");
  	}
}
