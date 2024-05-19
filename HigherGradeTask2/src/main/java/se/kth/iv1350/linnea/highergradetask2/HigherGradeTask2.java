package se.kth.iv1350.linnea.highergradetask2;

/**
 * Contains main method to run application.
 */
public class HigherGradeTask2 {

    public static void main(String[] args) {
        ProbabilityRandomWithInheritance probabilityRandomWithInheritance = new ProbabilityRandomWithInheritance();
        ProbabilityRandomWithComposition probabilityRandomWithComposition = new ProbabilityRandomWithComposition();
        
        System.out.print("Using nextBoolean in ProbabilityRandomWithInheritance, this method is inherited from Random: ");
        System.out.println(probabilityRandomWithInheritance.nextBoolean());
        System.out.print("Using nextBoolean in ProbabilityRandomWithComposition, this method is defined in the class: ");
        System.out.println(probabilityRandomWithComposition.nextBoolean());
        
        System.out.println("Using nextBooleanWithProbability in ProbabilityRandomWithInheritance: ");
        System.out.println("Probability 0: " + probabilityRandomWithInheritance.nextBooleanWithProbability(0));
        System.out.println("Probability 1: " + probabilityRandomWithInheritance.nextBooleanWithProbability(1));
        System.out.print("Running nextBooleanWithProbability with probability 0.8 10000 times gives result: ");
        System.out.println(calculateProbabilityInheritance(probabilityRandomWithInheritance, 0.8));
        
        System.out.println("Using nextBooleanWithProbability in ProbabilityRandomWithComposition: ");
        System.out.println("Probability 0: " + probabilityRandomWithComposition.nextBooleanWithProbability(0));
        System.out.println("Probability 1: " + probabilityRandomWithComposition.nextBooleanWithProbability(1));
        System.out.print("Running nextBooleanWithProbability with probability 0.8 10000 times gives result: ");
        System.out.println(calculateProbabilityComposition(probabilityRandomWithComposition, 0.8));

    }
    
    private static double calculateProbabilityInheritance (ProbabilityRandomWithInheritance random, double probability) {
        boolean result;
        double trueResponse = 0;
        int numberOfIterations = 10000;
        for (int i = 0; i < numberOfIterations; i++){
            result = random.nextBooleanWithProbability(probability);
            if (result){
                trueResponse++;
            }
        }
        return trueResponse/numberOfIterations;
    }
    
    private static double calculateProbabilityComposition (ProbabilityRandomWithComposition random, double probability) {
        boolean result;
        double trueResponse = 0;
        int numberOfIterations = 10000;
        for (int i = 0; i < numberOfIterations; i++){
            result = random.nextBooleanWithProbability(probability);
            if (result){
                trueResponse++;
            }
        }
        return trueResponse/numberOfIterations;
    }
}
