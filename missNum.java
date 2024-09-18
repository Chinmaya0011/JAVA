public class missNum{
    public static void main(String[] args) {
     int[] arr={2,3,1,4};
     int ans=sort(arr);
     System.out.println(ans);
  
 }
static int sort(int[]arr){
    for(int i=0;i<arr.length;){
       int corPos=arr[i];
       if(arr[i]<arr.length && arr[i]!=arr[corPos]){
        Swap(arr,i,corPos);
       }
       else{
        i++;
       }
    }

for(int j=0;j<arr.length;j++){
    if(arr[j]!=j){
        return  j;
    }
}

return arr.length;


}
static void Swap(int[] arr,int i,int corPos){
int temp=arr[i];
arr[i]=arr[corPos];
arr[corPos]=temp;
}
  
}