import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        // Scanner input=new Scanner(System.in);
        // int num=input.nextInt();
        boolean ans=prime(131);
        System.out.println(ans);
    }
static boolean prime(int n){
if(n<2){
    return false;
}
else{
    for(int i=2;i<n;i++){
        if(n%i==0){
            return false;
        }
    }
}
return true;
}

}
