public class SkipAStringIfItIsNot {
    public static void main(String[] args) {
        String str = "bsddappapplefsgg";
        System.out.println(skipAppNotApple(str));
    }

    static String  skipAppNotApple(String str) {
        if (str.isEmpty()){
            return "";
        }

        if(str.startsWith("app") && !str.startsWith("apple")){ // removes only the 'app' not the 'apple'
            return skipAppNotApple(str.substring(3));
        }else{
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }
}
