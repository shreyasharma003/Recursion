import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of your array: ");
        int size = sc.nextInt();

        int arr[] = new int [size];

        System.out.println("Start entering your "+size+" elements.");
        for(int i =0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Your array is: "+ Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Your sorted array is: " + Arrays.toString(arr));

        System.out.println("Enter the element you want to find in th array: ");
        int target = sc.nextInt();
        sc.close();

        int index =  find(arr, target, 0);
        System.out.println("Your target found at index "+ index);
        
    }

    public static int find(int arr[], int target, int i){
        if(arr[i]==target){
            return i;
        }
        return find(arr, target, i+1);
    }

    
}
