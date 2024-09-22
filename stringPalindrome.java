public class stringPalindrome {
    public static void main(String[] args) {
        String str="abcrecba";
        int start=0;
        int end=str.length()-1;
        boolean result=true;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                result=false;
                break;
            }
            start++;
            end--;

        }
        System.out.println(result);
    }
}
