import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return ans;
        }
        
        int i = 0;
        int j = matrix.length - 1;
        int n = 0;
        int m = matrix[0].length - 1;
        while (i <= j && n <= m) {
            for (int v = n; v <= m; v++) {
                ans.add(matrix[i][v]);
            }
            i++;
            for (int u = i; u <= j; u++) {
                ans.add(matrix[u][m]);
            }
            m--;
            if (i <= j) {
                for (int v = m; v >= n; v--) {
                    ans.add(matrix[j][v]);
                }
                j--;
            }
            if (n <= m) {
                for (int u = j; u >= i; u--) {
                    ans.add(matrix[u][n]);

                }
                n++;
            }
        }
        
        return ans;
    }
}