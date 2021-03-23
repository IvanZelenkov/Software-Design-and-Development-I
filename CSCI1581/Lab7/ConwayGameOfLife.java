// Ivan Zelenkov Problem 9 (Conway Game Of Life)

import java.util.Arrays;

public class ConwayGameOfLife {
    static boolean[][] update(boolean[][] grid) {
        //creating a new grid to store result
        boolean[][] newGrid = new boolean[grid.length][grid.length];
        //two for loop one for row and another for column
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0;j < grid.length; j++) {

                //variable to count number of alive cell nearby, initialize it to 0
                int numberOfAliveCellNearby = 0;
                //using two loops to determine index of all the nearby cell of current (i,j) cell

                for(int x = i - 1; x <= i + 1; x++) {
                    for(int y = j - 1; y <= j + 1; y++) {

                        //florMod function always gives positive result. For all negative result it loops around the index
                        if((grid[Math.floorMod(x, grid.length)][Math.floorMod(y, grid.length)]) && !(x==i && y==j))
                            numberOfAliveCellNearby++;
                    }
                }
                //if number of alive cell is less than 2, then cell at that position dies, as if by underpopulation
                if(numberOfAliveCellNearby < 2)
                    newGrid[i][j] = false;
                    //if number of alive cell nearby is 2 or 3, then cell lives
                else if (numberOfAliveCellNearby == 2 || numberOfAliveCellNearby == 3)
                    newGrid[i][j] = true;
                else    //else cell dies
                    newGrid[i][j] = false;
            }
        }
        //returns the newGrid, which has the next generation of grid
        return newGrid;
    }
    static int countNeighbors(int i, int j, boolean[][] grid) {
        int count = 0;
        for (i = 0; i < grid.length; i++) {
            for (j = 0; j < grid.length; j++) {

                if (grid[i][j] == false)
                    count++;
            }
        }
        return count;
    }
}