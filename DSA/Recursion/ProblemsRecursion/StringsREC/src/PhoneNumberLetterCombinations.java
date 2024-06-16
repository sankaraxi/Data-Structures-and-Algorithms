import java.util.ArrayList;

public class PhoneNumberLetterCombinations {
    //google question
    //return the letter combinations of the given input digits based on the keypad mobile
    public static void main(String[] args) {
        keyPadCombinations("","12");
        System.out.println();
        System.out.println(keyPadCombinationsArray("","12"));
        System.out.println(keyPadCombinationsCount("","12"));
    }

    static void keyPadCombinations(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.print(processed+" ");
            return;
        }
        int digit = unprocessed.charAt(0) - '0'; //converts character into integer i.e, '2' into 2
        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char)('a'+i);

            keyPadCombinations(processed+ch,unprocessed.substring(1));
        }
    }
    // returning a arraylist
    static ArrayList<String> keyPadCombinationsArray(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        int digit = unprocessed.charAt(0) - '0'; //converts character into integer i.e, '2' into 2
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char)('a'+i);
            list.addAll(keyPadCombinationsArray(processed+ch,unprocessed.substring(1)));
        }
        return list;
    }
    //returning the count
    static int keyPadCombinationsCount(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
             return 1;
        }
        int count = 0;
        int digit = unprocessed.charAt(0) - '0'; //converts character into integer i.e, '2' into 2
        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char)('a'+i);

            count=count+ keyPadCombinationsCount(processed+ch,unprocessed.substring(1));
        }
        return count;
    }
}
