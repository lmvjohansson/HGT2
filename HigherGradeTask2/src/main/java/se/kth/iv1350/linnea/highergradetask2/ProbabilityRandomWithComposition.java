package se.kth.iv1350.linnea.highergradetask2;

import java.util.Random;

/**
 * Generates a random boolean.
 */
public class ProbabilityRandomWithComposition {
    private Random random = new Random();
    
    /**
     * Returns the next pseudorandom, uniformly distributed boolean value from this random number generator's sequence.
     * 
     * @return random boolean.
     */
    public boolean nextBoolean(){
        return random.nextBoolean();
    }
    
    /**
     * Returns the next pseudorandom boolean value based on the probability. Value 0 always 
     * returns false and value 1 always returns true.
     * 
     * @param probability a number between 0 and 1 that reflects the probability.
     * @return a random boolean generated based on the probability.
     */
    public boolean nextBooleanWithProbability(double probability){
        if (probability < 0 || probability > 1) {
            throw new IllegalArgumentException("Probability must be between 0 and 1");
        }
        return random.nextDouble() < probability;
    }
}
