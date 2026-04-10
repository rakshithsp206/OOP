class FibonacciThread extends Thread {
    private int count;

    public FibonacciThread(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        long f1 = 1, f2 = 1;
        System.out.println("Fibonacci Numbers:");
        System.out.print(f1 + " " + f2 + " ");
        for (int i = 3; i <= count; i++) {
            long fn = f1 + f2;
            System.out.print(fn + " ");
            f1 = f2;
            f2 = fn;
        }
        System.out.println("\nFibonacci thread completed 50 numbers. Going to sleep...\n");
        try {
            Thread.sleep(2000); // sleep before resuming
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class PrimeThread extends Thread {
    private int count;

    public PrimeThread(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println("Prime Numbers:");
        int num = 2, printed = 0;
        while (printed < count) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                printed++;
            }
            num++;
        }
        System.out.println("\nPrime thread completed 25 numbers.\n");
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class L9P6 {
    public static void main(String[] args) {
        FibonacciThread fibThread = new FibonacciThread(50);
        PrimeThread primeThread = new PrimeThread(25);

        // Set priorities
        fibThread.setPriority(8);
        primeThread.setPriority(5);

        
        fibThread.start();

        try {
            fibThread.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        primeThread.start();

        try {
            primeThread.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        System.out.println("Resuming Fibonacci thread after Prime computation...");
        FibonacciThread fibResume = new FibonacciThread(50);
        fibResume.setPriority(8);
        fibResume.start();
    }
}