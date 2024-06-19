package inheritance;

public class Main {
    public static void main(String[] args) {
//        Box Box1 = new Box();
//        System.out.println(Box1.length+" "+Box1.height+" "+Box1.width);

//        BoxWeight Box2 = new BoxWeight(); // inherited one
//        System.out.println(Box2.length+" "+Box2.height+" "+Box2.width+" "+Box2.weight);

        //        Box box5 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box5.w);

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
//        BoxWeight box3 = new Box(2, 3, 4);
//        System.out.println(box63);

        BoxPrice Box5 = new BoxPrice();
        System.out.println(Box5.length+" "+Box5.height+" "+Box5.width+" "+Box5.weight+" "+Box5.cost);

        BoxPrice Box6 = new BoxPrice(4,55,200);
        System.out.println(Box6.length+" "+Box6.height+" "+Box6.width+" "+Box6.weight+" "+Box6.cost);

        Box box = new BoxWeight();
        Box.greeting(); // you cannot override

        BoxWeight box2 = new BoxWeight();
        BoxWeight.greeting(); // you can inherit but you cannot override
    }
}
