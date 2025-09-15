import java.util.Scanner;
public class RecThree{
    public static void printSum(int n, int sum){
        if (n==0) {
            System.out.println(sum);
            return;
        }
        sum = sum+n;
        printSum(n-1, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

       printSum(n, 0);

       sc.close();
    }
}