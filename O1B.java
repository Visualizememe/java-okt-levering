package InnleveringOkt;

public class O1B {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        String matrixStr = tilString(matrix1);
        skrivUtv1(matrix1);
        System.out.println(matrixStr);
    }

    public static void skrivUtv1 (int[][] matrise) {
        int xi = 0;

        for (int[] x : matrise) {
            for (int y : x) {
                System.out.println("Matrise " + xi + ": " + y);
            }
            xi++;
        }
    }

    public static String tilString (int[][] matrise) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int[] x : matrise) {
            for (int y : x) {
                stringBuilder.append(y + " ");
            }

            stringBuilder.append("\\n");
        }

        return stringBuilder.toString();
    }

    public static int[][] skaler(int tall, int[][] matrise) {
        int[][] scaledMatrix = new int[matrise.length][matrise[0].length];

        int xi = 0;
        for (int[] x : matrise) {
            int yi = 0;
            for (int y : x) {
                scaledMatrix[xi][yi] = x[yi] * tall;
                yi++;
            }

            xi++;
        }

        return scaledMatrix;
    }

    public static boolean erLik(int[][] mat1, int[][] mat2) {
        int[] flatArr1 = tilFlatArray(mat1);
        int[] flatArr2 = tilFlatArray(mat2);

        for (int i = 0; i < flatArr1.length; i++) {
            if (flatArr1[i] != flatArr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static int[] tilFlatArray (int[][] matrise) {
        var sumNums = 0;

        for (int[] x : matrise) {
            for (int y : x) {
                sumNums++;
            }
        }

        int[] flatArrayNums = new int[sumNums];
        int i = 0;

        for (int[] x : matrise) {
            for (int y : x) {
                flatArrayNums[i] = y;
                i++;
            }
        }

        return flatArrayNums;
    }
}
