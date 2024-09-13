public class bubleSort {
    public static void main(String[] args) {
        int[] nums={2,5,4,7,1};
        bubleSort(nums);
        System.out.println(java.util.Arrays.toString(nums));
    }
    static void  bubleSort(int[] nums){
        int n=nums.length;
      
        for(int i=0;i<n-1;i++){ 
             boolean found=false;
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    found=true;
                }
            }
            if(!found){
            break;
        }
        }
        
    }
}
