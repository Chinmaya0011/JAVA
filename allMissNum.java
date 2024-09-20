import java.util.ArrayList;
import java.util.List;

public class allMissNum {
    public static void main(String[] args) {
        int[] arr={4,3,1,2,2,7,8,3};
       List <Integer> missNumber=sort(arr);
        // System.out.println(java.util.Arrays.toString(arr));
        System.out.println(missNumber);

    }
    static List<Integer>  sort(int[] arr){
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

List <Integer> missNumber=new ArrayList<>();

for(int j=0;j<arr.length;j++){
    if(arr[j]!=j+1){
       missNumber.add(j+1);
    }
}
return missNumber;




    }
    static void swap(int[] arr,int i, int corPos){
        int temp=arr[i];
        arr[i]=arr[corPos];
        arr[corPos]=temp;
    }
}
