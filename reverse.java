public class reverse {
    public static void main(String[] args) {
        int num=12345678;
        String rev="";
        while(num>0){
            int rem=num%10;
            String s=String.valueOf(rem);
            rev=rev+s;
            num=num/10;
        }
        System.out.println(rev);
    }
}
