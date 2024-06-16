import java.util.SplittableRandom;

public class SubSequence {
    // subset is for array ans subsequence is for strings
    public static void main(String[] args) {
        String strUnprocessed = "abc";
        String strProcessed = "";
        subSequence(strProcessed,strUnprocessed);
    }
    static void subSequence(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.print(processed+" ");
            return;
        }
        char ch = unprocessed.charAt(0);

        subSequence(processed+ch,unprocessed.substring(1)); //leftside tree - taking the element
        subSequence(processed,unprocessed.substring(1)); //rightside tree - ignoring it
    }
}
