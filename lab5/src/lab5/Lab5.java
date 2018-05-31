/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.List;

public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        OneLinkedList oneLinkedList=new OneLinkedList(10);

        List<Integer> list= new ArrayList<>();

        System.out.println(oneLinkedList);
        oneLinkedList.invert();
        System.out.println(oneLinkedList);
        oneLinkedList.removeLast();
        System.out.println(oneLinkedList);
        oneLinkedList.sort();
        System.out.println(oneLinkedList);
     
        Parallelepiped P1 = new Parallelepiped(1,2,3);
      System.out.println("S="+P1.Area());
      System.out.println("V="+P1.Voluem());
      P1.Compration();
    }
    
}
