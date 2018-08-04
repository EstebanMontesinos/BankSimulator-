/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualbank;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import virtualbank.account;

/**
 *
 * @author estebanmontesinos
 */
public class VirtualBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<account> b = new LinkedList<account>();
        account a1=new account("emily","newyork city",123,1000);
        account a2=new account("vicky","Paris",126,1600);
        account a3= new account("essyn","Khobar Saudi",170,2000);
        account a4=new account("nassem","Instanbul",100,1400);
        account a5=new account("vero","Quito",70,2000);
        account a6=new account("parkleee","japan",400,4500);
        
        b.add(a1);
        b.add(a2);
        b.add(a3);
        b.add(a4);
        b.add(a5);
        b.add(a6);

       Iterator<account> i=b.iterator();//used an iterator for proper sequence
        while(i.hasNext()){
            System.out.println(i.next());
        }
       
     
        
        
        
        
        
        
        
    }
    
}
