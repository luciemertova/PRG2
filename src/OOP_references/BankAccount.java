package OOP_references;

public class BankAccount {
    long bankID;
    double balance;

    Person owner;

    public BankAccount(long bankID, double balance, Person owner) {
        this.bankID = bankID;
        this.balance = balance;
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double balance){
        System.out.println(owner.getFullName() + " na ucet ulozil " + balance);
        this.balance += balance;
    }

    boolean withdraw(double amount){

        if (balance >= amount){
            balance -= amount;
            System.out.println(owner.getFullName() + " z uctu vybral " + amount);
            return true;
        }else{
            System.out.println(owner.getFullName() + " nemohl vybrat " + amount);
            return false;
        }
    }

    boolean transaction (BankAccount other, double amount){
        if (withdraw(amount)){
            other.deposit(amount);
            System.out.println(owner.getFullName() + " poslal " + amount + " na ucet uzivatele " + other.owner.getFullName());
            return true;
//        if (balance >= amount){
//            balance -= amount;
//            other.balance += amount; = složitější možnost
        }else{
            System.out.println(owner.getFullName() + " nemohl poslat " + amount + " na ucet uzivatele " + other.owner.getFullName());
            return false;
        }
    }

    public static void main(String[] args) {
        Person o1 = new Person("Karel", "CZE");
        Person o2 = new Person("Pepe", "ESP");

        BankAccount acc1 = new BankAccount(5486,  5000, o1);
        BankAccount acc2 = new BankAccount(5874, 1000, o2);

        acc1.deposit(800);
        System.out.println(acc1.owner.getFullName()+ " ma na uctu " + acc1.getBalance());

        acc2.withdraw(9000);
        acc1.transaction(acc2, 3000);
        acc2.transaction(acc1, 10000);
    }


}