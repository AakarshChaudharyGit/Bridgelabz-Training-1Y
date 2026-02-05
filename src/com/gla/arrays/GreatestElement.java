package com.gla.arrays;
import java.util.Scanner;
public class GreatestElement{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter num of elements in array:");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
//      checking max num
        int max = 0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Greatest element is: "+max);
    }
}