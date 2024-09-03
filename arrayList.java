import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Hey");
        list.add("Hello");
        list.add("chinu");
        list.add("chinmaya");
list.set(2,"Chinmaya" );
list.remove("chinmaya");
        // System.out.println(list.isEmpty());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(String str:list){
            System.out.println(str);
        }
    }
}
