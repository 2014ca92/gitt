class Node 
{
    char data ;
    Node right;
    Node left;
    
    
    Node(char a)
    {
        this.data=a;
        right=null;
        left=null;
    }
}

class Btree{
    static char view=0;
    static int min=0,max=0;
    public static void findminmax(Node root,int hd){
        
        if(root==null)
        return ;
        if(hd<min)
        min=hd;
        else if(hd>max)
        max=hd;
        findminmax(root.left,(hd-1));
        findminmax(root.right,(hd+1));
    }
    
    
    public static void topview(Node root,int hd,int k)
    {
        
        if(root==null)
          return ;
          if(hd==k){
              view=root.data;
          
              return;
          }
          
          topview(root.left,(hd-1),k);
          topview(root.right,(hd+1),k);
        
        
    }
    public static void main(String args[])
    {
        
        Node root=new Node('a');
        root.left=new Node('b');
        root.left.left=new Node('d');
        root.left.right=new Node('e');
       root.left.right.left=new Node('h');
       root.right=new Node('c');
       root.right.left=new Node('f');
       root.right.left.right=new Node('i');
       root.right.right=new Node('g');
       findminmax(root,0);
     
     System.out.println("min"+min);
     System.out.println("max"+max);
     
       int k=0;
       for(k=min;k<=max;k++)
       {
          // view =0;
           topview(root,0,k);
                System.out.println(view+" "+"dis="+k);;
           
       }
    }
    
    
    
    
}
