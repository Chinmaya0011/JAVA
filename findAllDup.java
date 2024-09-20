
import java.util.ArrayList;
import java.util.List;

public class findAllDup {
    public static void main(String[] args) {
        int[] arr={1,2,1,2,3,3,4,5,6,7,7,5,8,9};
        List<Integer> ans=sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
        System.out.println(ans);
    }

    static List<Integer> sort(int[] nums){
 

      int n=nums.length;
      for(int i=0;i<n;){
        int corPos=nums[i]-1;
        if(nums[i]!=nums[corPos]){
            swap(nums,i,corPos);
        }
        else{
            i++;
        }
      }
       List<Integer> duplicates=new ArrayList<>();

for(int j=0;j<nums.length;j++){
   
    if(nums[j]!=j+1){
        duplicates.add(nums[j]);
    }
}


        return duplicates;
    }
    static void swap(int[] nums,int start,int second){
        int temp=nums[start];
        nums[start]=nums[second];
        nums[second]=temp;
    }
}
