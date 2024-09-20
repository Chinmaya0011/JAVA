public class smallMissNum {
    public static void main(String[] args) {
        int[] arr={7,6,8,9};
        int ans=sort(arr);
        System.out.println(ans);
        System.out.println(java.util.Arrays.toString(arr));
    }
    static int sort(int[] nums){
        for(int i=0;i<nums.length;){
            int corPos=nums[i]-1;
            if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[corPos] ){
                swap(nums,i,corPos);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }

    static void swap(int[] arr ,int i,int corPos){
        int temp=arr[i];
        arr[i]=arr[corPos];
        arr[corPos]=temp;
    }
}
