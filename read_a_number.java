import java.util.Scanner;
public class read_a_number {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = in.nextInt();
		System.out.print("The number you've entered is: " + num);
	}
}