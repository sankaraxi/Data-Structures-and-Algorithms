package inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        super();
        this.weight = -2 ;
    }

    public BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height); //calls the parent class constructor
        // used to initialise the values in the parent class
        this.weight = weight;
    }
}
