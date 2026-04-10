import java.util.Random;

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Father deposits: Rs." + amount + " | Balance: Rs." + balance);
        notify(); 
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Son withdraws: Rs." + amount + " | Balance: Rs." + balance);
        } else {
            System.out.println("Son tried to withdraw Rs." + amount + " but insufficient balance!");
        }
        notify(); 
    }

    public int getBalance() {
        return balance;
    }
}

class Father extends Thread {
    private BankAccount account;
    private Random rand = new Random();

    public Father(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (account) {
                while (account.getBalance() > 2000) {
                    try {
                        account.wait(); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            int depositAmount = rand.nextInt(200) + 1; // 1–200
            account.deposit(depositAmount);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Son extends Thread {
    private BankAccount account;
    private Random rand = new Random();

    public Son(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (account) {
                while (account.getBalance() <= 2000) {
                    try {
                        account.wait(); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            int withdrawAmount = rand.nextInt(150) + 1; 
            account.withdraw(withdrawAmount);

            if (account.getBalance() < 500) {
                System.out.println("Balance below Rs.500, son stops withdrawing...");
                try {
                    account.wait(); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class L9P7 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(600);

        Father father = new Father(account);
        Son son = new Son(account);

        father.start();
        son.start();
    }
}