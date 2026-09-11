// ovenTime returns the amount in minutes that the lasagna should stay in the
// oven.

const int TIME_IN_OVEN = 40;
const int TIME_NEEDED_BY_LAYER = 2;

int ovenTime() {
    return TIME_IN_OVEN;
}

/* remainingOvenTime returns the remaining
   minutes based on the actual minutes already in the oven.
*/
int remainingOvenTime(int actualMinutesInOven) {
    return ovenTime() - actualMinutesInOven;
}

/* preparationTime returns an estimate of the preparation time based on the
   number of layers and the necessary time per layer.
*/
int preparationTime(int numberOfLayers) {
    return numberOfLayers * TIME_NEEDED_BY_LAYER;
}

// elapsedTime calculates the total time spent to create and bake the lasagna so
// far.
int elapsedTime(int numberOfLayers, int actualMinutesInOven) {
    return preparationTime(numberOfLayers) + actualMinutesInOven;
}
