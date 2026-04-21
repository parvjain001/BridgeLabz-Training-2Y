public class Q3 {
    static void solve(int n) {
        int[] board = new int[n];
        place(0, n, board);
    }

    static void place(int row, int n, int[] board) {
        if (row == n) {
            print(board);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board)) {
                board[row] = col;
                place(row + 1, n, board);
            }
        }
    }

    static boolean isSafe(int row, int col, int[] board) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row))
                return false;
        }
        return true;
    }

    static void print(int[] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i] == j) System.out.print("Q ");
                else System.out.print(". ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        solve(4);
    }
}