public class cycleSort {
    public static void main(String[] args) {
        int[] arr={2,1,3,5,4};
        checkSwapMove(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
static void checkSwapMove(int[]arr){
int n=arr.length;
for(int i=0;i<n;i++){
    int corPos=arr[i]-1;
    if(arr[i]!=arr[corPos]){
    swap(arr,i,corPos);
    }
    else{
        i++;
    }
}

}
static void swap(int[]arr,int first,int second){
    int temp=arr[first];
     arr[first]=arr[second];
    arr[second]=temp;
}

}
