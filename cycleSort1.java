public class cycleSort1 {
    public static void main(String[] args) {
        int[] arr={2,1,4,3,5};
        sort(arr);
        System.err.println(java.util.Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int corrPos=arr[i]-1;
            if(arr[i]!=arr[corrPos]){
                swap(arr,i,corrPos);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
         arr[first]=arr[second];
        arr[second]=temp;
    }
}
