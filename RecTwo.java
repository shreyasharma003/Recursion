// import java.util.Scanner;

public class RecTwo {

    public static void printNum(int n){
        if (n==6) {
            return;
        }

        System.out.println(n);

        printNum(n+1);
    }

    public static void main(String args[]){
        // Scanner sc = new Scanner (System.in);
        // int n= sc.nextInt();

        printNum(1);
    }
}
