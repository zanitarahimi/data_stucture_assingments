
public class Sines_Cosinus
{
   factorial z = new factorial();
	
   public double cosine(double x)
   {
      double cos = x;
      int count = 2;
      while(count<=20){
         double v =Math.pow(x, count) / z.Factoriel(count);
         if((count%2)==0){
            cos-= v;
         }
         else{
            cos+= v;
         }count = count+2;
      }
      return cos;
   }
	
	
   public double sines(double x)
   { double sin = x;
      int count = 3;
      while ( count <= 19 )
      { double d = Math.pow(x, count) / z.Factoriel(count); 
         if ( (count % 4) == 3 )
         { sin-= d; }
         else { sin+= d; }
         count =count+2;
                        
      }
      return sin;
   }
	     
   public static void main(String[] args)
   {
   
      Sines_Cosinus a = new Sines_Cosinus();
      System.out.println(a.cosine(1));
      System.out.println(a.sines(1));
   	
   	
   }
}

	
	
	
	

