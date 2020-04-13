package org.ivka;

import java.util.Scanner;

public class GreatestCommonDivisorTask {

    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10)return -1;
        else {
            int smallerNumber = Math.min(first, second);
            int greatestCommonDivisor = 1;
            for (int i = 1; i <= smallerNumber; i++){
                if (first % i == 0 && second % i == 0)greatestCommonDivisor = i;
            }
            return greatestCommonDivisor;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println(getGreatestCommonDivisor(first, second));
    }
}
