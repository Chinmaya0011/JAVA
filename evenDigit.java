public class evenDigit {
    public static void main(String[] args) {
        int[] arr={1,234,12,453,3453,4543,45,34522};
        System.out.println(even(arr));
    }

    static int even(int[] arr){
        int result=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            while (arr[i]>0) {
                arr[i]=arr[i]/10;
                count++;
            }
            if(count%2==0){
                result++;
            }
        }
        return result;
    }
}
