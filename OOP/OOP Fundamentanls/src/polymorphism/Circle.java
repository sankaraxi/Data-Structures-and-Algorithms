package polymorphism;

public class Circle extends Shapes{
    //example for runtime time/ dynamic polymorphism
    // achieved by method overriding

    // this will run when obj of Circle is created
    // hence it is overriding the parent method
    @Override // this is called annotation
    void area() {
        System.out.println("Area is pi * r * r");
    }
}
