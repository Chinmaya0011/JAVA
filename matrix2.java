public class matrix2 {
    public static void main(String[] args) {
        int[][] arr={{1,4},{2,5}};
        int target=2;
        boolean ans=search(arr,target);
        System.out.println(ans);
    }
    static boolean  search(int[][] arr,int target){

        int rows=arr.length;
        int cols=arr[0].length;
        int start=0;
        int end=rows*cols-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int row=mid/cols;
            int col=mid%cols;
            int midValue=arr[row][col];
            if(midValue==target){
                return  true;
            }
            else if(target>midValue){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        } 


return false;

    }
}
