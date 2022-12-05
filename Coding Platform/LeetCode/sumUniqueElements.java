/* 1748. Sum of Unique Elements
 * You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
 Return the sum of all the unique elements of nums.
 * 
 * Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
 * 
 * Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
 */

import java.util.*;


public class sumUniqueElements{
    public static int sumOfUnique(int[] nums){
        int resultSum = 0;

        //Step1. Create a HashMap and store the element and its frequency as Key-Value pair.
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element : nums){
            if(map.containsKey(element)){
                map.put(element, map.get(element) + 1);
            }else{
                map.put(element, 1);
            }
        }

        // //Step2.A. Check the uniqueness of the element and sum (Using simple index way)
        // for(int i=0; i<nums.length; i++){
        //     if(map.get(nums[i])==1){
        //         resultSum += nums[i];
        //     }
        // }

        // Step2.B. Check the uniqueness of the element and sum (Using EntrySet Iterator way)
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                resultSum += entry.getKey();
            }
        }

        return resultSum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1,3,2};
        int result = sumOfUnique(nums);
        System.out.println(result);
    }
}

 //Note : In case of any frequency type question, we must think of using Hashmap first of all.