import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class arrays3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i<n; i++)
        {
            for(int j =0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        } 
        mergeInterval(arr);
        for(int i = 0; i<n; i++)
        {
            for(int j =0;j<n;j++)
            {
                System.out.println(arr[i][j]);
            }
        } 
    }

    //Merge Intervals Optimal
    public static int[][] mergeInterval(int[][] arr)
    {
        int n = arr.length;
        List<int[]> list = new ArrayList<>();

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int[] current = arr[0];
        for(int i =1; i<n; i++)
        {
            int[] next = arr[i];

            if(current[1] >= next[0])
                {
                    current[1] = Math.max(current[1], next[1]);
                }else{
                    list.add(current);
                    current = next;
                }
        }
        list.add(current);
        return list.toArray(new int[list.size()][]);
    }


    //Rotate Matrix(By 90 Degree)
    //[2.Optiomal Version]
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] ans = new int[n][m];
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<m; j++)
            {
                ans[j][(n-1)-i] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = ans[i][j];
            }
        }
    }

    //[1.Brute Force]
    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i = 0; i<n-1; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                swap(matrix, i,j);
            }
        }
        for(int i = 0; i<n; i++)
        {   
            reverseRow(matrix[i]);
        }
    }
    public static void swap(int[][] arr,int a, int b)
    {
        int temp = arr[a][b];
        arr[a][b] = arr[b][a];
        arr[b][a] = temp;
    }
    public static void reverseRow(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
}
