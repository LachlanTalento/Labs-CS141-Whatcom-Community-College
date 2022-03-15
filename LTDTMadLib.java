// Lachlan Talento and Donovan Talento
// 3/15/22
// CS &141
// Lab #5 MadLib
//
// This program will do the following:
//
// We got all this working, but

import java.io.*; // Import input and output
import java.util.*; // import Scanner

public class LTDTMadLib {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      // Initializing Variables
      boolean run = true;
      boolean run1 = true;
      
      intro();
      
      do {
      char option = menu(input);
      switch (option) {
         case 'c':
         case 'C':
            String inputFileName = readInput(input, run);
            String outputFileName = readOutput(input, run);
            
            readInput();
            break;
         case 'v':
         case 'V':
            viewML();
            break;
         case 'q':
         case 'Q':
            run = false;
            break;
         default:      
            System.out.println("\nPlease Type a Valid Command.");
      }
      
      } while (run == true);
   }
   public static void intro() {
      System.out.println("Welcome to the game of Mad Lib.");
      System.out.println("I will ask you to provide various words");
      System.out.println("and phrases to fill out a story.");
      System.out.println("The result will be written to an output file.\n");
   }
   public static char menu(Scanner input) {
      System.out.print("(C)reate mad-lib, (V)iew mad-lib, (Q)uit? ");
      
      String x = input.next();
      char option = x.charAt(0);
      
      return option;
   }
   public static String readInput(Scanner input, boolean run) {
      String inputFileName;
      
      do {
         System.out.print("Input file name: ");
         inputFileName = input.next();
         File file = new File (inputFileName);

         if (file.exists()) {
            run = false;
         } else {
            System.out.println("File not found.");
         }
         } while (run == true); 
         
      return inputFileName;
   }
   public static String readOutput(Scanner input, boolean run) {
      String outputFileName;
      do {
         System.out.print("Output file name: ");
         outputFileName = input.next();
         File file = new File (outputFileName);

         if (file.exists()) {
            run = false;
         } else {
            System.out.println("File not found.");
         }
         } while (run == true); 
         
      return outputFileName;
   }
   public static void readInput() {
   
   }
   public static void viewML() {
      
   }
}
