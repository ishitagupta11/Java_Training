package JavaTraining;

public class MethoCall {
	static int num=0;
	public static void main(String[] args) {
		
		System.out.println("Main Start");
		m1();
		System.out.println("Main End");
	}
	public static void m1() {
		num++;
		m2();
		}
		
		public static void m2() {
		   System.out.println(num);
		m3(); //If we call m1 here it will give Stackover flow error

		}
		
		public static void m3() {
		System.out.println("M3 Start");
		System.out.println("M3 End");
		}


	}
