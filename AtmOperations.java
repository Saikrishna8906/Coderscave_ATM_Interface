import java.util.*;

public class AtmOperations {
    private double balance;
    Map<Double,String> mini=new LinkedHashMap<>();



    public void viewBalance(){
        System.out.println("Current Balance : "+balance);
    }
    public void deposite(double amount){
        balance=balance+amount;
        mini.put(amount," Deposited");
        System.out.println(amount + "Successfully Credited");
    }
    public void withdraw(double amount){
        if(amount%500==0){
            if(amount<=balance){
                balance=balance-amount;
                mini.put(amount," Withdrawn");
                System.out.println(amount+" Successfully Debited");
            }else
                System.out.println("Insufficient Balance");
        }
        else
            System.out.println("Please enter the multiples of 500");
    }
    public void miniStatement(){
        for(Map.Entry<Double,String> m:mini.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
