public class minElemRot {
    public static void main(String[] args) {
        int[] arr={3, 4, 5, 6, 7, 8, 9, 1, 2};
        int ans=search(arr);
        System.out.println(ans);
    }
    static int search(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[end]){
               start=mid+1;
            }
            else{
               end=mid;
            }
        }
        return  nums[(start-1+nums.length)%nums.length];
    }
}
