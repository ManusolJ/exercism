class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private final static int PROD_SPEED = 10;

    private int distanceDriven = 0;
    private int numberOfVictories= 0;

    public void drive() {
        this.distanceDriven += PROD_SPEED;
    }

    public int getDistanceTravelled() {
        return this.distanceDriven;
    }

    public int getNumberOfVictories() {
       return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar otherCar) {
        if(otherCar == null) {
            throw new NullPointerException("Cannot compare with null");
        }

        return Integer.compare(otherCar.numberOfVictories, this.numberOfVictories);
    }
}
