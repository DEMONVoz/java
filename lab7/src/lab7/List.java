/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

class List  implements ListInterface {
    private ListElement head;       
    private ListElement tail;       
 
    @Override
    public void addFront(int data)           
    {
        ListElement a = new ListElement();  
        a.data = data;              
                                    
        if(head == null)            
        {                           
            head = a;               
            tail = a;
        }
        else {
            a.next = head;          
            head = a;              
        }
    }
 
    @Override
    public void addBack(int data) {          
        ListElement a = new ListElement();  
        a.data = data;
        if (tail == null)           
        {                           
            head = a;              
            tail = a;
        } else {
            tail.next = a;          
            tail = a;              
        }
    }
 
    @Override
    public void printList()               
    {
        ListElement t = head;          
        while (t != null)           
        {
            System.out.print(t.data + " "); 
            t = t.next;                     
        }
    }
 
    @Override
    public void delEl(int data)          
    {
        if(head == null)        
            return;            
 
        if (head == tail) {     
            head = null;        
            tail = null;
            return;            
        }
 
        if (head.data == data) {    
            head = head.next;       
            return;                 
        }
 
        ListElement t = head;       
        while (t.next != null) {    
            if (t.next.data == data) {  
                if(tail == t.next)      
                {
                    tail = t;           
                }
                t.next = t.next.next;   
                return;                 
            }
            t = t.next;                
        }
    }
}

 