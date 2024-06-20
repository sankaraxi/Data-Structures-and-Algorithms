package generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student sankar = new Student(12, 89.76f);
        Student suhail = new Student(5, 99.52f);
        Student arpit = new Student(2, 95.52f);
        Student karan = new Student(13, 77.52f);
        Student sachin = new Student(9, 96.52f);

        Student[] list = {sankar, suhail, arpit, karan, sachin};

        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student other1, Student other2) {
//                return (int)(other1.marks - other2.marks);
////                return -(int)(other1.marks - other2.marks); //sorts in descending order
//            }
//        });

//        Arrays.sort(list, (other1, other2) -> (int)(other1.marks - other2.marks)); // lambda function (asc)
        Arrays.sort(list, (other1, other2) -> -(int)(other1.marks - other2.marks)); // lambda function (dsc

        System.out.println(Arrays.toString(list));

//        if (sankar.compareTo(suhail) < 0) {
//            System.out.println(sankar.compareTo(suhail));
//            System.out.println("Sankar has more marks");
//        }

    }
}
