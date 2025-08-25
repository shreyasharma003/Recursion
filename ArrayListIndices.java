import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elemenets in your array: ");
        int size = sc.nextInt();

        int nums[] = new int [size];

        System.out.println("Start entering the elements: ");
        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        System.out.println("Your given sorted array is: "+Arrays.toString(nums));

        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        System.out.println("Let's find your target "+target);

        ArrayList<Integer> result = returnIndices(nums, target, 0);

        if (result.isEmpty()) {
            System.out.println("Target not found!");
        } else {
            System.out.println("Target found at indices: " + result);
        }

        sc.close();
    }

    public static ArrayList<Integer> returnIndices(int nums[], int target, int i){
        ArrayList<Integer> list = new ArrayList<Integer>();

        if(i==nums.length){
            return list;
        }

        if(nums[i]==target){
            list.add(i);
        }
    
        ArrayList<Integer> ansFromBelowCalls = returnIndices(nums,target,i+1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
