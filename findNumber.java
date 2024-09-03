import java.sql.Array;
import java.util.Arrays;
public class findNumber {
    public static void main(String[] args) {
        int arr[]={11,23,34,3456,45467,3456,34553};
       contain(arr);
       System.out.println(contain(arr));
    }
    static int contain(int[] arr){
        int count=0;
   for(int i=0;i<arr.length;i++){
    if(Integer.toString(arr[i]).length()%2==0){
count++;
    }
  
   }  
   return count;
    }
}
