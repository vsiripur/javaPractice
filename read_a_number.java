import java.util.Scanner;
public class read_a_number {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		char name = in.nextLine();
		System.out.print("Please enter your age: ");
		int age = in.nextInt();
		System.out.print("Please enter your mobile number: ");
		char m_num = in.nextLine();
		System.out.print("User name: " + name);
		System.out.print("User age: " + age);
		System.out.print("User mobile number: " + num);
		System.out.print("Please enter a number: ");
		int num = in.nextInt();
		System.out.println("The number you've entered is: " + num);
	}
}
