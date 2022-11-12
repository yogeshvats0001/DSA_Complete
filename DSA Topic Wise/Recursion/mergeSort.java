public class mergeSort {
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

    public static void mergeSorting(int[] arr, int start, int end){
        //BC
        if(start >= end) return;

        int mid = start + (end - start)/2;
        //leftMost sorting : Recursion
        mergeSorting(arr, start, mid);
        //rightMost sorting : Recursion
        mergeSorting(arr, mid+1, end);
        //merge the sorted arrays
        merge(arr, start, mid, end);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6,3,8,5,1,4,10,9};
        mergeSorting(arr, 0, arr.length-1);

        for(int element : arr) System.out.print(element + " ");
    }
}
