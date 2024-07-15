import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<TestComparator> list = new ArrayList<>();
        list.add(new TestComparator("John", "john@gmail.com", 25));
        list.add(new TestComparator("Adam", "adam@gmail.com", 30));
        list.add(new TestComparator("Mary", "mary@gmail.com", 20));
        System.out.println(list);
        Collections.sort(list, new AgeConparator());
        System.out.println(list);
        Collections.sort(list, new NameComparator());
        System.out.println(list);

    }
}
