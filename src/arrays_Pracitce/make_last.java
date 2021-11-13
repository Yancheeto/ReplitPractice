package arrays_Pracitce;

import java.util.Arrays;
import java.util.Scanner;

public class make_last {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[]nums = new int[size];
        for(int i=0; i<nums.length; i++){
            nums[i]= scan.nextInt();
        }
        int [] nums2 = new int[size*2];
        for(int j=0; j<nums2.length-1; j++){
            nums2[nums2.length-1] = nums [nums.length-1];
        }

        System.out.println(Arrays.toString(nums2));

    }




}
/*
Given an int array nums, print a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more.
Hint = by default a new int array contains all 0's
Ex:
input: 4, 5, 6
output:[0, 0, 0, 0, 0, 6]
 */