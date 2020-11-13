

public class Detyra_7_7_2 
{
	public boolean theCharIsnt(String a, char c)
	{ 
		boolean notfound = true;
		for ( int j = 0; j != a.length(); j = j + 1 )
	
		{ 
			notfound = notfound && (c != a.charAt(j));
		}
		
		return notfound;
	}

	public String removeDuplicateLetters(String s)
	{ 
		String answer = "";
		for ( int i = 0; i != s.length(); i = i + 1 )
	
		{ 	if ( theCharIsnt(answer, s.charAt(i)) )
			{ 
				answer = answer + s.charAt(i); }
			}
		
		return answer;
	}
	
		
	public static void main(String[] args)
	{
		
		Detyra_7_7_2 a = new Detyra_7_7_2();
		System.out.println(a.removeDuplicateLetters("butterflies"));
	
	}
}
