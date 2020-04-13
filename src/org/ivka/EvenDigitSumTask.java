package org.ivka;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EvenDigitSumTask {
    public static int getEvenDigitSum(int number){
        if (number >= 0){
            int sum = 0;
            for (int i = number; i > 0; i /= 10){
                if ((i % 10) % 2 == 0)sum += i%10;
            }
            return sum;
        }
        else return -1;
    }
}
