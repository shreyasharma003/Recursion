import java.util.Scanner;
public class RecFive {
    public static void printFib(int a, int b, int n){
        if (n==0) {
            System.out.println(a+b);
            return;
        }
        int c = a+b;
        printFib(b, c, n-1);
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        printFib(a, b, n-2);

        sc.close();
    }
}
