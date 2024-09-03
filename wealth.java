public class wealth {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{1,4,2,6},{1,3,3,2}};
        System.out.println(wealthMan(arr));
    }
    static int wealthMan(int[][] arr){
        int result=0;
        for(int i=0;i<arr.length;i++){
              int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];

            }
            if(sum>result){
                result=sum;
            }
        }
        return result;
    }
}
