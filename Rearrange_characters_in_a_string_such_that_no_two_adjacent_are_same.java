Rearrange characters in a string such that no two adjacent are same









class Rea{
static char a[];

public static void main(String args[])
{
String str="bbbaa";
//char a[]=str.toCharArray();
int len=str.length();
int i=0,j=0;
for(i=0;i<len-1;i++)
{
    for(j=i+1;j<len;j++)
    {
        
        a=str.toCharArray(); 
       
       char c=a[i];
       a[i]=a[j];
       a[j]=c;
       
        int re=check(a);
        
        if(re==1)
        {
            int k=0;
            for(k=0;k<a.length;k++)
               System.out.print(a[k]);
        }
    
    }
}
}

public static int check(char a[])
{
    int i=0;
    
    
    for(i=0;i<a.length-1;i++)
    {
        if(a[i]==a[i+1])
        {
            return 0;
        }
    }
    
    return 1;
}











    
    
    
    
    
}
    
    
    
    

