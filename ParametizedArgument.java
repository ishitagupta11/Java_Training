package JavaTraining;

public class ParametizedArgument {

	public static void main(String[] args) {
		add(60,30);
		add(10+80,30+10);
	}
	public static void add(int num1,int num2) {
		int sum = num1+num2;
		System.out.println(sum);
	}

}