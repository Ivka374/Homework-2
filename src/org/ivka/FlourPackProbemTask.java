package org.ivka;

import java.util.Scanner;

public class FlourPackProbemTask {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            if (bigCount * 5 + smallCount < goal) return false;
            else {
                if (goal % 5 > smallCount) return false;
                else return true;
            }
        }
        else return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bigPackages = scanner.nextInt();
        int smallPackages = scanner.nextInt();
        int goal = scanner.nextInt();
        System.out.println(canPack(bigPackages, smallPackages, goal));

        scanner.close();
    }
}
