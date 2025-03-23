package JavaTraining;

public class ReturnType {

	public static void main(String[] args) {
		
		System.out.println("Cube of a number :" +cube(3));
		System.out.println("Area of the circle :" + area(4));
		System.out.println("Even or Odd :" + even(0));
		}
   public static int area(int radius) {
	   return 22/7*radius*radius;
	}
   
   public static int cube(int num){
	   return num*num*num;	  
   }
   
   public static String even(int num){
	   return (num%2==0)?"Even":"Odd";  
	   
   }
   }