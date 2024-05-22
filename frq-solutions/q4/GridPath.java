public class GridPath {
  
  private int[][] grid;

  public Location getNextLoc(int row, int col) {
      int belowValue = Integer.MAX_VALUE;
      int rightValue = Integer.MAX_VALUE;

      if (row < grid.length - 1) {
          belowValue = grid[row + 1][col];
      }

      if (col < grid[0].length - 1) {
          rightValue = grid[row][col + 1];
      }

      if (belowValue < rightValue) {
          return new Location(row + 1, col);
      } else {
          return new Location(row, col + 1);
      }
  }


  public int sumPath(int row, int col) {
      int sum = 0;

      while (row < grid.length - 1 || col < grid[0].length - 1) {
          sum += grid[row][col];
          Location nextLocation = getNextLoc(row, col);
          row = nextLocation.getRow();
          col = nextLocation.getCol();
      }

      sum += grid[row][col]; // Add the value of the last element
      return sum;
  }

}
