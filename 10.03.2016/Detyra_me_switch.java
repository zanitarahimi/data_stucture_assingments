//Autor : Zanita Rahimi

import javax.swing.JOptionPane;

public class Detyra_me_switch 
{

	public static void main(String[] args)
    {
	    String hyrja = JOptionPane.showInputDialog("Shkruani numrin e pikeve qe keni grumbulluar ne provim : " );
	    int numri_i_pikeve = new Integer(hyrja).intValue();
	    
	    double raporti = Math.pow(10, -1) ; //raporti pike-note , raport 10 me 1 . P.sh: 50 pike = E ; 72 pike = C etj.
	    
	    int piket_ne_note = (int) (numri_i_pikeve * raporti);
	    
	    String nota1 = "A";
	    String nota2 = "B";
	    String nota3 = "C";
	    String nota4 = "D";
	    String nota5 = "E";
		
		
		switch (piket_ne_note)
		{
		case 5 : {   
			         JOptionPane.showMessageDialog(null,"Urime , ju keni noten " + nota5);
		             break;
		}
		case 6 : {   
			         JOptionPane.showMessageDialog(null, "Urime , ju keni noten " + nota4);
		             break;
		}
		case 7 : {    
			         JOptionPane.showMessageDialog(null, "Urime , ju keni noten " + nota3);
		             break;
		}
		case 8 : {   
			         JOptionPane.showMessageDialog(null, "Urime , ju keni noten " + nota2);
		             break;
		}
		case 9 : {   
			         JOptionPane.showMessageDialog(null, "Urime , ju keni noten " + nota1);
		             break;
		}
		case 10 : {  
                     JOptionPane.showMessageDialog(null, "Urime , ju keni noten " + nota1);
                     break;
        
		}
		
		default : { JOptionPane.showMessageDialog(null, "Keni rene nga provimi.");
		
		}
		
		}
		
		
    }
}
