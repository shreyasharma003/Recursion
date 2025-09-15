import java.util.Scanner;

public class Nto1{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println("1 to "+n);
        printRev(n);

        System.out.println(n+ " to 1");
        print(n);

        System.out.println("both together");
        printBoth(n);

        sc.close();
    }

    static void print(int n){

        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }

    static void printRev(int n){
        if(n==0){
            return;
        }

        printRev(n-1);
        System.out.println(n);
    }

    static void printBoth(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }
}