package org.ivka;

import java.util.Scanner;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if (number >= 0) {
            int sum = number % 10;
            for (int i = number / 10; i > 0; i /= 10) {
                if (i < 10) sum += i;
            }
            if (number < 10)sum *= 2;
            return sum;
        } else return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sumFirstAndLastDigit(scanner.nextInt()));

        scanner.close();
    }
}
