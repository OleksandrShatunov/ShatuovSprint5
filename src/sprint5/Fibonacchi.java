//Shatunov Oleksandr KND12 Sprint 5
package sprint5;

public class Fibonacchi {
    public static void main(String[] args) {
        System.out.println("  Month No.            Number of Pairs");
        for (int i = 1; i <= 12; i++) {
            System.out.println("  " + i + "                    " + (int) fibonacchi(i));
        }
    }
    public static double fibonacchi (int N) {
        double Fn = 1 / Math.sqrt(5) * (Math.pow((1 + Math.sqrt(5)) / 2, N) - Math.pow((1 - Math.sqrt(5)) / 2, N));
        return Fn;
    }
}