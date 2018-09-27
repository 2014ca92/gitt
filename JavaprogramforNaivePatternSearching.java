// Java program for Naive Pattern Searching 
public class NaiveSearch { 


public static void search(String txt,String pat)
{
    int txtlen=txt.length();
    int patlen=pat.length();
    
    
    if(patlen>txtlen)
    return;
    
    int i=0, j=0;
    for(i=0;i<=txtlen-patlen;i++)
    {
        
        
        
        for(j=0;j<patlen;j++)
        {
        
        if(txt.charAt(i+j)!=pat.charAt(j))
                 break;    
        
        }
        
        
        if(j==patlen)
        System.out.println("pattren found at index"+i);
    
        
        
        
        
        
    }
    

    
    
    
}













	public static void main(String[] args) 
	{ 
		String txt = "AABAACAADAABAAABAA"; 
		String pat = "AABA"; 
		search(txt, pat); 
	} 
} 
// This code is contributed by Harikishore 

