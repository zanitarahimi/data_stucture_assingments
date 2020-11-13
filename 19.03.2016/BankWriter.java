import java.awt.*;
import javax.swing.*;
import java.text.*;


public class BankWriter extends JPanel
{ private int gjersia = 600; 
   private int lartesia = 300;
   private BankAccount llogaria; 
   private String  transaksioni_fundit = ""; 
  

   public BankWriter(String titulli, BankAccount b)
   { llogaria = b;
      JFrame korniza = new JFrame();  
      korniza.getContentPane().add(this);
      korniza.setTitle(titulli);
      korniza.setSize(gjersia, lartesia);
      korniza.setVisible(true);
       }

   public void paintComponent(Graphics g)
   {g.setColor(Color.yellow);
      g.fillRect(0, 0,gjersia, lartesia); 
      g.setColor(Color.black);
      int teksti= 40;
      int teksti_poshte = 40;
      
      Font lloji_shkronjave = new Font("shkrimi",Font.BOLD,30);
      setFont(lloji_shkronjave);
      
      g.drawString(transaksioni_fundit,teksti , teksti_poshte);
      g.drawString("Balanci aktual  = " + konvertimi(llogaria.kthe_balansin())+ " €" ,teksti , teksti_poshte + 30);
    
   }


   private String konvertimi(int k)
   { double euro_ne_cent = k / 100.00;
      return new DecimalFormat("0.00").format(euro_ne_cent);
   }
   
 
   public void transaksioni(String porosia, int shuma )
   {transaksioni_fundit = porosia + " " + konvertimi(shuma);
      this.repaint();
   }


   public void transaksioni(String porosia)
   { transaksioni_fundit = porosia;
      this.repaint();
   }
   
}