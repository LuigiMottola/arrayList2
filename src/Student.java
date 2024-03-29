public class Student {
    //parameter
    private String name;
    private int age;

    //constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter & setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //to String
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}