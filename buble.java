public class buble {
    public static void main(String[] args) {
        int[] nums={2,1,4,5,3};
        search(nums);
        System.out.println(java.util.Arrays.toString(nums));
    }
    static void search(int[]nums){
    int n=nums.length;
  
    for(int i=0;i<n-1;i++){
      boolean found=false;
        for(int j=1;j<n-i;j++){
            if(nums[j]<nums[j-1]){
                int temp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;
                found=true;
            }
        }
        if(!found){
            break;
    }
  
    }
    }
}
