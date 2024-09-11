public class unique {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,4,5,5};
   int ans1=search(arr);
   int ans2=search1(arr);
   System.out.println(ans1+ans2);
    }

    static int search(int[]arr){
       int start=0;
       int end=arr.length-1;
         int mid=start+(end-start)/2;
       while(mid<end){
      
        if(arr[mid]==arr[mid+1]){
            end=mid+1; 
        }
        else{
            end=mid;
        }
       }

int count=1;
     while(start<end){
         if(arr[end]!=arr[end-1]){
            count++;
            end=end-1;
         }
         else{
end=end-1;
         }
     }



return  count;



    }



    static int search1(int[]arr){
        int start=0;
       int end=arr.length-1;
         int mid=start+(end-start)/2;
       while(mid<end){
      
        if(arr[mid]==arr[mid+1]){
            end=mid+1; 
        }
        else{
            end=mid;
        }
       }
    
    start=end;
    end=arr.length-1;
    
int count=0;
while(start<end){
    if(arr[start]!=arr[start+1]){
       count++;
      start++;
    }
    else{
start++;
    }
}
return  count;

    }






}
