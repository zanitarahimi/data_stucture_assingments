import javax.swing.*;

public class iterated_product
{
   public int product(int x, int y)
   { int total = 1;
      if ( x <= y )
      {   total = x;
         int count = x;
         while ( count != y )
         
         { count = count + 1;
           total = total * count;
         }
      
      }
      return total;
   }
   public static void main(String[] args)
   {
   
      iterated_product z = new iterated_product();
      int number1 = new Integer(JOptionPane.showInputDialog("Enter the first nonnegative number")).intValue();
      int number2 = new Integer(JOptionPane.showInputDialog("Enter the second nonnegative number")).intValue();
      JOptionPane.showMessageDialog(null,"The iterated product of the integers " + number1 + " and " + number2 + " is = " + z.product(number1,number2));
   }

}