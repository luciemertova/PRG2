package OOP;

public class Banking_practise {
    public static void main(String[] args) {

        BankAccounts acc1 = new BankAccounts();
        acc1.balance = 1000;
        acc1.bid = 1256385;
        acc1.owner = "Karel";

        acc1.insert(1000);
        System.out.println(acc1.balance);

        acc1.withdraw(50);
        System.out.println(acc1.balance);
        acc1.withdraw(100);

        BankAccounts acc2 = new BankAccounts();
        acc2.balance = 500;
        acc1.transaction(800, acc2);
        System.out.println("ACC1: " + acc1.balance);
        System.out.println("ACC2: " + acc2.balance);


    }
}
