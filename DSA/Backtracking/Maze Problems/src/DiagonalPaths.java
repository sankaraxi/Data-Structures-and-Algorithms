import java.util.ArrayList;

public class DiagonalPaths {
    public static void main(String[] args) {
        System.out.println(printDiagonalPathsArray("",3,3));
    }
    static ArrayList<String> printDiagonalPathsArray(String processed, int rows, int columns){
        if (rows == 1 && columns == 1){ //base condition
            ArrayList<String>list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if (rows > 1){ //going downward
            ans.addAll(printDiagonalPathsArray(processed+'D',rows-1,columns));
        }

        if (rows>1 && columns >1){ //going diagonally
            ans.addAll(printDiagonalPathsArray(processed+'d',rows-1,columns-1));
        }

        if (columns > 1){ //going forward
            ans.addAll(printDiagonalPathsArray(processed+'R',rows,columns-1));
        }
        return ans;
    }
}
