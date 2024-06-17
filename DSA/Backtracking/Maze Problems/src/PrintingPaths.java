import java.util.ArrayList;

public class PrintingPaths {
    //display the number of possible paths to reach the destination in a maze
    // given that the user can only move in forward and downward direction
    public static void main(String[] args) {

        printPaths("",3,3);// to print the possible paths
        System.out.println();
        System.out.println( printPathsArray("",3,3)); // to display in array

    }

    static void printPaths(String processed, int rows, int columns){
        if (rows == 1 && columns == 1){ //base condition
            System.out.print(processed+" ");
            return;
        }

        if (rows > 1){ //going downward
            printPaths(processed+'D',rows-1,columns);
        }

        if (columns > 1){ //going forward
            printPaths(processed+'R',rows,columns-1);
        }

    }
    //to return in array lists
    static ArrayList<String> printPathsArray(String processed, int rows, int columns){
        if (rows == 1 && columns == 1){ //base condition
            ArrayList<String>list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (rows > 1){ //going downward
            ans.addAll(printPathsArray(processed+'D',rows-1,columns));
        }

        if (columns > 1){ //going forward
            ans.addAll(printPathsArray(processed+'R',rows,columns-1));
        }
        return ans;
    }
}