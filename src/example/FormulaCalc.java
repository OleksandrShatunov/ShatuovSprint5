//Shatunov Oleksandr KND12 Sprint 5
package example;

public class FormulaCalc {
    public static void main(String[] args) {
        double x = 31.45;
        double y = 49.0;

        double f = (1.0 / 2.0) * Math.sin(x - Math.PI / Math.sqrt(y));
        System.out.println("For x = " + x + " and y = " +
y + " result calculation \nby formula f(x,y) = ... equals " + f);
    }
}
