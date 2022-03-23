// Lachlan Talento and Donovan Talento
// 3/15/22
// CS &141
// Lab #5 MadLib
//
// his program will prompt the user for different types of words that will replace the placeholders within a Mad Lib text.
//
// We got all this working, but we weren't able to start each sentence on a new line for the output text

import java.io.*; // Import input and output
import java.util.*; // import Scanner

public class LTDTMadLib {
   public static void main(String[] args) throws FileNotFoundException {
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
            createML(input);
            break;
         case 'v':
         case 'V':
            viewML(input);
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
   public static char menu(Scanner input) throws FileNotFoundException{
      System.out.print("(C)reate mad-lib, (V)iew mad-lib, (Q)uit? ");
      
      String x = input.next();
      char option = x.charAt(0);
      
      return option;
   }
   public static void createML(Scanner input) throws FileNotFoundException {
      System.out.println("Input file name: ");
      String nameIn = input.next();
      File f1 = new File(nameIn);
      
      while(!f1.exists()) {
         nameIn = input.next();
      }
      
      System.out.println("Output file name: ");
      String nameOut = input.next();
      File out = new File(nameOut);
      PrintStream output = new PrintStream(out);
      
      Scanner answers = new Scanner(f1);
      String allFile = "";
      
      while(answers.hasNext() || answers.hasNextLine()) {
         allFile = answers.nextLine() + "\n";
      
         
      Scanner answers2 = new Scanner(allFile);
      while(answers2.hasNext()){
         String text = answers2.next();

         if(text.startsWith("<") && text.endsWith(">")){
            char a = text.charAt(1);
            //String vowels = vowels(a);
            text = text.replace('<', ' ');
            text = text.replace('>', ' ');
            text = text.replace('-', ' ');
            System.out.println("Please type" + text + ":");
            String in = input.next();
            output.print(" " + in + " ");
         } else {
            output.print(" " + text + " ");
//             allFile = allFile.replaceFirst("<"+text+">", in);
//             allFile = allFile.replace(" .", ".");
//             
         }
         
      }
      output.println();
//             output.print(allFile);
         }
   }
   public static void viewML(Scanner input) throws FileNotFoundException{
      System.out.println();
      Scanner prev = new Scanner(System.in);
      System.out.println("Enter file name: ");
      File f = new File(prev.nextLine());
      
      while(!f.canRead()) {
         System.out.println("No such file name, please try again.");
         f = new File(prev.nextLine());
      }
      
      Scanner console = new Scanner(f);
      while(console.hasNext() || console.hasNextLine()) {
         String next = console.nextLine();
         System.out.println(next);
      }
   }
   public static void vowels() { // replaces an for a if word starts with vowel
      
   }
}
