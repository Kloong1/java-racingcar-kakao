package racingcar.service;

import racingcar.domain.RandomNumberGenerator;

public class RandomMovementManager {

    public static final int  MOVEMENT_THRESHOLD = 4;
    public static final int RANDOM_NUMBER_BOUND = 9;

    private final RandomNumberGenerator randomNumberGenerator;
    public RandomMovementManager(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public boolean makeMovementDecision() {
        return randomNumberGenerator.generate(RANDOM_NUMBER_BOUND) >= MOVEMENT_THRESHOLD;
    }
}
