public class insertionsort {
    public static void main(String[] args) {
        int [] arr={2,1,7,3,4,5,6};
        sort(arr);
    System.out.println(java.util.Arrays.toString(arr));
    }
    static void sort(int[]arr){
        for(int i=1;i<arr.length-1;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i]<arr[j]){
                    int tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }
        }
    }
}
