/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
/**
 *
* @author USER
 */
public class Node {  
    
    
    public int id = 0;
    public static int i = 0;
    
     
         public Node(){ 
        
                id = i;
                i++;
                }
    
 
    @Override
        public String toString(){   
        
        return ("" + this.id);
        
    }
}
