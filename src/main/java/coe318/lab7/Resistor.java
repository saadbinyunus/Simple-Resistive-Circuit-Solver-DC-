/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
* @author USER
 */

public class Resistor extends Circuit {        
    
    private double resistance;
    private Node node1, node2;
    public int r_id = 1;
    public static int r_next = 1;
    

    public Resistor(double res, Node n1, Node n2){
        
       if(res <= 0) {
           
            throw new IllegalArgumentException("Error: The Resistance cannot be less than or equals to 0");
            
        } else if(n1 == null || n1 == n2 || n2 == null) {
            
            throw new IllegalArgumentException("Error: Incorrect node assignment");
            
        } else if(n1.id < 0 || n2.id < 0) {
            
            throw new IllegalArgumentException("Error:The Node ID cannot be negative");
            
        } else {
            
           this.resistance = res;
           node1 = n1;
           node2 = n2;
           r_id = r_next;
           r_next++;
        }
    }
    
//Node Method//
    public Node [] getNodes(){
        
        Node [] node = new Node[2];
        node[0] = node1;
        node[1] = node2;
        return node;
    }
    
//Resistor Object representation//
    @Override
    public String toString(){
        
        Node [] nodearray = getNodes();
        return("R" + r_id + " " + nodearray[0] + " " + nodearray[1] + " " + this.resistance);
        
    }
}
