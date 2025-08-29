import java.util.Arrays;
import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of elements in your array:");
        int size = sc.nextInt();

        int arr [] = new int [size];

        System.out.println("Start entering the elements:");
        
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("You array is: "+Arrays.toString(arr));

        sc.close();

        boolean ans = sorted(arr, 0);
        System.out.println(ans);
    }

    public static boolean sorted(int arr[], int i){
        if(i== arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && sorted(arr, i+1);
    }
}
