class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(
                Thread.currentThread().getName() + " deposits " + amount + " units. Balance is now: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(
                    Thread.currentThread().getName() + " withdraws " + amount + " units. Balance is now: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tries to withdraw " + amount
                    + " units but insufficient funds. Balance remains: " + balance);
        }
    }
}

class BankOperation implements Runnable {
    private BankAccount account;
    private boolean isDeposit;
    private int amount;
    public BankOperation(BankAccount account, boolean isDeposit, int amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }
    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}
public class Bankingoperation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Initial balance is 1000 units

        Thread[] threads = new Thread[3];

        for (int i = 0; i < threads.length; i++) {
            if (i % 2 == 0) {
                threads[i] = new Thread(new BankOperation(account, true, 200)); // Deposit 200 units
            } else {
                threads[i] = new Thread(new BankOperation(account, false, 300)); // Withdraw 300 units
            }
        }

        for (Thread thread : threads) {
            thread.start();
        }
        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
