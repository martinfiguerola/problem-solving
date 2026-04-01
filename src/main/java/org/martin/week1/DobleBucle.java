package org.martin.week1;

public class DobleBucle {


    public static void main(String[] args) {

        int[] array = {2, 5, 7, 4};

        for (int outer : array) {
            for (int inner : array) {
                System.out.println("outer: " + outer + " inner: " + inner);
            }
        }
    }


}