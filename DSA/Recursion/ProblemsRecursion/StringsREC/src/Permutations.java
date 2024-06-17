import java.util.ArrayList;

public class Permutations {
    // permutations - possible position the character can fit in
    public static void main(String[] args) {
        permutations("","abc");
        System.out.println(permutationsArray("","abc"));
        System.out.println(permutationsCount("","abc"));
    }
    static void permutations(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch =unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i,processed.length());
            permutations(first+ch+second,unprocessed.substring(1));
        }
    }

    //returning array list
    static ArrayList<String> permutationsArray(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch =unprocessed.charAt(0);
        // this is local to this particular call
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i,processed.length());
            ans.addAll(permutationsArray(first+ch+second,unprocessed.substring(1)));
        }
        return ans;
    }
    //to return count
    static int permutationsCount(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch =unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i,processed.length());
            count = count + permutationsCount(first+ch+second,unprocessed.substring(1));
        }
        return count;
    }

}
