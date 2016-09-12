package Percolation;

/**
 * Created by adgardner on 8/31/16.
 */
public class Percolation {

    private int[][] grid;
    private int n;

    public Percolation(int n) {
        this.n = n;
        grid = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                grid[i][j] =  0;
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    public void open(int i, int j) {
        if(i < 0 || i > n)
        grid[i][j] = 1;
    }

    public boolean isOpen(int i, int j) {
        boolean isOpen = false;
        if (grid[i][j] == 1)
            isOpen = true;
        return isOpen;
    }

    public boolean isFull(int i, int j) {

        return true;
    }

    public boolean percolates() {
        return true;
    }
}
