import java.util.Comparator;

public class NameComparator implements Comparator<TestComparator> {
    
        @Override
        public int compare(TestComparator o1, TestComparator o2) {
            return o1.getName().compareTo(o2.getName());
        }
    
}
