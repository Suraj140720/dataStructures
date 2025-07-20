import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {

        //Pascal Traingle
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pascleTraingleForGivenN(n);

        //Set Matrix Zero
        // int[][] arr = {
        //     {1, 0, 1},
        //     {1, 1, 1},
        //     {1, 1, 0}
        // };
        // setZeroesOptimalSolution(arr);

        // Print final matrix
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }

    public static void pascleTraingleForGivenN(int n)
    {
        int ans = 1;
        for(int i = 1; i<=n; i++)
        {
            PascalTraingleNthRowOptimized(i);
        }
    }

       //Pascal Trainngle for Printing Nth Row
        public static void PascalTraingleNthRowOptimized(int n)
       {
            int ans = 1;
            System.out.println(ans);
            for(int i =1; i<n; i++)
            {
                ans = ans*(n-i);
                ans = ans/i;
                System.out.println(ans);
            }
       }

       public static void PascalTraingleNthRow(int n, int r)
       {
            for(int i =0; i<r; i++)
            {
                PascalTraingleNthElement(n, i+1);
            }
       }

      //Pascal Traingle for print nth & rth element in column
      public static void PascalTraingleNthElement(int n, int r)
      {
        int element = 1;
        n = n-1;
        r = r-1;

        for(int i =0; i<r; i++)
        {
            element = element*(n-i);
            element = element/(i+1);
        }
        System.out.println(element);
      }

      //Set Matrix Zero (Optimized Version)
      public static void setZeroesOptimalSolution(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int col0 = 1;
        for(int i = 0; i<m; i++)
        {
            for(int j =0; j<n; j++)
            {
                if(matrix[i][j]== 0)
                {
                    matrix[i][0] = 0;

                    if(j != 0)
                    {
                        matrix[0][j] = 0;
                    }else{
                        col0 = 0;
                    }
                }
            }
        }

        for(int i = 1; i<m; i++)
        {
            for(int j =1; j<n; j++)
            {
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                {
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0)
        {
            for(int i =0;i<m;i++)
            {
                matrix[0][i] = 0;
            }
        }
        if(col0 == 0){
            for(int i =0;i<n;i++)
            {
                matrix[i][0] = 0;
            }
        }
    }

    //Better Version than Brute force(Time Complexity n2)
    public static void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[] row = new int[m];
        int[] col = new int[n];

        for(int i = 0; i<m; i++)
        {
            for(int j =0; j<n; j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i = 0; i<m; i++)
        {
            for(int j =0; j<n; j++)
            {
                if(row[i] == 1 || col[j] == 1)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    // Set Matrix Zero Brute Force(Time Complexity around n3)
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
