import java.util.Arrays;

public class reverseArr {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6};
        rev(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

     static void rev(int[] arr,int first,int second){
      while(first<second){
      swap(arr, first, second);
        first++;
        second--;
          
      }
     }

     static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
     }
}
