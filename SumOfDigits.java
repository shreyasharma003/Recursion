import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the interger whose digits' sum you want");
        int n = sc.nextInt();

        int ans = printDigitSum(n);

        System.out.println(ans);
        sc.close();
    }

    static int printDigitSum(int n){
        if(n==0){
            return 0;
        }

        return (n%10) + printDigitSum(n/10);
    }
}
