import java.util.ArrayList;

public class Dice {
    //amazon question
    //given a dice, find the number of combinations to get four i.e., [4, 3 1, 2 2, 1 1 2,....]
    public static void main(String[] args) {
        diceCombinations("",4);
        System.out.println();
        System.out.println(diceCombinationsArray("",4));
    }

    static void diceCombinations(String processed , int target){
        if (target == 0){
            System.out.print(processed+" ");
            return;
        }
        for (int i = 1; i <=6 && i <= target; i++) {
            diceCombinations(processed+i,target-i);
        }
    }

    static ArrayList<String> diceCombinationsArray(String processed , int target){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <=6 && i <= target; i++) {
            list.addAll(diceCombinationsArray(processed+i,target-i));
        }
        return list;
    }
}
