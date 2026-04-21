public class Q2 {
    static int[] dx = {-1,-1,-1,0,0,1,1,1};
    static int[] dy = {-1,0,1,-1,1,-1,0,1};

    static boolean dfs(char[][] grid, int i, int j, String word, int idx, boolean[][] vis) {
        if (idx == word.length()) return true;

        if (i < 0 || j < 0 || i >= 4 || j >= 4 || vis[i][j] || grid[i][j] != word.charAt(idx))
            return false;

        vis[i][j] = true;

        for (int d = 0; d < 8; d++) {
            if (dfs(grid, i + dx[d], j + dy[d], word, idx + 1, vis))
                return true;
        }

        vis[i][j] = false;
        return false;
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'C','A','T','S'},
            {'O','R','E','A'},
            {'D','E','A','M'},
            {'E','L','L','S'}
        };

        String word = "DREAM";
        boolean found = false;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                boolean[][] vis = new boolean[4][4];
                if (dfs(grid, i, j, word, 0, vis)) {
                    found = true;
                    break;
                }
            }
        }

        System.out.println(found);
    }
}