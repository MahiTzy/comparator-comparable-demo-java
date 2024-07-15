public class TestComparator {

    private String name;
    private String email;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TestComparator(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public TestComparator() {
    }

    @Override
    public String toString() {
        return "TestComparator [name=" + name + ", email=" + email + ", age=" + age + "]";
    }

    // @Override
    // public int compareTo(TestComparator o) {
    //     return this.name.compareTo(o.getName());
    // }

    
}