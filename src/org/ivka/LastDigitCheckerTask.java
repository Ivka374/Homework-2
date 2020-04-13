package org.ivka;

import java.util.Scanner;

public class LastDigitCheckerTask {

    public static boolean hasSameLastDigit(int a, int b, int c){
        if (!isValid(a) || !isValid(b) || !isValid(c))return false;
        else {
            return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
        }
    }

    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(hasSameLastDigit(a, b, c));
        System.out.println(isValid(scanner.nextInt()));

        scanner.close();
    }
}
