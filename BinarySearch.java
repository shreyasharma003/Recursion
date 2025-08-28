import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the no of elements in your array");
        int size = sc.nextInt();

        int arr[] = new int [size];

        System.out.println("Enter the elements of your array");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Your array is" + Arrays.toString(arr));

        System.out.println("Enter your target to find:");
        int target = sc.nextInt();

        sc.close();

         int result = binarySearch(arr, target, 0, size-1);

         if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
      
    }

    static int binarySearch(int[] arr, int target, int s,int e){

        if(s>e){
            return -1;
        }

        int m = s+(e-s)/2;

        if(arr[m]==target){
            return m;
        }

        if(target>arr[m]){
           return binarySearch(arr,target, m+1, e);
        }

        return binarySearch(arr, target, s, m-1);
    }
}

