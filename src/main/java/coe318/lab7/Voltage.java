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

public class Voltage extends Circuit {
    

    private double voltage;
    private Node node1, node2;
    public int v_id = 1;
    public static int v_next = 1;
    

    public Voltage(double voltage, Node n1, Node n2){
        
       if (n1 == null || n2 == null || n1 == n2) {
           
            throw new IllegalArgumentException("Incorrect node assignment");
            
        } else if (n1.id < 0 || n2.id < 0) {
           
            throw new IllegalArgumentException("Node ID cannot be negative");
            
        } else {
            
           this.voltage = voltage;
           node1 = n1;
           node2 = n2;
           v_id = v_next;
           v_next++;
        }
    }
    
//Node Voltage method//
    
    public Node [] getNodes(){
        Node [] node = new Node[2];
        node[0] = node1;
        node[1] = node2;
        return node;
    }
    

    public boolean negative(){
        
        Node [] nodes = getNodes();
        return (nodes[0].id > nodes[1].id);
        
    }
    
//Voltage representation//
    @Override
    public String toString(){
        
        Node [] nodearray = getNodes();
        
        if (negative()){
            
        return("V" + v_id + " " + nodearray[1] + " " + nodearray[0] + " DC " + (this.voltage)); 
        
        } else {
            
          return("V" + v_id + " " + nodearray[0] + " " + nodearray[1] + " DC " + -(this.voltage)); 
        }   
    }
}