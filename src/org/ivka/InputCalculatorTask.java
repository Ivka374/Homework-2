package org.ivka;

import java.util.Scanner;

public class InputCalculatorTask {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        long average;
        while(true){
            if (scanner.hasNextInt()){
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                if (count >= 1) {
                    average = Math.round(sum / count);
                } else average = 0;
                break;
            }
        }
        scanner.close();
        System.out.println("SUM = " + sum + " AVG = " + average);
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
