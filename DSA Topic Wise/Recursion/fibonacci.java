import java.util.Scanner;

public class fibonacci {
    static Scanner scan = new Scanner(System.in);

    static int solution(int num){
        //BC
        if(num == 0 || num == 1) return num;

        return solution(num-1) + solution(num-2);
    }

    public static void main(String[] args) {
        System.out.println("Enter the index(starting from 0): ");
        int num = scan.nextInt();
        int result = solution(num);
        System.out.println("Term at : " + num + " is : " + result);
    }
}
