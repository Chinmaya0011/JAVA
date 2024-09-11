

public class search2d {
public static void main(String[] args) {
    int[][] arr={{1,2,3,11},{4,5,6},{7,8,9}};
    int target=11;
    int[] ans=search(arr,target);
    System.out.println(ans[0]+" "+ans[1]);
}
static int[] search(int[][] arr,int target){
    int[] result=new int[2];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==target){
               result[0]=i;
               result[1]=j;
            }
        }
    }


    return result;
}
}