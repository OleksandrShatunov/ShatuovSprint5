//Shatunov Oleksandr KND12 Sprint 5
package example;

/*public class drawLines1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            System.out.print("*");
        }

        System.out.print("\n");

        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }
    }
}*/

/*public class drawLines1 {
    public static void main(String[] args) {
        int lineWidth = 6;
        for (int i = 1; i <= lineWidth; i++) {
            System.out.print("*");
        }

        System.out.print("\n");

        lineWidth = 10;
        for (int i = 1; i <= lineWidth; i++) {
            System.out.print("*");
        }
    }
}*/

public class DrawLines1 {
    public static void main(String[] args) {
        drawLines(6);

        System.out.print("\n");

        drawLines(10);
    }
    public static void drawLines(int lineWidth) {
        for (int i = 1; i <= lineWidth; i++) {
            System.out.print("*");
        }
    }
}