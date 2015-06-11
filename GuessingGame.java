import java.util.Scanner;
public class GuessingGame {

   public static void main(String[] args) {
	  @SuppressWarnings("resource")
	  Scanner input = new Scanner(System.in);
      System.out.println("Try to gueess number between 1 and 100.");
      playGame();
      boolean win = false;
      boolean running = true;
      
      System.out.println("Would you like to play again y/n?");
      String playAgain = input.next();
      if (playAgain.equalsIgnoreCase("y")) {
          playGame();
          running = true;
          win = false;
      } else {
          running = false;
          System.out.println("Game over");
      }
   }
    
   /**
    * @randomNUmber - A random number picked by the computer.
    * @numberGuess - Number input by player
    * @counter - counting number of guesses
    */
   public static void playGame() {
       int randomNumber; 
       int numberGuess;     
       int counter; 
   
       randomNumber = (int)(100 * Math.random()) + 1;
      
       counter = 0;
       System.out.println();
       System.out.print("What is your first guess? ");
       
       while (true) {
    	  @SuppressWarnings("resource")
		  Scanner scan = new Scanner(System.in);
          numberGuess = scan.nextInt();  
          counter++;
          if (numberGuess == randomNumber) {
             System.out.println("You got it in " + counter
                     + " guesses!  My number was " + randomNumber);
             break;  
          }
          if (counter == 5) {
             System.out.println("You didn't get the number in 10 guesses.");
             System.out.println("You lose.  My number was " + randomNumber);
             break;  
          }
          
          if (numberGuess < randomNumber)
             System.out.print("That's too low.  Try again: ");
          else if (numberGuess > randomNumber)
             System.out.print("That's too high.  Try again: ");
       }
    
   }
               
} 