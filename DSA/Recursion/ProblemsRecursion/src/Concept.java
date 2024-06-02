public class Concept {
    public static void main(String[] args) {
        passingNumbers(10);
    }

    static void passingNumbers(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
//        passingNumbers(n--); // wont work because n is passed first and never subtracted
        passingNumbers(--n); //in this case n is subtracted and passed again so it will work
    }
}
