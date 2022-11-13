/* 977. Squares of a Sorted Array 
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 * 
 * Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
 * 
 * Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 * 
*/  

public class squareSortedArray {
    public static void merge(int[] arr, int start, int mid, int end){
        int len1 = mid - start + 1;
        int len2 = end - (mid + 1) + 1;
        //create two arrays
        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];
        //copy the elements from arr to arr1 and arr2 depending upon start/mid/end
        int p = 0;
        for(int i=start; i <= mid; i++) arr1[p++] = arr[i];
        p = 0;
        for(int i=mid+1; i<=end; i++) arr2[p++] = arr[i];
        //update arr with the ascending order of arr1 and arr2
        int originalIndex = start, index1 = 0, index2 = 0;
        while(index1 < len1 && index2 < len2){
            if(arr1[index1] <= arr2[index2]) arr[originalIndex++] = arr1[index1++];
            else arr[originalIndex++] = arr2[index2++];
        }
        //if arr2 exhausted
        while(index1 < len1) arr[originalIndex++] = arr1[index1++];
        //if arr1 exhausted
        while(index2 < len2) arr[originalIndex++] = arr2[index2++];
    }

    public static void mergeSort(int[] nums, int s, int e){
        //BC
        if(s>=e) return;
        int mid = s + (e-s)/2;
        //left most : Recursion
        mergeSort(nums, s, mid);
        //right most : Recursion
        mergeSort(nums, mid+1, e);
        //merge the left and right array
        merge(nums, s, mid, e);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-4, -1, 0, 3 ,10};
        //square the elements of nums array
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        //call the mergeSort function
        mergeSort(nums, 0, nums.length-1);
        for(int element : nums) System.out.print(element + " ");

    }
}