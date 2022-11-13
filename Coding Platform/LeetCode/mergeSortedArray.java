/* 88. Merge Sorted Array
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * 
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * 
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * 
 */

public class mergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        //create a new result array
        int[] result = new int[m+n];
        //compare the values of nums1 and nums2 for result array.
        int originalIndex = 0, index1 = 0, index2 = 0;
        while(index1 < m && index2 < n){
            if(nums1[index1] <= nums2[index2]) result[originalIndex++] = nums1[index1++];
            else result[originalIndex++] = nums2[index2++];
        }
        //if nums2 exhausted
        while(index1 < m) result[originalIndex++] = nums1[index1++];
        //if nums1 exhausted
        while(index2 < n) result[originalIndex++] = nums2[index2++];

        //copy back the array to the nums1
        for(int i=0; i<m+n; i++) nums1[i] = result[i];
        // not nums1 = result;
    }
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println("Sorted nums1: ");
        for(int element : nums1){
            System.out.print(element + " ");
        }
    }
}


/*1. We need to create a new array of result/ nums1, as if we do manipulation on the original array then it is not possible for us to hold the original element for the comparison. Always create a new reference to the original array.
 * 
 * 
 * 
 */