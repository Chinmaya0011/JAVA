public class findOccurancy {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,7,7,7,7,7,9,11,13};
        int target=7;
        int[] ans={-1,-1};
        ans[0]=search(arr,target,true);
        ans[1]=search(arr,target,false);
        System.out.println(ans[1]-ans[0]+1);
        
        
    }
    static int search(int[]arr,int target,boolean isStart){
            int start=0;
            int end=arr.length-1;
            int result=-1;
            while (start<=end) {
                int mid=start+(end-start)/2;
                if(target>arr[mid]){
                    start=mid+1;
                }
                else if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    result=mid;
                    if(isStart){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
                
            }
            return result;
    }


}
