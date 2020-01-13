import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int num = 123;
		
		Scanner kb = new Scanner(System.in);
		int input = kb.nextInt();
		
		if(input == num) {
			System.out.print("Strings match");
		}else {
			System.out.print("Strings do not match");
		}
		kb.close();
	}
}
