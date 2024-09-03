public class searchString {
    public static void main(String[] args) {
        String str="chinmaya";
        char target='h';
        boolean find=search(str,target);
        System.out.println(find);
    }
    static boolean search(String str,char target){
boolean ans=false;
 
for(int i=0;i<str.length();i++){
    if(target==str.charAt(i)){
        ans=true;
    }
}

return ans;
    }
}
