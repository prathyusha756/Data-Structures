package DataStructures.Recursion;

import java.util.Scanner;

public class Factorial {
    public int factorial(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }

    }

    public static void main(String[] args){
        //creating scanner object to take input from user//
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter an integer to find factorial");
        int num= scanner.nextInt();
        //creating1 factorial object//
        Factorial fact= new Factorial();
        System.out.println(fact.factorial(num));


    }
}
