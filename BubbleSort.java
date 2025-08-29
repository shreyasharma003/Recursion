import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int arr[] = {5,4,8,6,3,7,2,9,11,66,888,55,  9 , 16, 9};
        Sort(arr.length-1, 0, arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort(int r, int c, int arr[]){

        if(r==0){
            return;
        }

        if(c<r){

            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            Sort(r, c+1, arr);
        }

        else{
            Sort(r-1, 0, arr);
        }
    }
}