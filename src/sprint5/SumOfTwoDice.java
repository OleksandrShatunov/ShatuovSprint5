//Shatunov Oleksandr KND12 Sprint 5
package sprint5;

public class SumOfTwoDice {
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {
            System.out.println(diceRoll());
        }
    }

    public static int diceRoll() {
        int diceFirst = 1 + (int) (Math.random() * 6);
        int diceSecond = 1 + (int) (Math.random() * 6);
        return diceFirst + diceSecond;
    }
}