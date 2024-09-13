public class selectionsort {
    public static void main(String[] args) {
        int[] arr={2,4,5,3,1};
        search(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void search(int[] nums){
      for(int i=0;i<nums.length;i++){
        int minIndex=i;
        for(int j=i+1;j<nums.length;j++){
            if(nums[minIndex]>nums[j]){
                minIndex=j;
            }
        }
        int temp=nums[minIndex];
        nums[minIndex]=nums[i];
         nums[i]=temp;
      }
    }
}
