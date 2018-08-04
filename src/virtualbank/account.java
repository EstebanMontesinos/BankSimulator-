/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualbank;

/**
 *
 * @author estebanmontesinos
 */
public class account {
    String name;
    String address;
    int an;
    int balance;
    
    public account(String name,String address,int an,int balance){
        this.name=name;
        this.address=address;
        this.an=an;
        this.balance=balance;         
    }
    public String toString(){
        return "Costumer name: "+name+" "+"Adress of costumer: "+address+ " "+"accountNumber: "+an+" "+"balance of this account: "+balance+" ";
    }
    
    
    
}
