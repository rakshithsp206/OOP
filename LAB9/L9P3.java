import java.util.Scanner;

class SinCalculator implements Runnable {
    private double x;
    private int terms;

    public SinCalculator(double x, int terms) {
        this.x = x;
        this.terms = terms;
    }

    @Override
    public void run() {
        double result = 0.0;
        for (int n = 0; n < terms; n++) {
            double term = Math.pow(-1, n) * Math.pow(x, 2 * n + 1) / factorial(2 * n + 1);
            result += term;
        }
        System.out.println("sin(" + x + ") ≈ " + result);
        System.out.println("Math.sin(" + x + ") = " + Math.sin(x));
    }

    private double factorial(int n) {
        double fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }
}

class CosCalculator implements Runnable {
    private double x;
    private int terms;

    public CosCalculator(double x, int terms) {
        this.x = x;
        this.terms = terms;
    }

    @Override
    public void run() {
        double result = 0.0;
        for (int n = 0; n < terms; n++) {
            double term = Math.pow(-1, n) * Math.pow(x, 2 * n) / factorial(2 * n);
            result += term;
        }
        System.out.println("cos(" + x + ") ≈ " + result);
        System.out.println("Math.cos(" + x + ") = " + Math.cos(x));
    }

    private double factorial(int n) {
        double fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }
}

public class L9P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in radians: ");
        double x = sc.nextDouble();
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        Thread sinThread = new Thread(new SinCalculator(x, terms));
        Thread cosThread = new Thread(new CosCalculator(x, terms));

        sinThread.start();
        cosThread.start();

        try {
            sinThread.join();
            cosThread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}