public class searchinrange {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,56,7};
        int target=5;
        int[] range={1,4};
System.out.println(range(arr,target,range));
    }
    static boolean range(int[] arr,int target,int[] range){
       if(arr.length<=0){
        return false;
       }
       for(int i=range[0];i<=range[1];i++){
           if(arr[i]==target){
            return true;
           }
       }
       return false;
    }
}
