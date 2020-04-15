package org.ivka;

import java.util.Scanner;

public class LargestPrimeTask {

    public static int getLargestPrime(int number){
        if (number <= 0)return -1;
        else {
            int largestPrime = 1;
            for (int i = 1; i <= number/2; i++){
                if (number%i == 0) {
                    int divident = 1;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) divident = j;
                    }
                    if (divident == 1) largestPrime = i;
                }
            }
            if (largestPrime == 1)return number;
            else return largestPrime;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getLargestPrime(scanner.nextInt()));

        scanner.close();
    }
}
