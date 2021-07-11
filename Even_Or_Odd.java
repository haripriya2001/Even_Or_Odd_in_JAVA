import java.util.Scanner;
public class Odd_Or_Even {

	public static void main(String[] args) {
		int number;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter T5he Number: ");
		number = s.nextInt();
		if(number % 2 == 0)
		{
			System.out.println(number+" is a even number");
		}
		else{
			System.out.println(number+" is a odd number");
		}

	}

}
