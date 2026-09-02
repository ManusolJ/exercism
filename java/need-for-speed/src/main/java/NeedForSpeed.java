class NeedForSpeed {

    private final static int NITRO_SPEED = 50;
    private final static int NITRO_BATTERY_DRAIN = 4;

    private int speed;
    private int batteryDrain;
    private int battery = 100;
    private int distanceDriven = 0;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery <= 0 || this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if(!batteryDrained()) {
            this.distanceDriven += speed;
            this.battery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(NITRO_SPEED, NITRO_BATTERY_DRAIN);
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getBatteryDrain() {
        return this.batteryDrain;
    }

    public int getMaxTravelDistance() {
        return (this.speed * this.battery) / this.batteryDrain;
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.getMaxTravelDistance() >= this.distance;
    }
}
