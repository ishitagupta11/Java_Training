package JavaTraining;

public class MethodOverloadingString {

	public static void main(String[] args) {
		// convert any type of data into string and then return that data
		String str=parseintostring(12.0,'A');
		System.out.println(str);
		System.out.println(parseintostring(20,10.0));
		System.out.println(parseintostring(false));
		System.out.println(parseintostring('a'));

	}

	public static String parseintostring(int num1) {
		return ""+num1;
		}
	public static String parseintostring(float num1) {
		return ""+num1;
		}
	public static String parseintostring(long num1) {
		return ""+num1;
		}
	public static String parseintostring(char num1) {
		return ""+num1;
		}
	public static String parseintostring(double num1) {
		return ""+num1;
		}
	public static String parseintostring(boolean num1) {
		return ""+num1;
		}
	
	public static String parseintostring(double num1, double num2) {
	    return num1+" "+num2;
	}


}
