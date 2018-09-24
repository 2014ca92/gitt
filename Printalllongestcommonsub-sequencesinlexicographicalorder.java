Print all longest common sub-sequences in lexicographical order



/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    

static List<String> list=new ArrayList<String>();   
static HashSet<String> set =new HashSet<String>();
    public static void find(String input , String output)
{
    
    if(input.length()==0)
    {
    list.add(output);
     return ;
    }
    find(input.substring(1),output);
    find(input.substring(1),output+input.charAt(0));
}
    
    public static void find2(String input,String output)
    {
        if(input.length()==0)
        {
            if(list.contains(output))
                    set.add(output);
            return;
        }
        find2(input.substring(1),output);
        find2(input.substring(1),output+input.charAt(0));
    }
    
    
    
    
	public static void main (String[] args) {
	//	System.out.println("GfG!");
		
	find("abcabcaa","");
		//	string str1 = "abcabcaa", str2 = "acbacba"; 
			
	find2( "acbacba","");		
			
			
	
	int len=0;
	String k=null;
	for(String str : set){
	if(str.length()!=0&& (str.length()>=len)                  )
	{
	    len=str.length();
	    k=str;
	    
	}
	}
	
	
	for(String st:set)
	{
	    if(st.length()!=0&&    (k.length()==st.length())   )
	    System.out.println(st);
	}
	
	}
}
