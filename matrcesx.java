public class matrcesx {
    public static void main(String[] args) {
        int[][] arr={{2,5,8},{9,10,12},{13,17,19}};
        int target=13;
        int[] ans=search(arr,target);
        System.out.println(java.util.Arrays.toString(ans));
    }

    static int[] search(int[][] arr,int target){
        int rows=arr.length;
        int cols=arr[0].length;
        int start=0;
        int end=rows*cols-1;
        while(start<end){
            int mid=start+(end-start)/2;
            int row=mid/cols;
            int col=mid%cols;
            int targetValue=arr[row][col];
            if(target==targetValue){
                return new int[]{row,col};
            }
            else if(target>targetValue){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return new int[]{-1,-1};

    }
}
