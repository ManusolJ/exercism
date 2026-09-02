public class JedliksToyCar {

    private int battery = 100;

    private int distanceTravelled;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %s meters", this.distanceTravelled);
    }

    public String batteryDisplay() {
        if (this.battery == 0) {
            return "Battery empty";
        }
        
        return String.format("Battery at %s%%", this.battery);
    }

    public void drive() {
        if (this.battery > 0) {   
            this.battery -= 1;
            this.distanceTravelled += 20;
        }
    }
}
