public class CarsAssemble {

    private final int CARS_PRODUCED_PER_HOUR = 221;

    public double productionRatePerHour(int speed) {
        int successRate = 100;

        if (speed >= 5 && speed <= 8) {
            successRate = 90;
        } else if(speed == 9) {
            successRate = 80;
        } else if (speed >= 10) {
            successRate = 77;
        }

        return ((CARS_PRODUCED_PER_HOUR * speed) * successRate) / 100.0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
