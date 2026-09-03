public class ExperimentalRemoteControlCar implements RemoteControlCar {

    private final static int EXP_SPEED = 20;

    private int distanceDriven = 0;

    public void drive() {
        this.distanceDriven += EXP_SPEED;
    }

    public int getDistanceTravelled() {
        return this.distanceDriven;
    }
}
