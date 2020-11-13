import java.awt.*;
import javax.swing.*; 
 
public class AnimationWriter extends JPanel 
{
   private BoxWriter boxWriter; 
   private BallWriter ballWriter; 
   
   public AnimationWriter(BoxWriter b, BallWriter l, int size) 
   {
      boxWriter = b; 
      ballWriter = l;
      JFrame f = new JFrame();
      f.getContentPane().add(this);
      f.setTitle("Bounce"); 
      f.setSize(size, size + 30);
      f.setVisible(true); }

   public void paintComponent(Graphics g) 
   {  boxWriter.paint(g);
      ballWriter.paint(g); 
      Font zanita = new Font("anything" , Font.PLAIN , 30);
      setFont(zanita);
      g.setColor(Color.black);
      g.drawString("Bouncing Balls" , 4 , 230);

      }
}