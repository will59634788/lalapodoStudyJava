package Day6;

import java.util.ArrayList;
import java.util.Comparator;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("xiaoming");
        names.add("lihong");
        names.add("wangwu");
        names.add("zhaoliu");
        System.out.println(names);
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println(names);

        names.sort((String o1,String o2)->o1.compareToIgnoreCase(o2));
        System.out.println(names);

            
    }
}
