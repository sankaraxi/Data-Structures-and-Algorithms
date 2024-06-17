import java.util.Arrays;

public class AllPathsPrintStep {
    //display the number of possible paths to reach the destination in a maze
    // given that the user can only move in all four directions
    public static void main(String[] args) {

        boolean[][] maze_board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path =new int[maze_board.length][maze_board[0].length];
        allPathsPrintStep("",maze_board,0,0,path,1);
    }

    static void allPathsPrintStep(String processed, boolean[][] maze, int rows, int columns,int[][] path,int step){
        if (rows == maze.length-1 && columns == maze[0].length-1){ //base condition
            path[rows][columns] = step;
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(processed);
            System.out.println();
            return;
        }


        if (!maze[rows][columns]){
            return;
        }
        //if not false, i amd considering this block in my path
        maze[rows][columns] = false;
        path[rows][columns] = step;


        if (rows < maze.length-1){ //going downward
            allPathsPrintStep(processed+'D',maze,rows+1,columns,path,step+1);
        }

        if (columns < maze[0].length-1){ //going forward
            allPathsPrintStep(processed+'R',maze,rows,columns+1,path,step+1);
        }
        if (rows > 0){ //going upward
            allPathsPrintStep(processed+'U',maze,rows-1,columns,path,step+1);
        }
        if (columns > 0){ //going backward
            allPathsPrintStep(processed+'L',maze,rows,columns-1,path,step+1);
        }
        // this line is where function will be over
        // so before the function gets removed, also remove the changes made by the function
        maze[rows][columns] = true;
        path[rows][columns] = 0;

    }
}
