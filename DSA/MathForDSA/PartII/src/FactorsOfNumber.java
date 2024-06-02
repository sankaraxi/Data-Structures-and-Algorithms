import java.util.ArrayList;

public class FactorsOfNumber {
    public static void main(String[] args) {
//        factors(13);
//        optimisedFactors(40);
        optimisedFactors1(40);
    }
    // my brute force solution
    //O(n) complexity
    static void factors(int n){
        for (int i = 1; i <=n ; i++) {
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
    }
    //O(sqrt(n)) complexity
    static void optimisedFactors(int n){
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " " + n/i + " ");
                }

            }
        }
    }
    //both time and space complexity will be O(Sqrt(n))
    static void optimisedFactors1(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " ");
                    list.add(n/i); //stores in descending order
                }

            }
        }
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i)+" "); //prints the numbers in the list from last
        }
    }
}
