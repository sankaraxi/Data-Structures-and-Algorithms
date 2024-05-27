public class StringBuilderJava {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('A'+i);
            builder.append(ch).append(" ");
        }
        System.out.println(builder);
        builder.reverse();
        builder.deleteCharAt(0);
        System.out.println(builder);
    }
}
