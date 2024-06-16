import java.util.ArrayList;

public class Ascii {
    //to print the ascii value of subsequence characters
    public static void main(String[] args) {
        String strUnprocessed = "abc";
        String strProcessed = "";
//        subSequenceAscii(strProcessed,strUnprocessed); // to display normally
        System.out.println(subSequenceReturnAscii(strProcessed,strUnprocessed)); //to display in string
    }
    static void subSequenceAscii(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.print(processed+" ");
            return;
        }
        char ch = unprocessed.charAt(0);

        subSequenceAscii(processed+ch,unprocessed.substring(1)); //leftside tree - taking the element
        subSequenceAscii(processed,unprocessed.substring(1));//rightside tree - ignoring it
        subSequenceAscii(processed+(ch+0),unprocessed.substring(1));
    }
    static ArrayList<String> subSequenceReturnAscii(String processed, String unprocessed){
        if(unprocessed.isEmpty()){ // base condition
            ArrayList<String> list = new ArrayList<>();
//            if (processed != ""){ // it is used remove empty string
//                list.add(processed);
//            }
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);

        ArrayList<String> first = subSequenceReturnAscii(processed+ch,unprocessed.substring(1));
        ArrayList<String> second = subSequenceReturnAscii(processed,unprocessed.substring(1));
        ArrayList<String> third = subSequenceReturnAscii(processed+(ch+0),unprocessed.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }

}
