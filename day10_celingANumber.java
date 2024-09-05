public class day10_celingANumber {
    public static void main(String[] args) {
       int[] arr={2,3,5,14,16,18};
       int target=14;
       int ans=celing(arr,target);
       System.out.println(ans); 
    }

    static int celing(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
    if(target>arr[end]){
        return -1;
    }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
