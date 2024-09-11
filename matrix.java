
public class matrix {
    public static void main(String[] args) {
        int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=34;
        int[] ans=searchMatrix(arr,target);
        System.out.println(java.util.Arrays.toString(ans));
    }
    static int[] searchMatrix(int[][] matrix,int target){

int rows=matrix.length;
int cols=matrix[0].length;
int start=0;
int end=rows*cols-1;
while(start<=end){
int mid=start+(end-start)/2;
int row=mid/cols;
int col=mid%cols;
int midValue=matrix[row][col];
if(midValue==target){
   return new int[]{row,col};
}
else if(midValue>target){
    end=mid-1;
}

else{
    start=mid+1;
}

}





return new int[]{-1,-1};
    }

}
