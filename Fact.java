import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number whose factorial you want: ");
        int n = sc.nextInt();

        int ans = printFact(n);
        System.out.println(ans);
        sc.close();
    }

    static int printFact(int n){

        if(n==1){
            return 1;
        }
        return n*printFact(n-1);
    }
}
