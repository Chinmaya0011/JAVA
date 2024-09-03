public class search {
    public static void main(String[] args) {
      int[] nums={-1,0,3,5,9,12};
      int target=11;
    
      int ans=   search(nums,target);
      System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int result=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                result=i;
            }
         
        }
      return result;
    }

}
