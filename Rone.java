import java.util.Scanner;
public class Rone{

    public static void printNum(int n){
        if(n==0)
        return;

        System.out.println(n);
        printNum(n-1);
    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        printNum(n);

        sc.close();
    }
}

//print numbers 5 to 1