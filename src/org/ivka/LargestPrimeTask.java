package org.ivka;

public class LargestPrimeTask {

    public static int getLargestPrime(int number){
        if (number <= 0)return -1;
        else {
            int maxPrime;
            for (int i = 1; i <= number; i++){
                if (isPrime(i)){
                    do {
                        if (number % 1 == 0){
                            maxPrime = i;
                        }
                    }
                }
            }
        }
    }

    public static boolean isPrime(int test){
        int divident;
        for (int i = 1; i < test; i++){
            if (test % i == 0)divident = i;
        }
        if (divident == 1)return true;
        else return false;
    }

    public static void main(String[] args) {

    }
}
