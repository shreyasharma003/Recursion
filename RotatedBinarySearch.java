import java.util.Scanner;

public class RotatedBinarySearch{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elemenets in your array: ");
        int size = sc.nextInt();

        int nums[] = new int [size];

        System.out.println("Start entering the elements: ");
        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        System.out.println("Let's find your target "+target);

        int ans = search(nums, target, 0, nums.length-1);
        System.out.println("Your target is present at "+ans);
        sc.close();
    }

    public static int search(int nums[], int t, int s, int e){
        int m = s+(e-s)/2;
        if(s>e){
            return -1;
        }

        if(nums[m]==t){
            return m;
        }

         if(nums[s] <= nums[m]){
            if(t>=nums[s] && t<=nums[m]){
                return search(nums, t, s, m-1);
            }
            else{
               return search(nums, t, m+1, e);
            }
         }

         if(t>=nums[m] && t<=nums[e]){
            return search(nums, t, m+1, e);
         }else{
            return search(nums, t, s, m-1);
         }
        
    }
}