/* Print all array elements appearing more than N / K times

 * N is size of array
 * Input: arr[] = { 1, 2, 6, 6, 6, 6, 6, 10 }, K = 4
Output: 6
Explanation: 
The frequency of 6 in the array is greater than N / K(= 2). Therefore, the required output is 6.

 * Input: arr[] = { 3, 4, 4, 5, 5, 5, 5 }, K = 4 
Output: 4 5 
Explanation: 
The frequency of 4 in the array is greater than N / K(= 1). 
The frequency of 5 in the array is greater than N / K(= 1). 
Therefore, the required output is 4 5.
 */
import java.util.*;
public class printElementMoreNK {
    public static void printElement(int[] arr, int N, int K){
        int min = N/K;
        Map<Integer, Integer> map = new HashMap<>();
        for(int element : arr){
            if(!map.containsKey(element)){
                map.put(element, 1);
            }else{
                map.put(element, map.get(element) + 1);
            }
        }

        //Arrow Function in java
        map.forEach((k,v) -> {
            if(v > min) System.out.println(k);
        });
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 6, 6, 6, 6, 6, 10};
        int K = 4;
        printElement(arr, arr.length, K);
    }
}


//Note: forEach arrow function can't return any value;