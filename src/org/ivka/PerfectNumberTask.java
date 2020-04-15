package org.ivka;

import java.util.Scanner;

public class PerfectNumberTask {

    public static boolean isPerfectNumber(int number){
        if (number < 6)return false;
        else {
            int sumOfDividents = 0;
            for (int i = 1; i < number; i++){
                if (number%i == 0)sumOfDividents += i;
            }
            return sumOfDividents == number;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isPerfectNumber(scanner.nextInt()));

        scanner.close();
    }
}
