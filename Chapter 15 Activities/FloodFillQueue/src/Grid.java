import java.util.LinkedList;
import java.util.Queue;

public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        int target = pixels[row][column];
        int replacement = 1;
        if (target == replacement) return;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row, column));

        while (!q.isEmpty()) {
            Pair p = q.remove();
            int r = p.getRow();
            int c = p.getColumn();
            if (r < 0 || r >= SIZE || c < 0 || c >= SIZE) continue;
            if (pixels[r][c] != target) continue;

            pixels[r][c] = replacement;

            q.add(new Pair(r + 1, c));
            q.add(new Pair(r - 1, c));
            q.add(new Pair(r, c + 1));
            q.add(new Pair(r, c - 1));
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