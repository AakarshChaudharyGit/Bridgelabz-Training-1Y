package com.gla.Methods.Level_3;
import java.util.Scanner;
public class MatrixAdvanced {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (2 or 3): ");
        int n = sc.nextInt();

        int[][] matrix = createRandomMatrix(n, n);

        System.out.println("\nMatrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix));

        if (n == 2) {

            int det = determinant2x2(matrix);
            System.out.println("\nDeterminant: " + det);

            if (det != 0) {
                System.out.println("\nInverse:");
                displayDoubleMatrix(inverse2x2(matrix));
            } else {
                System.out.println("Inverse not possible (determinant = 0)");
            }

        } else if (n == 3) {

            int det = determinant3x3(matrix);
            System.out.println("\nDeterminant: " + det);

            if (det != 0) {
                System.out.println("\nInverse:");
                displayDoubleMatrix(inverse3x3(matrix));
            } else {
                System.out.println("Inverse not possible (determinant = 0)");
            }
        }

        sc.close();
    }

    // (a) Create Random Matrix
    public static int[][] createRandomMatrix(int rows, int cols) {

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = (int)(Math.random() * 5) + 1;

        return matrix;
    }

    // (b) Transpose
    public static int[][] transpose(int[][] matrix) {

        int[][] result = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                result[j][i] = matrix[i][j];

        return result;
    }

    // (c) Determinant 2x2
    public static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    // (d) Determinant 3x3
    public static int determinant3x3(int[][] m) {

        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // (e) Inverse 2x2
    public static double[][] inverse2x2(int[][] m) {

        double det = determinant2x2(m);
        double[][] inv = new double[2][2];

        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;

        return inv;
    }

    // (f) Inverse 3x3
    public static double[][] inverse3x3(int[][] m) {

        double det = determinant3x3(m);
        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    // (g) Display int matrix
    public static void displayMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }

    // Display double matrix
    public static void displayDoubleMatrix(double[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                System.out.printf("%.2f\t", matrix[i][j]);
            System.out.println();
        }
    }
}
