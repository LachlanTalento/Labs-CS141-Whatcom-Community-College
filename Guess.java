import java.util.Scanner;

public class Guess {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      // Define variables 
      
      instructions();  
         
         
      while (answer == 'Y' || answer == 'y') {
         numTries = playGame();
         sum += numTries;
         // need to figure the best guess for each game
         // need to keep count of number of games
         
         // Prompt user, Would you like to go again
         // get the responese and assign to answer
      } // end of while loop
   } // end of main
   
   public static void instructions(){
      
   } // end of instructions
   public static void playGame() {
      
   }
   public static void summary() {
      
   }
   
} // end of class