package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(21);
        son.career("software engineer");
        son.partner("Barbie",19);
        son.normal();
        System.out.println();
//        Daughter daughter = new Daughter(19);
        Parent daughter = new Daughter(19); //it can also done this way
        daughter.career("doctor");
        daughter.partner("Super man",60);
        System.out.println();

        Parent.hello(); //static methods are called using class name

//        Parent Mom = new Parent(); //you cant create an object of abstract class
    }
}
