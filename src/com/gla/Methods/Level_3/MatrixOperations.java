package com.gla.Methods.Level_3;
import java.util.Scanner;
public class MatrixOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of Matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns of Matrix A: ");
        int c1 = sc.nextInt();

        System.out.print("Enter rows of Matrix B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns of Matrix B: ");
        int c2 = sc.nextInt();

        int[][] A = createRandomMatrix(r1, c1);
        int[][] B = createRandomMatrix(r2, c2);

        System.out.println("\nMatrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        if (r1 == r2 && c1 == c2) {

            System.out.println("\nAddition (A + B):");
            displayMatrix(addMatrix(A, B));

            System.out.println("\nSubtraction (A - B):");
            displayMatrix(subtractMatrix(A, B));

        } else {
            System.out.println("\nAddition and Subtraction not possible (different sizes)");
        }

        if (c1 == r2) {

            System.out.println("\nMultiplication (A × B):");
            displayMatrix(multiplyMatrix(A, B));

        } else {
            System.out.println("\nMultiplication not possible (columns of A ≠ rows of B)");
        }

        sc.close();
    }

    // (a) Create Random Matrix
    public static int[][] createRandomMatrix(int rows, int cols) {

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = (int)(Math.random() * 10); // 0–9

        return matrix;
    }

    // (b) Add Two Matrices
    public static int[][] addMatrix(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];

        return result;
    }

    // (c) Subtract Two Matrices
    public static int[][] subtractMatrix(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];

        return result;
    }

    // (d) Multiply Two Matrices
    public static int[][] multiplyMatrix(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = B[0].length;
        int common = A[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    // Display Matrix
    public static void displayMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
