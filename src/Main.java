import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Student stud1 = new Student("Luigi",25);
        Student stud2 = new Student("Paul",27);
        Student stud3 = new Student("Federico",30);
        Student stud4 = new Student("Rebecca",29);
        Student stud5 = new Student("Alessia",29);
        Student stud6 = new Student("Simone",24);
        Student stud7 = new Student("Raffaele",26);
        Student stud8 = new Student("Andrea",38);
        Student stud9 = new Student("Ilaria",41);
        Student stud10 = new Student("Lucia",27);
        Student stud11 = new Student("Eleonora",29);
        Student stud12 = new Student("Max",22);

        List<Student> studentList = new ArrayList<>(List.of(stud1,stud2,stud3,stud4,stud5,stud6,stud7,stud8,stud9,stud10,stud11,stud12));

        //stampo lista non ordinata
        System.out.println(studentList);

        //ordino la lista
        studentList.sort(Comparator.comparing(Student::getName));

        //stampo listaordinata
        System.out.println(studentList);



    }

}