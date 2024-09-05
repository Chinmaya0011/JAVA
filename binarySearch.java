public class binarySearch {
    public static void main(String[] args) {
        int[] arr={1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target=13;
       int find= search(arr,target);
       System.out.println(find);
    }
   static int search(int[]arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
                      int mid=low+(high-low)/2;

              if(target==arr[mid]){
                return mid;
              }
              else if(target>arr[mid]){
                low=mid+1;
              }
              else{
                high=mid-1;
              }
        }

        return -1;
   }



}
