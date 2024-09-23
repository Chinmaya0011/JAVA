public class pattern7 {
    public static void main(String[] args) {
        pattern(10);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
           
            int num=i;
            for(int k=n-i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
            System.out.print(num);
            num--;
            }
           for(int l=2;l<=i;l++){
            System.out.print(l);
           }
           System.out.println();
        }
    }
}

