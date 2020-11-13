import javax.swing.JOptionPane;

public class Detyra_me_votimin_e_dy_kandidateve
{
	public static void main(String[]args)
	{
    int vlera = 5 ;
    int numero_votat = 0 ;
    
    while (numero_votat < vlera)
	{ 
    JOptionPane.showMessageDialog(null, " Pershendetje! \nKy eshte nje proces elektronik i votimit. \nKemi dy kandidat: \n1.Kandidati i pare \n2.Kandidati i dyte. \nJu lutem shtypni OK per te vazhduar!" );
    JOptionPane.showMessageDialog(null, " Per te pasur privilegjin e votimit , ju duhet te keni se pak 18 vjet ;\nTe jeni shtetas i Republikes se Kosoves ;\nSi dhe duhet te keni ndonje mjet identifikimi me vete.");
    
    Object[] cakto = {"Femer","Mashkull"};
    Object gjinia = JOptionPane.showInputDialog(null, "Zgjedhni njeren :", "Procesi i votimit", JOptionPane.INFORMATION_MESSAGE, null, cakto, cakto[0]);
    
    String emri = JOptionPane.showInputDialog("Ju quheni : (Emri Mbiemri)");
    
    Object[] qyteti = { "Prishtina" , "Mitrovica" , "Peja" , "Prizreni" , "Gjakova" , "Ferizaj","Gjilan" };
    Object komuna = JOptionPane.showInputDialog(null,"Ju lutem zgjedhni komunen ne te cilen jetoni","Procesi i votimit",JOptionPane.INFORMATION_MESSAGE, null,qyteti,qyteti[0]);
    
    String s = JOptionPane.showInputDialog("Sa vite keni ?");
    
    int mosha = new Integer(s).intValue();
    
    if (mosha < 18)
    {
    	JOptionPane.showMessageDialog(null,"Ju nuk mund te votoni , pasi keni "+ mosha+" vjet");
    }
    
    else
    	
    {  
    	JOptionPane.showMessageDialog(null,"Emri dhe mbiemri : " + emri + "\nGjinia : " + gjinia + "\nMosha : " + mosha +  "\nVendlindja : " + komuna);
    	
    	Object[] kandidatet = { "Kandidati i pare", "Kandidati i dyte "};
    	Object perzgjedhja = JOptionPane.showInputDialog(null,"Zgjedhni njerin nga kandidatet", "Procesi i votimit",JOptionPane.INFORMATION_MESSAGE, null,kandidatet, kandidatet[0]);
    	
    	System.out.println(perzgjedhja);
        
    	JOptionPane.showMessageDialog(null, "Qytetar i nderuar , vota juaj u regjistrua. Ju votuat per " + perzgjedhja);
	}

	
   
	}
 }

}

