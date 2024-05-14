public class ChangeName {
    public static void main(String[] args) {
        String name = "Sankar";
        changeName(name);
        System.out.println(name);

    }

    static void changeName(String naam) {
        naam = "Fred"; // creating a new object , so the name is not changed
    }

}
