import java.util.Scanner;

public class NumberOfZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to check: ");
        int n = sc.nextInt();

        check(n);
        System.out.println(count);

        sc.close();
    }

    static int count = 0;

    static void check(int n){
        if(n==0) return;

        int rem = n % 10;

        if(rem == 0){
            count++;
        }
        check(n/10);
    }
}
