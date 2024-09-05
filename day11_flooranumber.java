public class day11_flooranumber {
    public static void main(String[] args) {
        int[] arr={1,3,5,8,9,17};
        int target=17;
        int ans=floor(arr,target);
        System.out.println(ans);
    }

    static int floor(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
}
