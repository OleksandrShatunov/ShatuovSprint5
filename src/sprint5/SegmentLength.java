//Shatunov Oleksandr KND12 Sprint 5
package sprint5;

public class SegmentLength {
    public static void main(String[] args) {
        segmentDistance(5, 7, 2, 3);
    }
    public static double segmentDistance(int x1, int y1, int x2, int y2) {
        double d = Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2)));
        System.out.println(d);
        return d;
    }
}