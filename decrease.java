public class decrease {
    public static void main(String[] args) {
        int[] arr={8,7,5,3,2,1,0};
        int target=1;
        int ans=search(arr,target);
System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
          int mid=start+(end-start)/2;
          if(arr[mid]==target){
            return mid;
          }
          else if(arr[mid]<target){
            end=mid-1;
          }
          else{
            start=mid+1;
          }
        }
        return -1;
    }
}
