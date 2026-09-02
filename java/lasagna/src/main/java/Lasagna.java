public class Lasagna {

    private static final int MINUTES_NEEDED_IN_OVEN = 40;
    private static final int PREPARATION_TIME_OF_LAYER = 2; 
    
    public int expectedMinutesInOven() {
        return MINUTES_NEEDED_IN_OVEN;
    }
    
    public int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }
    
    public int preparationTimeInMinutes(int numberOfLayers) {
        return PREPARATION_TIME_OF_LAYER * numberOfLayers;
    }

    public int totalTimeInMinutes(int numberOfLayers, int timeInTheOven) {
        return preparationTimeInMinutes(numberOfLayers) + (MINUTES_NEEDED_IN_OVEN - remainingMinutesInOven(timeInTheOven));
    }
}
