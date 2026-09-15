class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++) // for rows  in eg:1 it has 4 rows
        {
            for(int j=0;j<grid[i].length;j++) //the first element in the row eg 4 3 2 -1 the first element is 4 so grid[i][j] i=0(row) j=0 coloumn
            {
                if(grid[i][j]<0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
