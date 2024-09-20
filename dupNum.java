public class dupNum {
    public static void main(String[] args) {
        int[] arr={5,3,4,2,1,4};
        int ans=sort(arr);
        System.out.println(ans);
    }
    static int sort(int[] nums){
  if(nums.length<=1){
    return -1;
  }

        for(int i=0;i<nums.length;){
            int corPos=nums[i]-1;
            if(nums[i]!=nums[corPos]){
                swap(nums,i,corPos);
            }
            else{
                i++;
            }
        }


   return nums[nums.length-1];


    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
