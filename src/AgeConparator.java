import java.util.Comparator;

public class AgeConparator implements Comparator<TestComparator>{

    @Override
    public int compare(TestComparator o1, TestComparator o2) {
        return o1.getAge() - o2.getAge();
    }
    
}
