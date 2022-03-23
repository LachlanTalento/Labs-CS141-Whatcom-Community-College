// Lachlan Talento
// 3/8/22
// CS &141
// Assignment #2 Calendar
//
// This program will do the following: create a calendar
//
// I couldn't get the monthFromDate and dayFromDate to work, because there was a bug happening.
// I also couldn't get current, next, and previous month working.

import java.util.*; // Import Scanner
import java.text.*; // 

public class LTCalendar2 {
   public static void main(String[] args){ 
   
      // initializing variables
      int firstDay = -2;
      int endDay = firstDay + 6;
      boolean power = true;
      int month = 0;
      int day = 0;

      Scanner input = new Scanner(System.in); // Creating Scanner
      Calendar cal = Calendar.getInstance(); // Creating Calendar
      
      do { // Program Menu
         System.out.println("Please type a command");
         System.out.println("\t'e' to enter a date and display the corresponding calendar");
         System.out.println("\t't' to get todays date and display the today's calendar");
         System.out.println("\t'n' to display the next month");
         System.out.println("\t'p' to display the prvious month");
         System.out.println("\t'q' to quit the program");
         
         char command = input.next().charAt(0);
         
         
         switch (command) {
            case 'e':
                  System.out.println("Please enter the month and date (mm/dd): ");
                  String date = input.next(); // (mm/dd)
                  
                  String m = date.substring(0, 2);
                  String d = date.substring(3, 5);
                  
                  month = Integer.parseInt(m);
                  day = Integer.parseInt(d);
                  
                  displayCalendar(month, firstDay, endDay, day);
                break;
              case 't':
                  SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
                  String formattedDate = sdf.format(cal.getTime());
                  
                  month = cal.get(Calendar.MONTH) + 1;
                  day = cal.get(Calendar.DATE);
                  
                  displayCalendar(month, firstDay, endDay, day);
                break;
            case 'n':
                  if (month == 0) {
                     System.out.println("Please press 'e' or 't' to get a date.\n");
                  } else if (month == 12) {
                     month = 1;
                     
                     displayCalendar(month, firstDay, endDay, day);
                  } else {
                     month++;
                     
                     displayCalendar(month, firstDay, endDay, day);
                  }
                break;
            case 'p':
                  if (month == 0) {
                     System.out.println("Please enter a date or use todays date.\n");
                  } else if (month == 1) {
                     month = 12;
                     
                     displayCalendar(month, firstDay, endDay, day);
                     
                     printDate(month, day);
                  } else {
                     month--;
                     
                     displayCalendar(month, firstDay, endDay, day);
                     
                     printDate(month, day);
                  }
                break;
            case 'q':
                  power = false;
                break;
            default:
                break;
         }
         } while (power == true);

      } // End of Main Method
   
   
   public static void line(){ // Line Method
      for (int i = 1; i <= 133; i++)
      {
        System.out.print("=");
      }
      System.out.println(); // Spacing
   } // End of Line Method
   
   
   
   public static void date( int begin, int end, int num) { // Date Method
         if (num == 1) {
            for (int i = begin; i <= end; i++) {
               if (i > 31) {
                  System.out.print("|                  ");
               } else if (i >= 10) {
                  System.out.print("|" + i + "                ");
               } else if (i < 1) {
                  System.out.print("|                  ");
               } else {
                  System.out.print("|" + i + "                 ");
               }
            } // End of For Loop       
            System.out.println("|");      
         }
   } // End of Date Method
   
   
   
      public static void space(int num){ // Spacing Method
         if (num == 1) {
            for (int i = 1; i <= 7; i++){
      
               System.out.print("|                  ");
      
            } // End of For Loop
            
            System.out.println("|");
            
         } else {
            for (int i = 1; i <= 3; i++){
      
               System.out.print("|                  ");
      
            } // End of For Loop
            
            System.out.println("|");
            
         }
         
         return;
   } // End of Space Method
   
   
   public static void car(){
      System.out.println("                          ..--------------------------------------------------------___");
      System.out.println("         ,________------_|                                                   _____-----\\___");
      System.out.println("   _-----             _|                       _______             _____-----              \\___      _");
      System.out.println("   \\                _|          ________-------       ---__      \\                             \\___ | -_");
      System.out.println("    \\             _|           /                           \\      \\                                \\_|_ \\");
      System.out.println("     ----------__-            |                            | \\     \\                                   \\/________________");
      System.out.println("         ___---              |                   ___      |   \\     \\                                   \\                -_");
      System.out.println("    .--''                     |_             __--   |     |    \\     \\                      _____________)                 -_");
      System.out.println("   :                            ------------|__      |_____|_____\\    \\_____________--------                                 -_");
      System.out.println("   |                                           -----\\ |__                          __                                          -_");
      System.out.println("   |  _- _____ -_                                    |__/                         |  \\                                          _-_");
      System.out.println("   | / .'     '. \\                                                                |_ |_                                        <___-_");
      System.out.println("   |/(/         \\)\\___ ________                                 __- ________ -__    -_ -_                                           /");
      System.out.println("   |(|           |)|  '--______\\                               /  .'        '.  \\     -_ -_________                     __         /");
      System.out.println("   |(|           |)|       |vvvv\\                       _____ /(|              |)\\      -__________>                  /vvvv\\     /");
      System.out.println("    (|           |)\\       |vvv--.______               /     /(|                |)\\                                 /vvvvvvvv\\_--\\");
      System.out.println("    (|           |)}\\      |/____       '------.______/     |(|                  |)\\____          _________________ |vvvvvvvv||vvv\\");
      System.out.println("     (\\         /)}} \\____       '------.______      /      |(|                  |) \\   \\        /vvvvvvvvvvvvvvvvv| |vvvvvvvv||vvv\\");
      System.out.println("       '._____.'}}}       '------._______      '----'       |(|                  |)}|    \\      /vvvvvvvvvvvvvvvvvv| |vvvvvvv_||.-- |");
      System.out.println("                                        '------._______     \\(|                  |)}|     \\    /vvvvvvvvvvvvvvvvvvv|  |vv---'      |");
      System.out.println("                                                       '-----\\(|                |)}}|      \\  ---------------------   '--'   ____--");
      System.out.println("                                                               (|              |)}}}\\_______\\___________________ _________---");
      System.out.println("                                                                 '._________.'}}}}     '----.__________________/  ");
   } // End of Car Method
      
   public static void displayCalendar(int month, int firstDay, int endDay, int day) {
      System.out.println("                                                                      " + month);
      
      System.out.println(); // Spacing
      
      car(); // Prints Picture of a Bugatti car
      
      System.out.println();
      
      for (int i = 1; i <= 5; i++){
         if (endDay < 35) {
         line();
         date(firstDay,endDay, 1);
         space(1);
         space(1);
         firstDay = firstDay + 7;
         endDay = firstDay + 6;
         } else {
         line();
         date(firstDay,endDay, 2);
         space(2);
         space(2);
         }
      } // End of Loop
        
      line(); // Creates bottom line of the calendar
      
      System.out.println(); // Spacing
      printDate(month, day);
      }
      
      public static void printDate(int month, int day) {
         System.out.println("Month: " + month);
         System.out.println("Day: " + day);
        
         System.out.println();
      }
} // End of Class










