package staticExample;

public class Main {
    public static void main(String[] args) {
        Human sankar = new Human(21,"Sankar K G", 50000,false);
        Human suhail = new Human(21,"Sheik Mohmd. Suhail", 700000,true);
        Human rakesh = new Human(21,"Rakesh B",30000,true);

//        System.out.println(Human.population);
//        System.out.println(Human.population);
        System.out.println(Human.population + " " + rakesh.married);

    }
}
