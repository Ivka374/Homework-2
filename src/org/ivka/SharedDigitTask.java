package org.ivka;

import java.util.Scanner;

public class SharedDigitTask {

    public static boolean hasSharedDigit(int a, int b){
        if (a < 10 || b < 10 || a > 99 || b > 90)return false;
        else {
            return a % 10 == b % 10 || a % 10 == b / 10 || a / 10 == b % 10 || a / 10 == b / 10;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(hasSharedDigit(scanner.nextInt(), scanner.nextInt()));

        scanner.close();
    }
}
