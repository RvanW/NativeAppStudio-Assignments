public class SavingsAccount {
    // Properties of the class...
    private int balance;
    // Constructors of the class...
    public SavingsAccount() {
        balance = 0;
    }
    public SavingsAccount(int initialBalance) {
        balance = initialBalance;
    }
    // Methods of the class...
    public void greet() {
        System.out.println("Hello valued customer");
    }
    public int showBalance() {
        return balance;
    }
    public void deposit(int howMuch) {
        if (howMuch < 0) {
            System.out.println("You can't deposit a negative amount!");
        }
        else {
            balance = balance + howMuch;
        }
    }
    public void withdraw(int howMuch) {
        if (howMuch < 0) {
            System.out.println("You can't withdraw a negative amount!");
        }
        else {
            balance = balance - howMuch;
        }
    }
    public void transfer(SavingsAccount whereTo, int howMuch) {
        balance = balance - howMuch;
        whereTo.balance = whereTo.balance + howMuch;
    }
}
