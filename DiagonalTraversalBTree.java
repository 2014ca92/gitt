// Java program for diagonal traversal of Binary Tree 
import java.util.HashMap; 
import java.util.Map.Entry; 
import java.util.Vector; 
import java.util.*;

public class DiagonalTraversalBTree 
{ 


	static HashMap<Node,Integer> map = new HashMap<>(); 

	// Tree node 
	static class Node{ 
		int data; 
		Node left; 
		Node right; 
		
		//constructor 
		Node(int data) 
		{ 
			this.data=data; 
			left = null; 
			right =null; 
		} 
	} 
	// Print diagonal traversal of given binary tree 

static int max=0;
	static void diagonalPrint(Node root) 
	{ 

      if(root==null)
      return;
      
      if(root.right!=null)
      map.put(root.right,map.get(root));
      
       if(root.left!=null){
      map.put(root.left,(map.get(root)+1));
       
             if(max<map.get(root)+1)
           max=(map.get(root)+1);
           System.out.println("max=="+max);
       }
      diagonalPrint(root.left);
      diagonalPrint(root.right);
	} 
	// Driver program 
	public static void main(String[] args) { 	
		Node root = new Node(8); 
		root.left = new Node(3); 
		root.right = new Node(10); 
		root.left.left = new Node(1); 
		root.left.right = new Node(6); 
		root.right.right = new Node(14); 
		root.right.right.left = new Node(13); 
		root.left.right.left = new Node(4); 
		root.left.right.right = new Node(7); 
		map.put(root,0);
		diagonalPrint(root);
		
	//	+m.getValue()
		Node k=null;
		 int i=0;
      for(i=0;i<=max;i++)
      {
        for(Map.Entry m:map.entrySet()){  
            
              k=(Node)m.getKey();
                     if((int)m.getValue()==i)
   System.out.print(","+(int)(k.data));  
  }  
    System.out.println();         
          
          
          
      }
      

		
		
		
		
		
		
		
		
		
		
//	System.out.println(map);
	} 
} 
// This code is contributed by Sumit Ghosh 

