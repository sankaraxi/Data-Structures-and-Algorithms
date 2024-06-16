public class SkipACharacter {
    // given a string "baccad", remove all the 'a' from it
    public static void main(String[] args) {
        String str = "baccad";
        String ans = "";
//        skipA(str,ans);
//        removeAllA(str,ans);
        System.out.println(removeAllA2(str));
    }

    static void skipA(String unprocessed, String processed){
        if (unprocessed.isEmpty()){ //base condition
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'a') {
            skipA(unprocessed.substring(1),processed); //.substring(1) removes the first character of the given string
        }else{
            skipA(unprocessed.substring(1),processed+ch);
        }
    }
    // my brute force solution
    static void removeAllA(String str,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        if (str.charAt(0)!='a'){
            removeAllA(str.substring(1),ans+str.charAt(0));
        }else{
            removeAllA(str.substring(1),ans);
        }

    }

    //returing a string
    static String removeAllA2(String unprocessed){
        if (unprocessed.isEmpty()){
            return "";
        }
        char ch = unprocessed.charAt(0);

        if (ch == 'a') {
           return removeAllA2(unprocessed.substring(1)); //.substring(1) removes the first character of the given string
        }else{
            return ch + removeAllA2(unprocessed.substring(1));
        }
    }
}