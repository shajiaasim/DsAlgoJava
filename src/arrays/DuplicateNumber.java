// 287. Find the Duplicate Number
// Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
//
//        Example 1:
//
//        Input: [1,3,4,2,2]
//        Output: 2
//        Example 2:
//
//        Input: [3,1,3,4,2]
//        Output: 3
//        Note:
//
//        You must not modify the array (assume the array is read only).
//        You must use only constant, O(1) extra space.
//        Your runtime complexity should be less than O(n2).
//        There is only one duplicate number in the array, but it could be repeated more than once.
//https://leetcode.com/problems/find-the-duplicate-number/description/


package arrays;

public class DuplicateNumber {

    public static void main(String[] args) {
        int [] array = {1,3,4,2,2};
        int [] array2 = {3,1,3,4,2};


        System.out.println(duplicateNumber(array2));
     //   System.out.println(missingNumberHashSet(array));

        System.out.println("Hello World!");
    }

    private static int duplicateNumber(int[] array) {
        boolean [] bArray = new boolean [array.length];

        for (int num : array){
            if(bArray[num]) return num;
            else bArray[num] = true;
        }

        return -1;

    }

}
