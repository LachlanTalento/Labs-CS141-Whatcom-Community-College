import java.util.*;

public class LTDTGuess {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random rand = new Random();
      
      // Define variables 
      int answer();
      int numTries;
      int bestGuess = 1000000000;
      instructions();  
         
         
      while (answer == 'Y' || answer == 'y') {
         int randomNumber = rand.nextInt(10);
         numTries = playGame();
         sum += numTries;
         if (numTries < bestGuess) {
            bestGuess = numTries;
         }
         
         int r == rand.nextInt(3);
         if (r == 0) {
            System.out.println("Rock");
         } else if (r == 1) {
            System.out.println("Paper");
         } else ( 
            System.out.println("Scissors");
         }
         // need to figure the best guess for each game
         // need to keep count of number of games
         
         // Prompt user, Would you like to go again
         // get the responese and assign to answer
      } // end of while loop
   } // end of main
   
   public static void instructions(){
      
   } // end of instructions
   public static void playGame() {
      
      Random rand = new Random();
      int numTries = 0;
      int randomNumber = rand.nextInt(100) + 1;
      
   while (random != choice) {
      if (choice > random) {
         numTries++;
      } else if (choice < random) {
         numTries++;
      }
      }
      return numTries;
      
   }
   public static void summary() {
      
   }
   
} // end of class