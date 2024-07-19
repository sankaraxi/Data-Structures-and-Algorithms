package problems;

public class HashingStrings {
    public static void main(String[] args) {

        //hash for 26 lowercase alphabets
        String str = "abcdabehf";
        int[] hash = new int[26];

        //preparing the hash table
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a'] += 1;
        }
        System.out.println('c'-'a');


//        //printing the hash table
//        for (int i = 0; i < 26; i++) {
//            if (hash[i] > 0) { //it wont print the characters which are not present in the string
//                System.out.println((char) (i + 'a') + " " + hash[i]);
//            }
//        }


        //hashing for 256 ascii characters
        String str1 = "abcdaccbehf";
        int[] hash1 = new int[256]; //hash table for 256 ascii characters

        //preparing the hash table
        for (int i = 0; i < str.length(); i++) {
            hash1[str1.charAt(i)] += 1;
        }
        System.out.println(hash1['c']);
    }
}
