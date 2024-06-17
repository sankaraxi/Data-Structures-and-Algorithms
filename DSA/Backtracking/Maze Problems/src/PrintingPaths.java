public class PrintingPaths {
    //display the number of possible paths to reach the destination in a maze
    // given that the user can only move in forward and downward direction
    public static void main(String[] args) {

        printPaths("",3,3);// to print the possible paths

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

}