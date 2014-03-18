/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package book.shop;

/**
 *
 * @author lenovo
 */
public class Node {
    Book element= null;
    Node leftChild;
    Node rightChild;
    Node parent;
    String color;
    
     public Node(Book theElement)
     {
         this( theElement, null, null );
     } 
     /* Constructor */
     public Node(Book theElement, Node lt, Node rt)
     {
         leftChild = lt;
         rightChild = rt;
         element = theElement;
         color = "BLACK";
     }   
     
     public Book getElement() {
         return element;
     } 
        
    }
    
    

