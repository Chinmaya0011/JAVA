public class ceilling {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7,10,14,16,17,19,21,25};
        int target=12;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid;
            }
          else if(arr[mid]<target){
            start=mid+1;
          }
          else{
            return  arr[mid];
          }
        }
        return arr[end];
    }
}
