import java.awt.*;

public class LTCafeWall {
   public static void main(String[] args){
      DrawingPanel panel = new DrawingPanel(650, 400);
      panel.setBackground(Color.LIGHT_GRAY);
      Graphics g = panel.getGraphics();
         
      row(20, 0, 0, g, 4, 1); // Upper-Left
      row(30, 50, 70, g, 5, 1); // Mid-Left
      row(25, 10, 150, g, 4, 8);
      
   } // End of Main
   
   public static void row(int boxSize, int blackBoxX, int y, Graphics g, int pairs, int repeats) {
      for (int count = 1; count <= repeats; count++) { // Creates the Rows
         for (int i = 1; i <= pairs; i++) { // Creates the Pairs
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
         } // End of For Loop
         
         y += boxSize + 2;
         blackBoxX -= boxSize * pairs * 2;
      } // End of For Loop
   } // End of row Method
} // End of Class
