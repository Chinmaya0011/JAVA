public class Angram {
    public static void main(String[] args) {
        boolean num=armstrong(153);
        System.out.println(num);
//        for(int i=100;i<1000;i++){
// System.out.println(angram(i));
//        }
    }
    static boolean armstrong(int n){
      int sum=0;
      int orginal=n;
      while (n>0) {
        int rem=n%10;
       sum=sum+rem*rem*rem;
        n=n/10;
 

      }
      if(sum==orginal){
        return true;
      }
      return false;
    }
}
