import java.util.Random;

class CaptainsLog {

    private static final int MINIMUM_REGISTRY_NUMBER = 1000;
    private static final int MAXIMUM_REGISTRY_NUMBER = 10000;
    private  static final double MINIMUM_STARDATE = 41000.0;
    private  static final double MAXIMUM_STARDATE = 42000.0;
    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[this.random.nextInt(PLANET_CLASSES.length)];
    }

    String randomShipRegistryNumber() {
        return "NCC-" + String.valueOf(this.random.nextInt(MAXIMUM_REGISTRY_NUMBER - MINIMUM_REGISTRY_NUMBER) + MINIMUM_REGISTRY_NUMBER);
    }

    double randomStardate() {
        return this.random.nextDouble(MAXIMUM_STARDATE - MINIMUM_STARDATE) + MINIMUM_STARDATE;
    }
}
