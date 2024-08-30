import java.util.Scanner;

public class fibonacchi {
    public static void main(String[] args) {
    Scanner n=new Scanner(System.in);
    int num=n.nextInt();
    int a=0;
    int b=1;
    int c=0;
    for(int i=2;i<=num;i++){
      c=a+b;
      a=b;
      b=c;
   

    }
 System.out.println(b);
    }
}
