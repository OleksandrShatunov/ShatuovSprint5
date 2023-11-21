//Shatunov Oleksandr KND12 Sprint 5
package example;

public class RollDice {
    public static void main(String[] args) {
        System.out.println("First roll = " + diceRoll());
        System.out.println("Second roll = " + diceRoll());
        System.out.println("Third roll = " + diceRoll());
    }

    public static int diceRoll() {
        int dice = 1 + (int) (Math.random() * 6);
        return dice;
    }
}