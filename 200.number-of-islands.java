import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {

    //Linear scan the 2d grid map, 
    //if a node contains a '1', 
    //then it is a root node that triggers a Breadth First Search. 
    //Put it into a queue and set its value as '0' to mark as visited node. 
    //Iteratively search the neighbors of enqueued nodes until the queue becomes empty.
    public int numIslands(char[][] grid) {
        
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length; // num of row
        int nc = grid[0].length; // num of column
        int num = 0; // num of islands

        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if (grid[r][c] == '1') {
                    num++;
                    grid[r][c] = 0; // mark as visited
                    Queue<Integer> neighbour = new LinkedList<>();
                    neighbour.add(r*nc + c);

                    while (!neighbour.isEmpty()) {
                        int id = neighbour.remove();
                        int row = id / nc;
                        int col = id % nc;
                        if (row-1 >= 0 && grid[row-1][col] == '1') {
                            neighbour.add((row-1)*nc + col);
                            grid[row-1][col] = '0';
                        }
                        if (row+1 < nr && grid[row+1][col] == '1') {
                            neighbour.add((row+1)*nc + col);
                            grid[row+1][col] = '0';
                        }
                        if (col-1 >= 0 && grid[row][col-1] == '1') {
                            neighbour.add(row*nc + col - 1);
                            grid[row][col-1] = 0;
                        }
                        if (col+1 < nc && grid[row][col+1] == '1') {
                            neighbour.add(row*nc + col + 1);
                            grid[row][col+1] = 0;
                        }
                    }
                }
            }
        }
        return num;
    }
}
// @lc code=end

