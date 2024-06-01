package Testy.Test_7;

public class U2 {

    int balance;

    public U2(int balance, int debt, int count) {
        this.balance = balance;
        this.debt = debt;
        this.count = count;
    }

    int debt;
    int count = 0;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public  int bet() {

        int n1 = (int) (Math.random() * 7 + 1);
        int n2 = (int) (Math.random() * 7 + 1);
        int n3 = (int) (Math.random() * 7 + 1);
        while (!(n1 == n2 && n1 == n3 && n2 == n3)) {
            if (this.balance < 150) {
                System.out.println("Málo kreditu");
            } else {
                int numbers = (int) (Math.random() * 7 + 1);
                int numbers2 = (int) (Math.random() * 7 + 1);
                int numbers3 = (int) (Math.random() * 7 + 1);
                this.count++;
                this.balance -= 150;
            }
        }
        return balance;
    }

    public int actualDebt(){
        this.debt = this.count*150;
        return this.debt;
    }
    public int getBalance(){
        return balance;
    }

    public void loan(int howMuch){
        this.balance+=howMuch;
        this.debt += (howMuch*1.5);
    }


}
