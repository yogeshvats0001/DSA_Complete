/* Find element occuring once when all other are present thrice
 * 
 * (using forEach arrow function)
 * Given an array of integers arr[] of length N, every element appears thrice except for one which occurs once.
Find that element which occurs once.
 * 
 * Input:
N = 4
arr[] = {1, 10, 1, 1}
Output:
10
Explanation:
10 occurs once in the array while the other
element 1 occurs thrice.
 * 
 * Input:
N = 10
arr[] = {3, 2, 1, 34, 34, 1, 2, 34, 2, 1}
Output:
3
Explanation:
All elements except 3 occurs thrice in the array.
 * 
 */

import java.util.HashMap;

public class elementOnceInThriceArray {
    static int result = -1;
    public static int elementOnce(int[] arr, int N){
        HashMap<Integer, Integer> maps = new HashMap<>();
        for(int element : arr){
            if(!maps.containsKey(element)){
                maps.put(element, 1);
            }else{
                maps.put(element, maps.get(element)+1);
            }
        }

        //Way1. using forEach arrow fucntion
        maps.forEach((k, v) -> {
            if(v == 1) setResult(k);
        });

        return getResult();
    }

    static void setResult(int k){
        result = k;
    }

    static int getResult(){
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 10, 1, 1};
        int N = arr.length;
        int result = elementOnce(arr, N);
        System.out.println(result);
    }
}

//Note: forEach arrow function can't return any value;