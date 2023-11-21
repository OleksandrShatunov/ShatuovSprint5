//Shatunov Oleksandr KND12 Sprint 5
package example;

public class DrawLines3 {
    public static void main(String[] args) {
        drawLine(5, "+", "|", "0");
        System.out.println();
        drawLine(9, "+", "|", "0");
        System.out.println();
        drawLine(11, "+", "|", "0");
        System.out.println();
        drawLine(8, "+", "|", "0");
        System.out.println();
        drawLine(3, "+", "|", "0");
    }

    public static void drawLine(int lineWidth, String sym,
String startSym, String endSym) {
        System.out.print(startSym);

        for (int i = 2; i <= lineWidth - 1; i++) {
            System.out.print(sym);
        }

        System.out.print(endSym);
    }
    public static void drawLine(int lineWidth, String sym) {
        for (int i = 1; i <= lineWidth - 1; i++) {
            System.out.print(sym);
        }
    }

    public static void drawLine(int lineWidth) {
        System.out.print("*");
    }
}