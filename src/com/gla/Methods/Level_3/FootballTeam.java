package com.gla.Methods.Level_3;

public class FootballTeam {
    public static void main(String[] args) {

        int[] heights = generateHeights(11);

        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Heights of Players:");
        for (int h : heights)
            System.out.print(h + " ");

        System.out.println("\n\nMean Height: " + mean);
        System.out.println("Shortest Height: " + shortest);
        System.out.println("Tallest Height: " + tallest);
    }

    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++)
            heights[i] = (int)(Math.random() * 101) + 150; // 150–250
        return heights;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr)
            sum += num;
        return sum;
    }

    public static double findMean(int[] arr) {
        return (double)findSum(arr) / arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int num : arr)
            min = Math.min(min, num);
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int num : arr)
            max = Math.max(max, num);
        return max;
    }
}
