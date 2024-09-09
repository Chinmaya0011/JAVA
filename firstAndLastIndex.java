public class firstAndLastIndex {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,8,8,9};
        int target=8;
        int firstIndex=search(arr,target);
        int lastIndex=search1(arr,target);
        System.err.println(firstIndex+" "+lastIndex);
    }

    static int search(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        int result=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
             if(arr[mid]==target){
                result=mid;
                end=mid-1;
             }
             if(arr[mid]<target){
                start=mid+1;
             }
             
           
        }
        return result;
    }

    static int search1(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        int result=-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                   result=mid;
                start=mid+1;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
          
        }
        return result;
    }
}
