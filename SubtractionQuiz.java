/** This is SubtractionQuiz program. I am paying particular attention
  * on the first  if { scope to see how to swaping the values assigned 
  *  to vars number1 and number2
  */  

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
	    
      int number1 = (int)(Math.random() * 10); 
	    int number2 = (int)(Math.random() * 10);

      // here in the follow if { scope, I am observing how computer executes
      // the following statements in the top to bottom order.
      if (number1 < number2) {
        int temp = number1;
        number1 = number2;
        number2 = temp;
	    }

	    System.out.print("What is " + number1 + " - " + number2 + "? ");
	    Scanner input = new Scanner(System.in);
	    
      int answer = input.nextInt();

	    if (number1 - number2 == answer)
        System.out.println("You are correct!");
	
      else {
        System.out.println("Your answer is wrong.");
		    System.out.println(number1 + " - " + number2 + " should be " 
                            + (number1 - number2));
      }
    }
}		
