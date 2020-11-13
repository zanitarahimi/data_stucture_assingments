import javax.swing.*;
public class Detyra_8_3_2
{
   public static void main(String[] args)
   {
      int qelsi = new Integer(JOptionPane.showInputDialog("Cili eshte qelsi ?")).intValue();
      int vargu[] = new int[27];
      vargu[0] = qelsi;
      char vargu_i_karaktereve[] = new char[27];
      vargu_i_karaktereve[0] = ' ';
      vargu_i_karaktereve[1] = 'a';
      
      //inicializimi i vargjeve
      for(int i = 1 ; i < vargu.length ; i++)
      {
         vargu[i] = (vargu[i-1] * 2) + 1 ;
      
         if(i==1)
         {
         }
         else
         {
            vargu_i_karaktereve[i] = (char)(vargu_i_karaktereve[i-1]+1);
         }
         
         System.out.println(vargu[i] + " " + vargu_i_karaktereve[i]); 
      }
      int sa = new Integer(JOptionPane.showInputDialog("Sa karaktere i ka fjalia?")).intValue();
      int z = 0;
      int save = -1;//save e run poziten
      
      //dekodimi i fjalise
      for(int j = 0; j < sa ; j++) 
      {
         int numri = new Integer(JOptionPane.showInputDialog("Shkruani numrin")).intValue();
         
         while(z < vargu.length)//0-27
         {
            if(numri == vargu[z])
            {
               save = z;
            }
            z++;
         }
         //z = 27
         
         if(save==-1)
         {
            System.out.println("Numri i dhene nuk paraqet asnje karakter");
         }
         else
         {
            System.out.print(vargu_i_karaktereve[save]);
         }
         z=0;//per herat e tjera te testimit
         save = -1;//ne rast te mosperputhjes se numrave
         
      }       
      
   }
}