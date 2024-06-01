package OOP;

public class BankAccounts {


    long bid = 1232545656874558L;
    int balance;
    String owner;

    void insert(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        if (amount > balance){
            System.out.println("Malo penez");
        }else {
            balance -= amount;
        }
    }


    void transaction(int amount, BankAccounts beneficiary){
        if (balance < amount){
            System.out.println("Převod se nezdařil.");
        }else {
            balance -= amount;
            beneficiary.balance += amount;
        }
    }

}
