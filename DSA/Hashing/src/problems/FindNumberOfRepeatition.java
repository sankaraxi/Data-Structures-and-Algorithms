package problems;

public class FindNumberOfRepeatition {
    // to find how many time the given number appear in the given array
    public static void main(String[] args) {
        int[] arr = {2,3,2,3,5};
        int n = 1;

//        int[] hash = new int[13];
//        for (int i = 0; i < arr.length; i++) {
//            hash[arr[i]] += 1;
//        }
//
//        System.out.println(hash[n]);

        int[] hash = new int[5+1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }

        for (int i = 1; i<= 5; i++){
            System.out.print(hash[i] + " ");
        }
        //GeeksForGeeksSolution
//        int[] hash = new int[N];
//        for (int i = 0; i < N; i++) {
//            if (arr[i] <= N) {
//                hash[arr[i]-1] += 1;
//            }
//        }
//
//        for (int i = 0; i< N; i++){
//            arr[i] = hash[i];
//        }

    }
}
