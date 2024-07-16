public class MazeWithObstacles {
    //display the number of possible paths to reach the destination in a maze
    // given that the user can only move in forward and downward direction but has a obstacle in his path
    public static void main(String[] args) {

        boolean[][] maze_board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathWithObstacles("",maze_board,0,0);
    }

    static void pathWithObstacles(String processed, boolean[][] maze, int rows, int columns){
        if (rows == maze.length-1 && columns == maze[0].length-1){ //base condition
            System.out.print(processed+" ");
            return;
        }
        if (!maze[rows][columns]){ // if condition is used to return
            return;
        }

        if (rows < maze.length-1){ //going downward
            pathWithObstacles(processed+'D',maze,rows+1,columns);
        }

        if (columns < maze[0].length-1){ //going forward
            pathWithObstacles(processed+'R',maze,rows,columns+1);
        }

    }
}
