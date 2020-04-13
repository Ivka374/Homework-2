package org.ivka;

import java.util.Scanner;

public class DiagonalStarTask {

    public static void printSquareStar(int number){
        if (number < 5) System.out.println("Invalid Value");
        else {
            for (int row = 1; row <= number; row++){
                for (int column = 1; column <= number; column++){
                    if (row == 1 || row == number || column == 1 || column == number) System.out.print("*");
                    else {
                        if (row == column) System.out.print("*");
                        else  {
                            if (number - row + 1 == column) System.out.print("*");
                            else {
                                System.out.print(" ");
                            }
                        }
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printSquareStar(scanner.nextInt());

        scanner.close();
    }
}
