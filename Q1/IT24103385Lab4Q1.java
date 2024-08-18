import java.util.Scanner;
public class IT24103385Lab4Q1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int number;
		System.out.print("Enter a number : ");
		number = input.nextInt();

		if (number>0) {
			System.out.print("The number is: Positive");
			System.out.println();
		}
		
		
		else if (number<0) {
			System.out.print("The number is: Negative");
			System.out.println();
		}
		

		else {
			System.out.print("The number is Zero");
			System.out.println();
		}
		
		input.close();
	}
}
			