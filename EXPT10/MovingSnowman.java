

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class MovingSnowman extends JPanel {
int midX = 220;
int midY = 280;
public void paintComponent(Graphics g) {
super.paintComponent(g);
setBackground(new Color(40,144,0));


g.setColor (Color.white);
g.fillOval (midX-20, midY-60, 40, 40); 
g.fillOval (midX-35, midY-25, 70, 50); 
g.fillOval (midX-50, midY+20, 100, 60); 
g.setColor (Color.black);
g.fillOval (midX-10, midY-50, 5, 5); 
g.fillOval (midX+5, midY-50, 5, 5); 
g.drawArc (midX-10, midY-40, 20, 10, 190, 160); 
g.drawLine (midX-25, midY, midX-50, midY-20); 
g.drawLine (midX+25, midY, midX+55, midY); 
g.drawLine (midX-20, midY-55, midX+20, midY-55); 
g.fillRect (midX-15, midY-80, 30, 25); 
}
public static void main(String args[]) {
JFrame frame = new JFrame("Moving Snowman");


frame.add(new MovingSnowman());
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(500,500);
frame.setVisible(true);
}
}


