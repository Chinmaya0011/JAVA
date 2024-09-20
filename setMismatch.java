
import java.util.ArrayList;
import java.util.List;

public class setMismatch {
    public static void main(String[] args) {
        int[] arr={1,2,4,2};
       List<Integer> mismatch=sort(arr);
       System.out.println(mismatch); 
       System.err.println(java.util.Arrays.toString(arr));
    }

    static List<Integer> sort(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;){
            int corPos=arr[i]-1;
            if(arr[i]!=arr[corPos]){
                swap(arr,i,corPos);
            }
            else{
                i++;
            }
        }
 List<Integer> result=new ArrayList<>();

for(int j=0;j<arr.length;j++){
 
    if(arr[j]!=j+1){
        result.add(arr[j]);
        result.add(j+1);
    }
    else{
        j++;
    }
  
}

return result;
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
