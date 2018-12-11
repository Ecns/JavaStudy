import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>();
        set.add("123");
        set.add("456");
        set.add("123");
        String []str = (String[]) set.toArray(new String[set.size()]);
        for (int i=0; i<set.size(); i++) {
            System.out.println(str[i]);
        }

    }
}
