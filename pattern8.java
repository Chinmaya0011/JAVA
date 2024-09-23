public class pattern8 {
    public static void main(String[] args) {
        pattern(4);

    }
    static void pattern(int n){
        
        for(int i=1;i<=n;i++){
            int num=n;
       for(int j=1;j<=n;j++){
        System.out.print(num);
       
       }
        num--;
       System.out.println();
        }
    }
    

}
