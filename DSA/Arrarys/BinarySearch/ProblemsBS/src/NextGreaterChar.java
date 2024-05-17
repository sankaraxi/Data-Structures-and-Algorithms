public class NextGreaterChar {
    public static void main(String[] args) {

        char[] letters = {'c','f','j'};
        char target = 'g';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);

    }

    static char nextGreatestLetter(char[] letters, char target){
        // to find the the smallest letter that is greater than the target character in the given array
        // also if the target is the greatest character / not exist in the given array then return the smallest letter

        int start = 0;
        int end = letters.length-1;

        while (start <= end){
//            int mid = (start + end) /2; //this formula may exceeds the integer range if the the values are larger
            int mid  = start + (end - start)/2; // (2start + end - start)/2; gives the optimised mid value

            if (target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
