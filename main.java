package bankproject;
import bankproject.BankAccount;
import bankproject.DebitCard;

public class main {

    public static void main (String[] args){


        DebitCard d1 = new DebitCard("123456754", 9010, 609, "08/2028");

        BankAccount b1 = new BankAccount("Gopi", 481630454, 90100333, "sbin1043", d1);
        

        System.out.println(b1);

        
    
    }

}
