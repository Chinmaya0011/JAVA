public class minIndexMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 4;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int peak=getPeak(arr);
        int result1=checkMin(arr,target,0,peak,true);
        if(result1!=-1){
            return result1;
        }
return checkMin(arr,target,peak+1,arr.length-1,false);
    }
    static int getPeak(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }

static int checkMin(int[]arr,int target,int start,int end,boolean accending){
           
    while (start<=end) {
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(accending){
            if(arr[mid]<target){
               start=mid+1;
            }
            else{
                 end=mid-1;
            }
        }
        else{
            if(arr[mid]>target){
              start=mid+1;
            }
            else{
           end=mid-1;
            }
        }
     
    }   return -1;
}



}