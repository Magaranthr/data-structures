import java.util.Stack;

public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    . . .

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        int target = pixels[row][column];
        int replacement = 1;
        if (target == replacement) return;

        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{row, column});

        while (!stack.isEmpty()) {
            int[] p = stack.pop();
            int r = p[0], c = p[1];
            if (r < 0 || r >= SIZE || c < 0 || c >= SIZE) continue;
            if (pixels[r][c] != target) continue;

            pixels[r][c] = replacement;

            stack.push(new int[]{r+1, c});
            stack.push(new int[]{r-1, c});
            stack.push(new int[]{r, c+1});
            stack.push(new int[]{r, c-1});
        }
    }

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}