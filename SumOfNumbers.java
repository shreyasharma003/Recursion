import java.util.Scanner;

public class SumOfNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want the sum: ");
        int n = sc.nextInt();

        int ans = printSum(n);

        System.out.println("The sum of numbers from 0 to " +n+ " is " + ans);

        sc.close();
    }

    static int printSum(int n){
        if(n==0){
            return 0;
        }
        return n+printSum(n-1);
    }
}