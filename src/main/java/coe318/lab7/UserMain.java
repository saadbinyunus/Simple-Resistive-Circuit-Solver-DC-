/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class UserMain implements UserInterface{
    

   private ArrayList<Circuit> circuit = new ArrayList<>();
   private static Scanner in = new Scanner(System.in);
   

   @Override
   public void start(){
       
       display();
       run();
   }
   

   @Override
   public void run(){
       
       boolean run = true;
       
       while(run){
           
           String userinput = in.nextLine();
           
            if (userinput.equals("end") || userinput.equals("END")) {
                
            end();
            break; 
            
            } else if (userinput.equals("spice") || userinput.equals("SPICE")) {
                
              spice(); 
                    
            } else if (userinput.startsWith("v") || userinput.startsWith("V")){
                
                String delimitter = "[ ]+";
                String[] line = userinput.split(delimitter);
     
                Node n1 = new Node();
                n1.id = Integer.parseInt(line[1]);
                Node n2 = new Node();
                n2.id = Integer.parseInt(line[2]);
                Voltage vs = new Voltage(Double.parseDouble(line[3]),n1,n2);
                circuit.add(vs);
                
                
            } else if(userinput.startsWith("r") || userinput.startsWith("R")){
                
                String delimitter = "[ ]+";
                String[] line = userinput.split(delimitter);
                                                 
                Node n1 = new Node();
                n1.id = Integer.parseInt(line[1]);
                Node n2 = new Node();
                n2.id = Integer.parseInt(line[2]);
                Resistor r = new Resistor(Double.parseDouble(line[3]),n1,n2);
                circuit.add(r);
                
            } else {
                
                System.out.println("The syntax entered is incorrect.");
                System.out.println("Please enter a command, or 4 properties of circuit elements.");
            }   
        }
    }
   
 
  @Override
   public void display(){
      
     System.out.println("Describe your electric circuit using Resistors or Voltage sources.");
   }
  
  
   @Override
   public void spice(){
       
       for(Circuit circ: circuit) {
           System.out.println(circ);
       }
   }
   

   
   
   @Override
   public void end(){
       
       System.out.println("All done.");
   }
   
    public static void main(String [] args){
        
       UserMain user = new UserMain();
       user.start();
    }
}
