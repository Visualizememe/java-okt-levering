package InnleveringOkt;

import java.util.Arrays;

public class O1A {
    public static void main (String[] args) {
        int[] tabell = {1, 2, 3, 4};

        // You do you
    }

    public static void skrivUt(int[] tabell) {
        for (int x : tabell) {
            System.out.println("Tall i tabell: " + x);
        }
    }

    public static String tilString (int[] tabell) {
        // Starting string
        StringBuilder stringBuilder = new StringBuilder()
                .append("[");

        // Appending all integers in array "tabell"
        for (int i = 0; i < tabell.length; i++) {
            int x = tabell[i];
            boolean nextValExists = i < (tabell.length - 1);

            stringBuilder.append(x);

            if (nextValExists) {
                stringBuilder.append(",");
            }
        }

        // Finalizing
        stringBuilder.append("]");

        return stringBuilder
                .toString();
    }

    public static void summer(int[] tabell) {
        int normalForSum = summerNormalFor(tabell);
        int whileLoopSum = summerWhileLoop(tabell);
        int extendedForSum = summerExtendedForLoop(tabell);

        System.out.println("Normal for sum: " + normalForSum);
        System.out.println("While loop sum: " + whileLoopSum);
        System.out.println("Extended for loop sum: " + extendedForSum);
    }

    public static int summerNormalFor(int[] tabell) {
        int sum = 0;

        for (int x : tabell) {
            sum += x;
        }

        return sum;
    }

    public static int summerWhileLoop(int[] tabell) {
        int i = 0;
        int sum = 0;

        while (i < tabell.length) {
            sum += tabell[i];
            i++;
        }

        return sum;
    }

    public static int summerExtendedForLoop(int[] tabell) {
        int i = 0;
        int sum = 0;

        for (i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }

        return sum;
    }

    public static boolean finnesTall(int[] tabell, int tall) {
        for (int x : tabell) {
            if (x == tall) {
                return true;
            }
        }

        return false;
    }

    public static int posisjonTall(int[] tabell, int tall) {

        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }

        return -1;
    }

    public static int[]reverser (int[] tabell) {
        // Using new int to prevent memory issues with "out of bounds"
        int[] reversedArray = new int[tabell.length];

        for (int i = 0; i < tabell.length; i++) {
            reversedArray[i] = tabell[tabell.length - i - 1];
        }

        return reversedArray;
    }

    public static boolean erSortert(int[] tabell) {
        for (int i = 0; i < tabell.length; i++) {
            if (i > 0) {
                if (tabell[i - 1] >= tabell[i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int[] settSammen(int[] tabell1, int[] tabell2) {
        // Initialize an array with all bytes pre-disposed (for memory, to avoid issues "out of bounds")
        int[] combinedArray = new int[tabell1.length + tabell2.length];

        for (int i = 0; i < tabell1.length; i++) {
            combinedArray[i] = tabell1[i];
        }

        for (int y = 0; y < tabell2.length; y++) {
            combinedArray[tabell1.length + y] = tabell2[y];
        }

        return combinedArray;
    }
}
