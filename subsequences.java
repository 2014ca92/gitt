/*package whatever //do not write package name here */

Number of subsequences in a string divisible by n
import java.io.*;

class subsequences {
    
    
    public static void find(String input,String output)
    {
        
        if(input.length()==0)
        {
            if((output.length()>0)&&(Integer.parseInt(output)%4==0))
         System.out.println(output);
            return;
        }
        
        
        find(input.substring(1),output);
        find(input.substring(1),output+input.charAt(0));
    }
    
    
    
    
    
    
    
    
    
	public static void main (String[] args) {
		System.out.println("GfG!");
		
		find("1234","");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
