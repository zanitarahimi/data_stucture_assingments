import javax.swing.*;
public class Detyra_me_letra
{
   public static void main(String[] args)
   {
      String shenja[] = new String[5];
      shenja[1] = "zemer";
      shenja[2] = "katror";
      shenja[3] = "peme";
      shenja[4] = "gjeth";
      
        
      int numri_i_lojtareve = new Integer(JOptionPane.showInputDialog("Sa lojtar do te luajne?")).intValue();
      // letrat e lojtarit te pare
      
      for(int i=0 ; i<numri_i_lojtareve ; i++)
      {
         int j = 0 ; //
         
         System.out.println("Lojetari : " + (i+1) + "\n");
         
         while(j<5) //5 letra per secilin lojetar
         {
            int b =(int)((Math.random()*12) + 1);
            int c =(int)((Math.random()*4) + 1);
         
            
            System.out.print("Numri : " + b + " Shenja : " +  shenja[c] + "\n");
         
            j++;
         }
         System.out.println(" ");
         System.out.println(" ");
         System.out.println(" ");
         
      }
   
   }
}