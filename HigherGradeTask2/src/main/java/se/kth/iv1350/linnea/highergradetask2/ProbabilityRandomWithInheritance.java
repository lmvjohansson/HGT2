package se.kth.iv1350.linnea.highergradetask2;

import java.util.Random;

/**
 * An instance of this class is used to generate a stream of pseudorandom numbers and booleans.
 */
public class ProbabilityRandomWithInheritance extends Random{
    
    /**
     * Returns the next pseudorandom boolean value based on the probability. Value 0 always 
     * returns false and value 1 always returns true.
     * 
     * @param probability a number between 0 and 1 that reflects the probability.
     * @return a random boolean generated based on the probability.
     */
    public boolean nextBooleanWithProbability(double probability) {
        if (probability < 0 || probability > 1) {
            throw new IllegalArgumentException("Probability must be between 0 and 1");
        }
        return super.nextDouble() < probability;
    }
    
}
