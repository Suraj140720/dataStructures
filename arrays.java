public class arrays {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 0, 1},
            {0, 0, 1},
            {1, 1, 1}
        };
        setMatrixZero(arr);

        // Print final matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Set Matrix Zero Brute Force
    public static void setMatrixZero(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        // First pass: mark -1 where rows and columns need to be zeroed
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    markRow(arr, i, cols);
                    markCol(arr, j, rows);
                }
            }
        }

        // Second pass: convert all -1 to 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    // Mark entire row with -1 (if not already 0)
    public static void markRow(int[][] arr, int row, int cols) {
        for (int j = 0; j < cols; j++) {
            if (arr[row][j] != 0) {
                arr[row][j] = -1;
            }
        }
    }

    // Mark entire column with -1 (if not already 0)
    public static void markCol(int[][] arr, int col, int rows) {
        for (int i = 0; i < rows; i++) {
            if (arr[i][col] != 0) {
                arr[i][col] = -1;
            }
        }
    }
}
