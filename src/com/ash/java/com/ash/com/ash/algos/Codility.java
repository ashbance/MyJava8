package com.ash.java.com.ash.com.ash.algos;

import java.net.SocketPermission;

/**
 * Created by ashokbance on 13/07/16.
 */
public class Codility {

    public static void main(String[] args) {
        addHashesDesc();
        addHashesAsc();

        int[] a = new int[]{5,6,7,1,3,4,5,6,2,4,2,5,2,6};

        System.out.println("balance is " + findBalancingPoint(a));


        isIntegerOverflow(Integer.MAX_VALUE-4, 5);

    }


    /**
     ########
     #######
     ######
     #####
     ####
     ###
     ##
     #
     */
    private static void addHashesDesc() {


        String xx = new String("########");
        String pad = "";

        for (int i=0; i<xx.length(); i++) {

            String a = xx.substring(i);

            System.out.println(pad + a);
            pad = pad + " ";
        }
    }


    /**

           #
          ##
         ###
        ####
       #####
      ######
     #######
     */
    private static void addHashesAsc() {


        String xx = new String("########");

        for (int i=xx.length(); i>0; i--) {
            String pad = "";

            for (int j=0; j<i; j++) {
                pad = pad + " ";
            }

            String a = xx.substring(i);

            System.out.println(pad + a);
        }

    }


    /**
     * Find the balancing point in an array of numbers
     *
     * for example 1234567 - at which point is the sum of the right equal to the sum on the left
     */
    public static int findBalancingPoint(int[] ints) {

        int right = 0;
        int left = 0;

        for (int i: ints) {
            right += i;
        }


        for (int idx =0; idx < ints.length; idx++) {
            right = right - ints[idx];

            left = left + ints[idx];

            if (left > right) {
                System.out.println("left is " + left + " right is " + right);
                return idx;
            }
        }

        return -1;
    }


    /**
     * Will this number cause an integer overflow
     * @return
     */
    private static boolean isIntegerOverflow(int a, int b) {

        int val = Integer.MAX_VALUE - a;

        if (b > val) {
            System.out.println("value too large " + b);
            return true;
        }

        return false;
    }











}
