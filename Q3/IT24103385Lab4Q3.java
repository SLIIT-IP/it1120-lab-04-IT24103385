import java.util.Scanner;
public class IT24103385Lab4Q3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int number = input.nextInt();

		String answer = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
		
		System.out.print("The number is: " + answer);
		System.out.println();
	}
}


