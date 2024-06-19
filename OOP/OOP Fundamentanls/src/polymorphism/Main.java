package polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();

        //polymorphism - act of representing the same thing in multiple ways
        shape.area();
        circle.area();
        square.area();
    }
}
