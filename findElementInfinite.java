public class findElementInfinite {
    public static void main(String[] args) {
        int[] arr={2, 5, 7, 9, 10, 12, 15, 16, 18, 20, 24, 28, 32, 35};
        int target=16;
        int ans=search(arr,target);
        System.out.println(ans);
    }
       static int search(int[]arr,int target){
        int ans=-1;
        int start=0;
        int end=1;
      while(target>arr[end]){
        int newStart=end+1;
        end=end+(end-start+1)*2;
        start=newStart;
      }

       while (start<=end) {
        int mid=start+(end-start)/2;
           if(arr[mid]>target){
            end=mid-1;
           }
           else if(arr[mid]<target){
                 start=mid+1;
           }
           else{
            return mid;
           }
       }
        return ans;
       }
}
