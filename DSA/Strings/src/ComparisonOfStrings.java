public class ComparisonOfStrings {
    public static void main(String[] args) {
        String a = "Sankar";
        String b = "Sankar";

        if (a == b){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        //creating objects outside the pool which results in false
        String c = new String("Sankar Gnanasekar");
        String d = new String("Sankar Gnanasekar");
        if (c == d){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        //if we need to check only the values use .equals method
        System.out.println(c.equals(d)); //now it gives true
    }
}
