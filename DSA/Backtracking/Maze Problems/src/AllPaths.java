public class AllPaths {
    //display the number of possible paths to reach the destination in a maze
    // given that the user can only move in all four directions
    public static void main(String[] args) {

        boolean[][] maze_board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        allPathsAreUsed("",maze_board,0,0);
    }

    static void allPathsAreUsed(String processed, boolean[][] maze, int rows, int columns){
        if (rows == maze.length-1 && columns == maze[0].length-1){ //base condition
            System.out.println(processed);
            return;
        }

        if (!maze[rows][columns]){
            return;
        }
        //if not false, i amd considering this block in my path
        maze[rows][columns] = false;


        if (rows < maze.length-1){ //going downward
            allPathsAreUsed(processed+'D',maze,rows+1,columns);
        }

        if (columns < maze[0].length-1){ //going forward
            allPathsAreUsed(processed+'R',maze,rows,columns+1);
        }
        if (rows > 0){ //going upward
            allPathsAreUsed(processed+'U',maze,rows-1,columns);
        }
        if (columns > 0){ //going backward
            allPathsAreUsed(processed+'L',maze,rows,columns-1);
        }
        // this line is where function will be over
        // so before the function gets removed, also remove the changes made by the function
        maze[rows][columns] = true;

    }
}
