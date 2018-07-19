package DataStructures.Recursion;

import java.util.Arrays;
import java.util.Scanner;

//Generate all the strings of n bits.Assume A[0..n-1] is an array of size n.
public class StringOfnBits {
    public void binary(int arr[],int n){
        if(n<1){
            System.out.println(Arrays.toString(arr));
        }
        else {
            arr[n - 1] = 0;
            System.out.println(" 1");
            binary(arr, n - 1);
            System.out.println(" 2");
            arr[n - 1] = 1;
            System.out.println(" 3");
            binary(arr, n - 1);
        }
    }

    public static void main(String[] args){
       int n;
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter array length n :");
        n=scanner.nextInt();
        int arr[]=new int[n];
        StringOfnBits obj=new StringOfnBits();
        obj.binary(arr,n);

    }

}

