//Shatunov Oleksandr KND12 Sprint 5
package sprint5;

public class SpeedOfSatellite {
    public static void main(String[] args) {
        satelliteSpeed(1932);
        satelliteSpeed(2910247);
    }
    public static double satelliteSpeed(int d) {
        double g = 6.67 * Math.pow(10, -11);
        double me = 5.98 * Math.pow(10, 24);
        double v = Math.sqrt(g * me / d);
        System.out.println(v);
        return v;
    }
}
