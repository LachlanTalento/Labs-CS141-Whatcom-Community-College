// Lachlan Talento and Donovan Talento
// 2/18/22
// CS &141
// Lab #3 CafeWall
//
// This program will do the following: This program will create an illusion made out of black and white tiles.
//
// We got all this working, but we couldn't get the offset made in manner that is easily editable.

import java.awt.*;

public class LTCafeWall {
   public static void main(String[] args){
      DrawingPanel panel = new DrawingPanel(650, 400);
      panel.setBackground(Color.LIGHT_GRAY);
      Graphics g = panel.getGraphics();
         
      row(20, 0, 0, g, 4, 1, 0); // Upper-Left
      row(30, 50, 70, g, 5, 1, 0); // Mid-Left
      row(25, 10, 150, g, 4, 8, 0); // Lower Left
      row(25, 250, 200, g, 3, 6, 1); // Lower Middle
      row(20, 425, 180, g, 5, 10, 1); // Lower Middle
      row(35, 400, 20, g, 2, 4, 3); // Upper Right
      
   } // End of Main
   
   public static void row(int boxSize, int blackBoxX, int y, Graphics g, int pairs, int repeats, int offset) {
          // Creates the Columns
         for (int count = 1; count <= repeats; count++) {
         
             // Creates the Rows
            for (int i = 1; i <= pairs; i++) {
               int whiteBoxX = blackBoxX + boxSize + 1;
               // Black Box
               g.setColor(Color.BLACK);
               g.fillRect(blackBoxX, y, boxSize, boxSize);
               //White Box
               g.setColor(Color.WHITE);
               g.fillRect(whiteBoxX, y, boxSize, boxSize);
               //Blue X
               g.setColor(Color.BLUE);
               g.drawLine(blackBoxX, y, blackBoxX + boxSize, y + boxSize);
               g.setColor(Color.BLUE);
               g.drawLine(blackBoxX + boxSize, y, blackBoxX, y + boxSize);
               
               blackBoxX += boxSize * 2;
               whiteBoxX += boxSize * 2;
            } // End of  Rows For Loop
            
            y += boxSize + 2;
            blackBoxX -= boxSize * pairs * 2;
                
            if (offset == 0) {
            } else if (offset == 1) { 
               blackBoxX += 10;
               offset = 2;    
            } else if (offset == 2) {
               blackBoxX -= 10;
               offset = 1;
            } else if (offset == 3) {
               blackBoxX += 35;
               offset = 4;
            } else if (offset == 4) {
               blackBoxX -= 35;
               offset = 3;
            }
         } // End of Column For Loop
      
   } // End of row Method
} // End of Class
