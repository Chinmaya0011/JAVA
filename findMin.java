public class findMin {
   public static void main(String[] args) {
    int arr[]={123,45,234,345,34343,345,3452,34,23324};
System.out.println(min(arr));
   } 
   static int min(int[] arr){
    int ans=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]<ans){
            ans=arr[i];
        }
    }
    return ans;
   }
}
