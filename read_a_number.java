import java.util.Scanner;
public class read_a_number {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		in.nextLine();
		String name = in.nextLine();
		
		System.out.print("Please enter your age: ");
		in.nextLine();
		int age = in.nextInt();
		
		System.out.print("Please enter your mobile number: ");
		in.nextLine();
		String m_num = in.nextLine();

		System.out.println("User name: " + name);
		System.out.println("User age: " + age);
		System.out.println("User mobile number: " + m_num);
	}
}
