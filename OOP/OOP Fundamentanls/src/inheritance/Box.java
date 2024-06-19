package inheritance;

public class Box {

    double length;
    double width;
    double height;

    Box() {
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    Box(double side){
        this.length = side;
        this.width = side;
        this.height = side;
    }

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(Box other) {
        this.length = other.length;
        this.width = other.width;
        this.height = other.height;
    }
}
