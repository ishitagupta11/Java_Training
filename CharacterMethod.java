package JavaTraining;

public class CharacterMethod {

	public static void main(String[] args) {
		//Method to change the uppercase into lowercase
		change('A');
		change('B');
		change('Z');
		change('a');
		
	}
    
	public static void change(char ch) {
		char result=(ch>='A' && ch<='Z')?(char)(ch+32):ch;//65
		System.out.println(result);
	}
}
