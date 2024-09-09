public class singleElem {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5,5};
        System.out.println(single1(arr));  
    }

    static int single1(int[] arr) {
     int start=0;
     int end=arr.length-1;
while(start<=end){
    int mid=start+(end-start)/2;
    
    if(arr[mid]!=arr[mid+1]){
        end=mid-1;
    }
    else{
        start=mid+2;
    }
}
return arr[start];
    }
}
