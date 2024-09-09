public class firstAndLast {
    public static void main(String[] args) {
        int[] arr={5, 7, 7, 8, 8, 10};
        int target=8;
        
        int ans1=search1(arr,target);
        int ans2=search2(arr,target);
       System.out.println(ans1);
System.out.println(ans2);
    }
    static int search1(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int firstIndex=-1;
        while(start<=end){
         int mid=start+(end-start)/2;
         if(arr[mid]==target){
            firstIndex=mid;
            end=mid-1;
         }
         else if(arr[mid]>target){
            end=mid-1;
         }
         else{
            start=mid+1;
         }
        }
        return  firstIndex;
    }

    static int search2(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        int lastIndex=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                lastIndex=mid;
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return  lastIndex;
    }
}