package thread;

public class ThreadExample2 {
    public static void main(String[] args) {
        Runnable threadTask3 = new ThreadTask3();
        Thread thread3_1 = new Thread(threadTask3);
        Thread thread3_2 = new Thread(threadTask3);

        thread3_1.setName("ABC");
        thread3_2.setName("QWE");

        thread3_1.start();
        thread3_2.start();
    }
}

class Account {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    // synchronized를 사용하여 임계 영역을 지정하지 않는 경우 동시 접근 문제가 발생한다.
    //public boolean withdraw(int money) {
    public synchronized boolean withdraw(int money) {
        if(balance >= money) {
            try {Thread.sleep(1000);} catch(Exception error) {}
            balance -= money;
            return true;
        }
        return false;
    }
}

class ThreadTask3 implements Runnable {
    Account account = new Account();
    public void run() {
        while(account.getBalance() > 0) {
            int money = (int)(Math.random() * 3 + 1) * 100;
            boolean denied = !account.withdraw(money);
            System.out.println(String.format("Withdraw %d₩ By %s. Balance : %d %s",
                    money, Thread.currentThread().getName(), account.getBalance(), denied ? "-> DENIED" : "")
            );
        }
    }
}