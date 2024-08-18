import java.util.Scanner;
public class IT24103385Lab4Q2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the exam marks (out of 100): ");
		int ExamMark = input.nextInt();

		if (ExamMark<0||ExamMark>100) {
			System.out.print("Invalid input for exam marks. Terminating program.");
			return;
    		}
		
		System.out.print("Please enter the exam marks (out of 100): ");
		int LabMark = input.nextInt();

		if (LabMark<0||LabMark>100) {
			System.out.print("Invalid input for Lab marks. Terminating program.");
			return;
		}

		System.out.print("Please enter the percentage given for the exam: ");
		int ExamMarkPer = input.nextInt();

		System.out.print("Please enter the percentage given for the Lab submission: ");
		int LabMarkPer = input.nextInt();
	
		if (ExamMarkPer+LabMarkPer != 100) {
			System.out.print("The Percentage must add up to 100. Terminating program.");
			return;	
		}

		double FinalMarks = (ExamMark * ExamMarkPer / 100) + (LabMark * LabMarkPer / 100);
		System.out.println();
       	 	System.out.printf("Final Exam Mark is: %.1f\n", FinalMarks);

		input.close();		
	}
}
			

