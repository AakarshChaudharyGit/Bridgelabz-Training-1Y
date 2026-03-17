package com.gla.Exception_handling;

public class main {
    public static void main(String[] args){
        int a = 5;
        int b = 0;
        int[] arr ={5,6,1,6,8,9};
        String str = null;
        System.out.println("A");
        try {
            System.out.println(arr[6]);
            System.out.println(str.length());
            System.out.println(a/b);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bound");
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("B");
            System.out.println("finally executed");
        }
    }
}
