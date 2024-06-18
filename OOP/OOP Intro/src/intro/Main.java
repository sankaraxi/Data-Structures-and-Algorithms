package intro;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
//        System.out.println(Arrays.toString(students)); //[null, null, null, null, null]
//        //primitive array
//        int[] arr = new int[5];
//        System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0, 0]

        // just declaring
        Student sankar;
        sankar = new Student(); //initializing object sankar
        //Student() knows as constructor and it helps to allocate values
        // this process of creating an object is called instantiating
//        sankar.rollno = 31;
//        sankar.name = "Sankar K G";
//        sankar.marks = 75.66f;

//        sankar.changeName("Sankar Gnanasekar");
//        sankar.greeting();


        System.out.println(sankar.rollno);
        System.out.println(sankar.name);
        System.out.println(sankar.marks);

        System.out.println();

        Student student1 = new Student(21,"Santhosh",99);
        System.out.println(student1.rollno);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        System.out.println();

        Student random = new Student(sankar);
        System.out.println(random.name); // random's name will be sankar's name

        //changes made to an object will be reflected in another object to which it is poining to ,vice versa
        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);
    }
}
//created a class for every single student
class Student {
    int rollno;
    String name;
    float marks = 90;//providing default value

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object
    void greeting(){
        System.out.println("Hello, My name is "+this.name);
    }

    void changeName(String newName){
        this.name = newName;
    }

    Student  (Student other) {
        this.name = other.name;
        this.rollno = other.rollno;
        this.marks = other.marks;
    }

    Student  () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }

    // Student rakesh = new Student(17, "Rakesh", 89.7f);
    // here, this will be replaced with rakesh
    Student  (int roll, String name, float marks) {
        this.rollno = roll;
        this.name = name;
        this.marks = marks;
    }
}