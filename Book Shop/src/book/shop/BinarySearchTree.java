/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package book.shop;

/**
 *
 * @author lenovo
 */
public class BinarySearchTree {
     Node root;
    
    
    public void add(Book book)
    {
        
    Node nodetoadd=new Node(book);
    
    if(root==null)
    {
        root=nodetoadd;
    }
    else
    {
        traverse_and_addnode(root,nodetoadd);
    }
    
    
    }
    
    
    private void traverse_and_addnode(Node current_node,Node nodetoadd)
    {
    
        if(nodetoadd.getElement().getISBN() < current_node.getElement().getISBN())
        {
            if(current_node.leftChild==null)
            {
            nodetoadd.parent=current_node;
            current_node.leftChild=nodetoadd;
            }
            else{
            traverse_and_addnode(current_node.leftChild,nodetoadd);
            }
        
         }
        
        else if(nodetoadd.getElement().getISBN() > current_node.getElement().getISBN())
        {
            if(current_node.rightChild==null)
            {
            nodetoadd.parent=current_node;
            current_node.rightChild=nodetoadd;
            }
            else
            {
            traverse_and_addnode(current_node.rightChild,nodetoadd);
            }
                                  
        }
        
        
    }
        
    
    public Node find(int isbn)
    {
        Book book = new Book();
        book.setISBN(isbn);
        
    if(root != null)
    {
        return find_node(root,new Node(book));
    }
    
    return null;
    
    }
    
    
    
   private Node find_node(Node search, Node fakenode)
   {
       if(search == null)
       {
       return null;
       }
       
       
       if(search.getElement().getISBN()==fakenode.getElement().getISBN())
       {
       return search;
       }
       
       else
       {
           
           
       Node returnnode=find_node(search.leftChild,fakenode);
       
       if(returnnode==null)
       {
       returnnode=find_node(search.rightChild,fakenode);
       }
       
       return returnnode;
       
       
       }
       
    }
    
    
   
   public void delete(int isbn)
   {
    
     Node deletingnode=find(isbn);
     
     if(deletingnode.leftChild==null && deletingnode.rightChild==null )
     {
     
         deletecase1(deletingnode);
         
         
     }
     
      else if(deletingnode.leftChild!=null && deletingnode.rightChild!=null)
     {
         
     deletecase3(deletingnode);
     
     }
     
     
     else if(deletingnode.leftChild!=null)
     {
         deletecase2(deletingnode);
     
     }
     
     else if(deletingnode.rightChild!=null)
     {
         deletecase2(deletingnode);
     
     }
     
    
   }
     
    private void deletecase1(Node deletingnode) 
    {
     if(deletingnode.parent==null)
     {
      root=null;
     }
     
     else
     {
         
         
      if(deletingnode.parent.leftChild==deletingnode)
         {
         deletingnode.parent.leftChild=null;
         
         }
         else if(deletingnode.parent.rightChild==deletingnode)
         {
         deletingnode.parent.rightChild=null;
         }
     }
    }
   
    
    private void deletecase2(Node deletingnode) 
    {
        
        if(deletingnode.parent==null)
    {
        if(deletingnode.leftChild!=null)
         {
          root=deletingnode.leftChild;
         }
        else if(deletingnode.rightChild!=null)
         {
          root=deletingnode.rightChild;

         }
        
       }
        
        else
        {
            
        
        if(deletingnode.parent.leftChild==deletingnode)
        {
      
         if(deletingnode.leftChild!=null)
         {
         deletingnode.parent.leftChild=deletingnode.leftChild;
         }
         else if(deletingnode.rightChild!=null)
         {
         deletingnode.parent.leftChild=deletingnode.rightChild;
         }
         
         }
         else if(deletingnode.parent.rightChild==deletingnode)
         {
     
         if(deletingnode.leftChild!=null)
         {
         deletingnode.parent.rightChild=deletingnode.leftChild;
         }
         else if(deletingnode.rightChild!=null)
         {
         deletingnode.parent.rightChild=deletingnode.rightChild;
         }
         
        }
      }   
    }
   
    
    private void deletecase3(Node deletingnode)
    {
    
    Node replacingnode=SearchMinLeftNode(deletingnode.rightChild);
    
    delete(replacingnode.getElement().getISBN());
    
    replacingnode.parent=deletingnode.parent;
    replacingnode.leftChild=deletingnode.leftChild;
    replacingnode.rightChild=deletingnode.rightChild;
    
    if(deletingnode.parent==null)
    {
    root=replacingnode;
    
    }
    else
    {
    
    if (deletingnode.parent.leftChild==deletingnode)
    {
    deletingnode.parent.leftChild=replacingnode;
    }
    else if(deletingnode.parent.rightChild==deletingnode)
    {
    deletingnode.parent.rightChild=replacingnode;
    }
    }
    
    }
    
    private Node SearchMinLeftNode(Node node)
    {
    if(node.leftChild==null)
    {
    return node;
    }
    else
    {
    return SearchMinLeftNode(node.leftChild);
    }
    
    }
    
    
    
   
     public Node display(int isbn)
     {
         Node displayingnode=find(isbn);
         return displayingnode;
     }

     
     

   
   
   
}
