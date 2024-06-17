public class CountingPaths {
    //determine the number of possible paths to reach the destination in a maze
    // given that the user can only move in forward and downward direction
    public static void main(String[] args) {
        System.out.println(countPaths(3,3));// to count the possible paths
    }

    static int countPaths(int rows, int columns){
        if (rows == 1 || columns == 1){ //base condition
            return 1;
        }
        int left = countPaths(rows-1,columns); //going downward
        int right = countPaths(rows,columns-1); //going forward

        return left+right;
    }

}