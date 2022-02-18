// Lachlan Talento
// 2/15/22
// CS &141
// Assignment #1 Calendar
//
// This program will do the following: create a calendar
//
// For extra credit, I made the calendar go to only 31 days and I created my own buggati car from scratch.
//
// I got all this working, but I couldn't seem to figure out out how to offset the dates each month like a real calendar,
// and I also couldn't figure out an easier way to print out my ascii art instead of a bunch of println statements.

import java.util.*; // Import Scanner

public class LTCalendar {
   public static void main(String[] args){ 
   
      // initializing variables
      int firstDay = 1;
      int endDay = firstDay + 6;

      Scanner input = new Scanner(System.in); // Creating Scanner
      
      System.out.println("Please enter the month and date (mm/dd): ");
      String date = input.next(); // (mm/dd)
      char month1 = date.charAt(0);
      char month2 = date.charAt(1);
      char day1 = date.charAt(3);   
      char day2 = date.charAt(4);   
      
      System.out.println(); // Spacing
      
      car(); // Prints Picture of a Bugatti car
      
      System.out.println(); // Spacing
      
      if (month1 == '0') { // Prints Month
         System.out.println("                                                                      " + month2);
      } else {
         System.out.println("                                                                      " + month1 + month2);
      } // End Else Statement   
        
      // Draw Calendar
         for (int i = 1; i <= 5; i++){
            if (endDay < 31) {
               line(1);
               date(firstDay,endDay, 1);
               space(1);
               space(1);
               firstDay = firstDay + 7;
               endDay = firstDay + 6;
            } else {
               line(1);
               date(firstDay,endDay, 2);
               space(2);
               space(2);
            }
     } // End of Loop
     
     line(2); // Creates bottom line of the calendar

     System.out.println(); // Spacing
     
     // Print Date
     if (month1 == '0') { // Prints Month
         System.out.println("Month: " + month2);
     } else {
         System.out.println("Month: " + month1 + month2);
     } // End Else Statement
      
     if (day1 == '0') { // Prints Day
         System.out.println("Day: " + day2);
     } else {
         System.out.println("Day: " + day1 + day2);
     } // End Else Statement
   } // End of Main Method
   
   
   public static void line(int num){ // Line Method
         if (num == 1) {
            for (int i = 1; i <= 140; i++)
            {
               System.out.print("=");
            }
   
            System.out.println(); // Spacing
         } else {
            for (int i = 1; i <= 60; i++)
            {
               System.out.print("=");
            }
   
            System.out.println(); // Spacing
         }
   } // End of Line Method
   
   
   
   public static void date( int begin, int end, int num) { // Date Method
         if (num == 1) {
            for (int i = begin; i <= end; i++) {
               if (i >= 10) {
                  System.out.print("|" + i + "                 ");
               } else {
                  System.out.print("|" + i + "                  ");
               }
            } // End of For Loop
            
               System.out.println("|");
               
         } else {
            for (int i = begin; i <= 31; i++) {
               if (i >= 10) {
                  System.out.print("|" + i + "                 ");
               } else {
                  System.out.print("|" + i + "                  ");
               }
            } // End of For Loop
            
               System.out.println("|");
               
           }
   } // End of Date Method
   
   
   
      public static void space(int num){ // Spacing Method
         if (num == 1) {
            for (int i = 1; i <= 7; i++){
      
               System.out.print("|                   ");
      
            } // End of For Loop
            
            System.out.println("|");
            
         } else {
            for (int i = 1; i <= 3; i++){
      
               System.out.print("|                   ");
      
            } // End of For Loop
            
            System.out.println("|");
            
         }
   } // End of Space Method
   
   
   public static void car(){ // Car Method
      System.out.println("                              ..--------------------------------------------------------___");
      System.out.println("             ,________------_|                                                   _____-----\\___");
      System.out.println("       _-----             _|                       _______             _____-----              \\___      _");
      System.out.println("       \\                _|          ________-------       ---__      \\                             \\___ | -_");
      System.out.println("        \\             _|           /                           \\      \\                                \\_|_ \\");
      System.out.println("         ----------__-            |                            | \\     \\                                   \\/________________");
      System.out.println("             ___---              |                   ___      |   \\     \\                                   \\                -_");
      System.out.println("        .--''                     |_             __--   |     |    \\     \\                      _____________)                 -_");
      System.out.println("       :                            ------------|__      |_____|_____\\    \\_____________--------                                 -_");
      System.out.println("       |                                           -----\\ |__                          __                                          -_");
      System.out.println("       |  _- _____ -_                                    |__/                         |  \\                                          _-_");
      System.out.println("       | / .'     '. \\                                                                |_ |_                                        <___-_");
      System.out.println("       |/(/         \\)\\___ ________                                 __- ________ -__    -_ -_                                           /");
      System.out.println("       |(|           |)|  '--______\\                               /  .'        '.  \\     -_ -_________                     __         /");
      System.out.println("       |(|           |)|       |vvvv\\                       _____ /(|              |)\\      -__________>                  /vvvv\\     /");
      System.out.println("        (|           |)\\       |vvv--.______               /     /(|                |)\\                                 /vvvvvvvv\\_--\\");
      System.out.println("        (|           |)}\\      |/____       '------.______/     |(|                  |)\\____          _________________ |vvvvvvvv||vvv\\");
      System.out.println("         (\\         /)}} \\____       '------.______      /      |(|                  |) \\   \\        /vvvvvvvvvvvvvvvvv| |vvvvvvvv||vvv\\");
      System.out.println("           '._____.'}}}       '------._______      '----'       |(|                  |)}|    \\      /vvvvvvvvvvvvvvvvvv| |vvvvvvv_||.-- |");
      System.out.println("                                            '------._______     \\(|                  |)}|     \\    /vvvvvvvvvvvvvvvvvvv|  |vv---'      |");
      System.out.println("                                                           '-----\\(|                |)}}|      \\  ---------------------   '--'   ____--");
      System.out.println("                                                                   (|              |)}}}\\_______\\___________________ _________---");
      System.out.println("                                                                      '.________.'}}}}     '----.__________________/  ");
   } // End of Car Method
} // End of Class










