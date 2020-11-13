
import javax.swing.*;
 
public class Summation 
{
   private int i ;
   private int sum ;
   public int summation(int x)
   {
           	        
      while(i <= x)
      {
         sum = sum +i;
         i++;
      }
      return sum ;
   } 
   public static void main(String[] args)
   {
      Summation z = new Summation();
      int number = new Integer(JOptionPane.showInputDialog("Enter the number of terms :")).intValue(); 
      JOptionPane.showMessageDialog(null, "The sum of the first " + number + " natural terms is = " + z.summation(number) );
   }
}
