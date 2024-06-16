import java.util.ArrayList;

public class SubSequenceArrayList {
    public static void main(String[] args) {
        String strUnprocessed = "abc";
        String strProcessed = "";
        System.out.println(subSequenceReturn(strProcessed,strUnprocessed));

    }

    static ArrayList<String> subSequenceReturn(String processed, String unprocessed){
        if(unprocessed.isEmpty()){ // base condition
            ArrayList<String> list = new ArrayList<>();
            if (processed != ""){ // it is used remove empty string
                list.add(processed);
            }
//            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);

        ArrayList<String> left = subSequenceReturn(processed+ch,unprocessed.substring(1)); //leftside tree - taking the element
        ArrayList<String> right = subSequenceReturn(processed,unprocessed.substring(1)); //rightside tree - ignoring it

        left.addAll(right);
        return left;
    }
}
