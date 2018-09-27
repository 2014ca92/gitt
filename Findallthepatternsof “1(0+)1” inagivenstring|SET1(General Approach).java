Find all the patterns of “1(0+)1” in a given string | SET 1(General Approach)


// Java Code to count 1(0+)1 
// patterns in a string 
import java.io.*; 

class GFG 
{ 
	
	public static int  patternCount(String str)
	{

   if(str==null)
   return 0;
   
   int count=0;
   
   char last=str.charAt(0);
   
int i=1;
for(i=1;i<str.length();i++)
{
          if(last=='1'&&str.charAt(i)=='0')
          {
              
              while(str.charAt(i)=='0')
              i++;
        
        
         if(str.charAt(i)=='1')
              count++;
        
          }
          
         
        
        
        last=str.charAt(i);
          
         
          
    
    
    
    
}
   
   
 return count;  
   
   
   
   
   
   
   
	    
	}
	
	
	
	// Driver Code 
	public static void main (String[] args) 
	{ 
		String str = "1001ab010abc01001"; 
		System.out.println(patternCount(str)); 
		
	} 
} 

// This code is contributed by vt_m. 

