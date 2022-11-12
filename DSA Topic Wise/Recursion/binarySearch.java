import java.util.Scanner;

public class binarySearch{
    static Scanner scan = new Scanner(System.in);

    static int solution(int[] arr, int target, int start, int end){
        //BC
        if(start > end) return -1;

        int mid = start + (end - start)/2;
        int value = arr[mid];
        if(value == target) return mid;
        else if( value < target) return solution(arr, target, mid + 1, end);
        else return solution(arr, target, start, mid - 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements: ");
        for(int i=0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println("\nEnter the target element: ");
        int target = scan.nextInt();

        int indexResult = solution(arr, target, 0, size-1);
        if(indexResult == -1) {
            System.out.println("The given target " + target + " is not present");
        }else{
            System.out.println("The given target " + target + " is at : " + indexResult);
        }
    }
}