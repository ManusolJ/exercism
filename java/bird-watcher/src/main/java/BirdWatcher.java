
class BirdWatcher {
    private final int[] birdsPerDay;
    
    private final static int MINIMUM_FOR_BUSY_DAY = 5;
    
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int birds: birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdCount = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        
        for(int index = 0;index < limit; index++) {
            birdCount += birdsPerDay[index];
        }
        
        return birdCount;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int birds: birdsPerDay) {
            if (birds >= MINIMUM_FOR_BUSY_DAY) {
                busyDays += 1;
            }
        }
        return busyDays;
    }
}
