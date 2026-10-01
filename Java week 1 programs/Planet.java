public class Planet {

    enum PlanetType {
        EARTH(9.81), MARS(3.71), MOON(1.62);

        private final double gravity;

        PlanetType(double gravity) {
            this.gravity = gravity;
        }

        double weight(double mass) {
            return mass * gravity;
        }
    }
        public static void main(String[] args) {
        PlanetType p = PlanetType.MARS;
        System.out.println(p.weight(70));

        switch (p) {
            case MARS -> System.out.println("Red planet");
            default -> System.out.println("Other");
        }
    }
}