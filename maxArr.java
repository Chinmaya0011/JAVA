public class maxArr {
   public static void main(String[] args) {
    int[] arr={111,12342,21123,5146,784};
    int ans=max(arr);
    System.out.println(ans);
   } 

   static int max(int arr[]){
   int Max=arr[0];
   for(int i=0;i<arr.length;i++){
    if(Max<arr[i]){
        Max=arr[i];
    }
   }
    return Max;
   }
}
