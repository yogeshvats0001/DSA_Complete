import java.util.Scanner;

public class factorial{

    static Scanner scan = new Scanner(System.in);

    static int solution(int num){
        //BC
        if(num == 0) return 1;
        
        return num * solution(num-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        int resultant = solution(num);
        System.out.println("Factorial of " + num + " is : " + resultant);
    }
}