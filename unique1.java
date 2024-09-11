public class unique1 {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,4,4,5,5,5};
        System.out.println(search(arr));
    }
    static int search(int[]arr){
        int start=0;
        int end=arr.length-1;
        int count=1;
        while(start<end){
            if(arr[start]!=arr[start+1]){
                count++;
                  System.out.println(arr[start]);
                start=start+1;
              
            }
            else{
                start=start+1;
            }
        }
        return count;
    }
}
