package org.ivka;

import java.util.Scanner;

public class NUmberToWordsTask {

    public static int reverse(int number){
        int reverse = 0;
        for (int i = number; i > 0; i /= 10){
            reverse *= 10;
            reverse += i%10;
        }
        return reverse;
    }

    public static int extraZeroes(int number){
        if (number < 0)return -1;
        else {
            int zeroCount = 0;
            for (int i = number; i > 0; i /= 10){
                if (i % 10 == 0) {
                    zeroCount++;
                }
            }
            return zeroCount;
        }
    }

    public static void numberToWords(int number){
        for (int i = reverse(number); i > 0; i /= 10){
            switch (i%10){
                case 0:
                    System.out.print("zero ");
                    break;
                case 1:
                    System.out.print("one ");
                    break;
                case 2:
                    System.out.print("two ");
                    break;
                case 3:
                    System.out.print("three ");
                    break;
                case 4:
                    System.out.print("four ");
                    break;
                case 5:
                    System.out.print("five ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight ");
                    break;
                case 9:
                    System.out.print("nine ");
                    break;
            }
        }
        for (int i = 1; i <= extraZeroes(number); i++){
            System.out.print("zero ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        numberToWords(scanner.nextInt());
    }
}
