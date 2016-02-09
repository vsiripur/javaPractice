import java.util.Scanner;
class read_a_number
{
	public static void main(String args[])
	{
		int num;
		float fnum;
		String str;

		Scanner in = new Scanner(System.in);

		//Get input String
		System.out.print("Enter a string: ");
		str = in.nextLine();
		System.out.println("Input String is: "+str);

		//Get input Integer
		System.out.print("Enter an integer: ");
		num = in.nextInt();
		System.out.println("Input Integer is: "+num);

		//Get input float number
		System.out.print("Enter a float number: ");
		fnum = in.nextFloat();
		System.out.println("Input Float number is: "+fnum);
	}
}