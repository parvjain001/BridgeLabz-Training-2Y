package level3;

import java.util.*;

public class MatrixOperations {
    public static void main(String[] args) {
        Random rand = new Random();

        int size = 3; // change to 2 for 2x2 matrix
        double[][] matrix = createRandomMatrix(size, size, rand);

        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix));

        if (size == 2) {
            double det = determinant2x2(matrix);
            System.out.println("\nDeterminant (2x2): " + det);
            System.out.println("\nInverse (2x2):");
            double[][] inv = inverse2x2(matrix);
            if (inv != null) displayMatrix(inv);
        } else if (size == 3) {
            double det = determinant3x3(matrix);
            System.out.println("\nDeterminant (3x3): " + det);
            System.out.println("\nInverse (3x3):");
            double[][] inv = inverse3x3(matrix);
            if (inv != null) displayMatrix(inv);
        }
    }

    public static double[][] createRandomMatrix(int rows, int cols, Random rand) {
        double[][] mat = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(10) + 1; // random number 1-10
        return mat;
    }

    public static double[][] transpose(double[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        double[][] trans = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                trans[j][i] = mat[i][j];
        return trans;
    }

    public static double determinant2x2(double[][] mat) {
        return mat[0][0]*mat[1][1] - mat[0][1]*mat[1][0];
    }

    public static double determinant3x3(double[][] mat) {
        return mat[0][0]*(mat[1][1]*mat[2][2] - mat[1][2]*mat[2][1])
             - mat[0][1]*(mat[1][0]*mat[2][2] - mat[1][2]*mat[2][0])
             + mat[0][2]*(mat[1][0]*mat[2][1] - mat[1][1]*mat[2][0]);
    }

    public static double[][] inverse2x2(double[][] mat) {
        double det = determinant2x2(mat);
        if (det == 0) {
            System.out.println("Matrix is singular. Inverse does not exist.");
            return null;
        }
        double[][] inv = new double[2][2];
        inv[0][0] = mat[1][1]/det;
        inv[0][1] = -mat[0][1]/det;
        inv[1][0] = -mat[1][0]/det;
        inv[1][1] = mat[0][0]/det;
        return inv;
    }

    public static double[][] inverse3x3(double[][] mat) {
        double det = determinant3x3(mat);
        if (det == 0) {
            System.out.println("Matrix is singular. Inverse does not exist.");
            return null;
        }
        double[][] inv = new double[3][3];
        inv[0][0] = (mat[1][1]*mat[2][2] - mat[1][2]*mat[2][1])/det;
        inv[0][1] = -(mat[0][1]*mat[2][2] - mat[0][2]*mat[2][1])/det;
        inv[0][2] = (mat[0][1]*mat[1][2] - mat[0][2]*mat[1][1])/det;
        inv[1][0] = -(mat[1][0]*mat[2][2] - mat[1][2]*mat[2][0])/det;
        inv[1][1] = (mat[0][0]*mat[2][2] - mat[0][2]*mat[2][0])/det;
        inv[1][2] = -(mat[0][0]*mat[1][2] - mat[0][2]*mat[1][0])/det;
        inv[2][0] = (mat[1][0]*mat[2][1] - mat[1][1]*mat[2][0])/det;
        inv[2][1] = -(mat[0][0]*mat[2][1] - mat[0][1]*mat[2][0])/det;
        inv[2][2] = (mat[0][0]*mat[1][1] - mat[0][1]*mat[1][0])/det;
        return inv;
    }

    public static void displayMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row)
                System.out.printf("%8.3f ", val);
            System.out.println();
        }
    }
}

