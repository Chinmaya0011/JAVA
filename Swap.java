import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
           swap(arr,0,arr.length-1);
           System.out.println(Arrays.toString(arr));
    }

    static void swap(int arr[],int first,int second){
     int temp=arr[first];
     arr[first]=arr[second];
     arr[second]=temp;
    }
}
