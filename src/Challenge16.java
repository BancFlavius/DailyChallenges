public class Challenge16 {

    /*
    Conway's Game of Life takes place on an infinite two-dimensional board of square cells.
    Each cell is either dead or alive, and at each tick, the following rules apply:

    Any live cell with less than two live neighbours dies.
    Any live cell with two or three live neighbours remains living.
    Any live cell with more than three live neighbours dies.
    Any dead cell with exactly three live neighbours becomes a live cell.
    A cell neighbours another cell if it is horizontally, vertically, or diagonally adjacent.
     */

    public static int[][] firstGeneration(){
        int R = 10, C = 10;

        // Intiliazing the grid.
        int[][] grid = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };

        // Displaying the grid
        System.out.println("Original Generation");
        for (int i = 0; i < R; i++)
        {
            for (int j = 0; j < C; j++)
            {
                if (grid[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        return grid;
    }

    public static int[][] nextGenerations(int[][] grid, int R, int C){
        int[][] nextGen = new int[R][C];

        for(int r = 1; r < R-1; r++){
            for(int c = 1; c < C-1; c++){

                int cellsAliveAround = 0;
                for(int i = -1; i <= 1; i++){
                    for(int j = -1; j <= 1; j++){
                        cellsAliveAround += grid[r + i][c + j];
                    }
                }
                cellsAliveAround -= grid[r][c];
                if(((grid[r][c] == 1) && cellsAliveAround == 2) || (grid[r][c] == 1 && cellsAliveAround == 3)){
                    nextGen[r][c] = grid[r][c];
                } else if((grid[r][c] == 1) && cellsAliveAround < 2){
                    nextGen[r][c] = 0;
                }else if((grid[r][c] == 1) && cellsAliveAround > 3){
                    nextGen[r][c] = 0;
                }else if((grid[r][c] == 0) && cellsAliveAround == 3) {
                    nextGen[r][c] = 1;

                }else {
                    nextGen[r][c] = grid[r][c];
                }
            }
        }

        System.out.println("Next Generation");
        for (int i = 0; i < R; i++)
        {
            for (int j = 0; j < C; j++)
            {
                if (nextGen[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        return nextGen;
    }

    public static void main(String[] args) {
        nextGenerations(firstGeneration(), 10, 10);
        System.out.println("THIRD GEN ----------");
        nextGenerations(nextGenerations(firstGeneration(), 10, 10), 10, 10);
    }
}
