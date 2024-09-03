public class searchin2darray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{3,4,5},{6,7,8}};
        System.out.println(search(arr,2));
    }
    static boolean search(int[][] arr,int target){
        boolean ans=false;
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
           if(target==arr[i][j]){
            ans=true;
           }
        }
       
      }
       return ans;
    }
}
