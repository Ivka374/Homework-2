package org.ivka;

import java.util.Scanner;

public class PaintJobTask {

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)return -1;
        else {
            return getBucketCount(width, height, areaPerBucket) - extraBuckets;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0)return -1;
        else {
            return (int) (Math.ceil(height*width /areaPerBucket));
        }
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (areaPerBucket <= 0 || area <= 0)return -1;
        else {
            return (int) (Math.ceil(area/areaPerBucket));
        }
    }

    public static void main(String[] args) {

        /// Some lines for testing different parameters all at once
        Scanner scanner = new Scanner(System.in);
        double h1 = scanner.nextDouble();
        double w1 = scanner.nextDouble();
        double apb1 = scanner.nextDouble();
        int eb1 = scanner.nextInt();
        double h2 = scanner.nextDouble();
        double w2 = scanner.nextDouble();
        double apb2 = scanner.nextDouble();
        double a3 = scanner.nextDouble();
        double apb3 = scanner.nextDouble();

        System.out.println(getBucketCount(w1, h1, apb1, eb1));
        System.out.println(getBucketCount(w2, h2, apb2));
        System.out.println(getBucketCount(a3, apb3));

        scanner.close();
    }
}
