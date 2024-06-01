import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(36));
        System.out.println(listOfPrime(40));
    }
    static boolean isPrimeNumber(int n){
        for (int i = 2; i < n; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    // efficient code
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c = 2; //start by dividing by 2
        while(c * c <= n){ // say n is equal to 36, it will run upto c = 6 which gives 36 by squaring it
            if (n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
    static ArrayList<Integer> listOfPrime(int n){
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)){
                array.add(i);
            }
        }
        return array;
    }
}
