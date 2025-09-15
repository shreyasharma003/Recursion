import java.util.Scanner;

public class RecFour {

    public static void printFact(int n, int fact){
        if (n==1) {
            System.out.println(fact);
            return;
        }

        fact = fact*n;
        printFact(n-1, fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        printFact(n, 1);
        sc.close();
    }
}
