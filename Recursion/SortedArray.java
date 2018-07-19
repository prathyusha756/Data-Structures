package DataStructures.Recursion;

import java.util.Scanner;

//check whether the given array is sorted using recursion and iterative methods
public class SortedArray {

    public boolean usingRecursion(int[] arr,int n){

        if(n==1||n==0){
            return true;
        }
        else{
            if(arr[n-1]>=arr[n-2]&& usingRecursion( arr,n-1)){
                return true;
            }
            else return false;
        }

    }
    public boolean usingIteration(int[] arr,int n){


        if(n==1||n==0){
            return true;
        }
        else{
             for(int i=1;i<n;i++) {
                 if (arr[i - 1] > arr[i]) {
                     return false;
                 }

             }
        }
        return true;

    }
    public static void main(String[] args){
        //Declaring and instantiatino of an array//
        int[] arr=new int[5];
        int n= arr.length;
        //creating a scanner object//
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter array elements");
        //Initialising an array//
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        SortedArray obj=new SortedArray();
        boolean recurResult=obj.usingRecursion(arr,n);
        System.out.println("Given array is sorted1: " + recurResult);

        boolean iterResult =obj.usingIteration(arr,n);
        System.out.println("Given array is sorted2: " + iterResult);

    }
}
