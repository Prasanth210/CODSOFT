package Task2;
import java.util.Scanner;
public class STUDENT_GRADE_CALCULATOR {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of Subject : ");
        int numberOfSubjects=scan.nextInt();
        int[] marks = new int[numberOfSubjects];
        int tot_mark=0;
        
        for (int i=0;i<numberOfSubjects;i++) {
        	System.out.println("Enter the mark scored in Subject "+(i+1)+" : ");
        	marks[i]= scan.nextInt();
        	tot_mark += marks[i];
        }
        double percentage=(double)tot_mark/(numberOfSubjects * 100)*100;
        System.out.println("Total marks scored = "+tot_mark);
        System.out.println("Percentage scored = "+percentage +"%");
       
        scan.close();
	      
        	 if (percentage >= 90) {
        		 System.out.println("You Got A Grade");
        	 }
        	 else if(percentage >= 80) {
        		 System.out.println("You Got B Grade");
        	 }
        	 else if(percentage >= 70) {
        		 System.out.println("You Got C Grade");
        	 }
        	 else if(percentage >= 60) {
        		 System.out.println("You Got D Grade");
        	 }
        	 else if(percentage >= 50) {
        		 System.out.println("You Got E Grade");
        	 }
        	 else if(percentage < 50) {
        		 System.out.println("Sorry you have failed in Exam");
        	 }
         
	}

}
