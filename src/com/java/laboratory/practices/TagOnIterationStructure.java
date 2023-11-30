package com.java.laboratory.practices;

public class TagOnIterationStructure {
    public static void main(String[] args) {
        tagTest();
    }

    public static void tagTest(){
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + ", j: " + j);
                if (i == 2 && j == 2) {
                    break outerLoop; // Sale del bucle etiquetado como "outerLoop"
                }
            }
        }
    }

    public static void tagTest2(){
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop iteration: " + i);

            innerLoop:
            for (int j = 1; j <= 3; j++) {
                System.out.println("    Inner loop iteration: " + j);

                if (i == 2 && j == 2) {
                    System.out.println("        Found the target, breaking inner loop.");
                    break innerLoop;  // Breaks the inner loop labeled as "innerLoop"
                }

                if (i == 3 && j == 1) {
                    System.out.println("        Skipping this iteration, continuing inner loop.");
                    continue innerLoop;  // Skips the rest of the inner loop and continues with the next iteration
                }

                System.out.println("        Processing other cases in the inner loop.");
            }
        }
    }
}
