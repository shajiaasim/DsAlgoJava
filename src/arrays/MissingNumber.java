//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
//
//        Example 1:
//
//        Input: [3,0,1]
//        Output: 2
//        Example 2:
//
//        Input: [9,6,4,2,3,5,7,0,1]
//        Output: 8
//        Note:
//        Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
// https://leetcode.com/articles/missing-number/

package arrays;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    public static void main(String[] args) {
        int [] array = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(array));
        System.out.println(missingNumberHashSet(array));

        System.out.println("Hello World!");
    }

    //Solution 1: using boolean array
    public static int missingNumber (int [] array){
        int size = array.length;
        boolean [] bArray = new boolean [size+1];
        for (int num : array){
            bArray [num] = true;
        }

        for (int i=0;i<bArray.length;i++){
            if (!bArray[i]) return i;
        }

        return -1;
    }


    //Solution2: Using Hashset

    public static int missingNumberHashSet (int [] array){

        Set<Integer> intSet = new HashSet<Integer>();

        for (int num : array){
           intSet.add(num);
        }

        int expectedNumCount = intSet.size()+1;

        for (int i=0; i<expectedNumCount;i++){
            if(!intSet.contains(i)) return i;
        }

        return -1;

    }



}
