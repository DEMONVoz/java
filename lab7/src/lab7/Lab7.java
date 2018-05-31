/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;


public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List ml = new List();
        ml.addBack(1);
        ml.addBack(2);
        ml.addBack(3);
        ml.addFront(6);
 
        ml.printList();
        System.out.println();
 
        ml.delEl(6);
        
        ml.delEl(2);
 
        ml.printList();
        System.out.println();
    }
    
}
