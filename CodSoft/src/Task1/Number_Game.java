package Task1;
import java.util.Random;
import java.util.Scanner;
public class Number_Game {

	public static void main(String[] args) {
		System.out.println("Enter a number between 1 to 100: ");
		Scanner scan=new Scanner(System.in);
		
		boolean guess_correct = false;
		int attempt=0;
		
		int num,number;
		Random random=new Random();
		
		num=random.nextInt(100);
		number=num+1;
		
		while(!guess_correct && attempt<5) {
			
		int input=scan.nextInt();
		if(number==input) {
			guess_correct=true;
		}
		else {
			attempt++;
			if(input<number) {
				System.out.println("Your choice is low");
			}
			else {
				System.out.println("Your choice is high");
			}

		  }
		
		}
		scan.close();
		if(guess_correct) {
			System.out.println("You guessed correctly.The number was " + number);
		}
		else {
	     	System.out.println("Sorry, You've exhausted all your attempts. The correct answer was " + number);
	}

  }
}

