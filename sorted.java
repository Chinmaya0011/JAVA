public class sorted {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,1,2,3};
        int target=2;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
            
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;}
                else if(arr[mid]>=arr[start]){
                  if(target>=arr[start]&&arr[mid]>target){
                    end=mid-1;
                  }
                  else{
                    start=mid+1;
                  }


                }
                else{
                    if(target<arr[end]&&target>=arr[end]){
                        start=mid+1;
                    }
                    else{
                        end=mid-1;
                    }
                }
                return -1;

        }




        return -1;

    }
}
