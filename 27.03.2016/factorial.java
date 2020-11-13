import javax.swing.*;
public class factorial 
{
  
	public long Factoriel(int n)
	
	{
    long factoriel = 1; 
	if ( n >= 0  )
	{ int number = 0; 
	
   while ( number != n )

	{ number = number + 1;
	factoriel = factoriel * number;
	}

	}
	return factoriel;
	}
   public static void main(String[] args)
   {
      factorial z =new factorial();
      int number = new Integer(JOptionPane.showInputDialog("Enter a nonnegative integer")).intValue();
      JOptionPane.showMessageDialog(null,  "Factorial of number " + number + " is " + z.Factoriel(number));
   }
}
