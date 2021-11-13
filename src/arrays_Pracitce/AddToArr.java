package arrays_Pracitce;

import java.util.Arrays;

public class AddToArr {
    public static void main(String[] args) {

        int [] arr = {5, 7, 3};
        int num = 14;
        System.out.println(Arrays.toString(add_to_arr(arr, num)));

    }


    public static int[] add_to_arr(int[] arr, int num){

        int [] newArr = new int[arr.length+1];
        for(int i=0; i<arr.length; i++){
            newArr[i]=arr[i];

        }
        newArr[newArr.length-1]=num;
    return newArr;
    }
}
