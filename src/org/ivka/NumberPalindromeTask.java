package org.ivka;

import java.util.Scanner;

public class NumberPalindromeTask {

    public static boolean isPalindrome(int number){
        int reverse = 0;
        for (int i = number; i > 0; i /= 10){
            reverse *= 10;
            reverse += i%10;
        }
        return reverse == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isPalindrome(scanner.nextInt()));

        scanner.close();
    }
}
