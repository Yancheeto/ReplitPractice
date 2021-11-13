package arrays_Pracitce;

import java.util.Arrays;

public class ReverseArray {
    /*
    Given an array nums with 7 integers already assigned, write code to reverse it.
    PseudoCode:

Take values at index 0 and last index and swap them

Take values at index 0+1 and last index-1 and swap them

Keep repeating step 1 and 2 using a loop until you reach the middle of the array (nums.length /2)
     */
    public static void main(String[] args) {

        int [] nums = {7, 25, 74, 32, 9, 81, 15};

        for(int i= 0; i<nums.length/2; i++){
            int temp = nums[i];
            nums[i] = nums[6-i];
            nums [6-i] = temp;

        }

        System.out.println(Arrays.toString(nums));


    }




}
