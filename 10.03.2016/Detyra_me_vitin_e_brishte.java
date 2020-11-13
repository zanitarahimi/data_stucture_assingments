//Autor : Zanita Rahimi
//Cdo vit i cili saktesisht plotepjestohet me 4 eshte vit i brishte.
//Perjashtim bejne vitet te cilet plotepjestohen me 100.
//Vitet e ketij shekulli jane vite te brishta nese plotepjestohen ose me 4 ose me 400.
//Keshtu p.sh vitet 1700,1800,1900 nuk jane vite te brishta , perderisa viti 2000 (qe i takon ketij shekulli) eshte vit i brishte.

import javax.swing.JOptionPane;

public class Detyra_me_vitin_e_brishte 
{

   public static void main (String[] args)
   {
      int viti_i_brishte = new Integer(JOptionPane.showInputDialog("Shkruani nje vit : ")).intValue();
      String a = "Viti " + viti_i_brishte + " eshte vit i brishte." ;
      String b = "Viti " + viti_i_brishte + " nuk eshte vit i brishte." ;
   
   	
      if ( viti_i_brishte%100!=0 )
          
      { 
         if( viti_i_brishte%4==0 )
            
         {
            
            JOptionPane.showMessageDialog(null, a);
            
         }
            
         else
         {
            if ( viti_i_brishte%400==0)
            
               JOptionPane.showMessageDialog(null , a);
             
            else
             	
            {
               JOptionPane.showMessageDialog(null, b);
            }
         }
      }
   }
}
	

