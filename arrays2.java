import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args)
    {
        //Sort an array of 0,1,2(By Dutch Flag Algorithm)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        } 
        System.err.println(maxProfit(arr));
    }

    //Best Time to Buy and Sell Stock
    public static int maxProfit(int[] prices) {
        int mini = prices[0];
        int profit = 0;
        int n = prices.length;
        for(int i =0; i<n; i++)
        {
            int sp = prices[i] - mini;
            profit = Math.max(sp, profit);
            mini = Math.min(mini, prices[i]);
        }
        return profit;
    }

    //Sort an array of 0,1,2(By Dutch Flag Algorithm)
    public static void sortArrayOf012(int[] arr)
    {
        int low = 0; int mid = 0; int high = arr.length-1;
        while(mid<=high)
        {
            if(arr[mid] == 0)
            {
                swap(arr, low, mid);
                low++;
                mid++;
            }else if(arr[mid] == 1)
            {
                mid++;
            }else
            {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    //Maximum Sum in Sub Array
    //[3.Optimised Solution(Kadans Algorithm)]
    public static int maxSubArrayOptimised(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i =0; i<nums.length; i++)
        {
            currSum += nums[i];

            if(currSum > sum)
            {
                sum = currSum;
            }

            if(currSum < 0)
            {
                currSum = 0;
            }
            
        }
        return sum;
    }
    //[2.Better Solution]
    public static void maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        for(int i =0; i<nums.length; i++)
        {
            int currSum = 0;
            for(int j =i; j<nums.length; j++)
            {
                currSum += nums[j];
                if(currSum > sum)
                {
                    sum = currSum;
                }
            }
            
        }
        System.out.println(sum);
    }
    //[1.Brute Force]
    public static void MaxxSumSubArray(int[] arr)
    {
        int sum = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++)
        {
            for(int j =0; j<arr.length; j++)
            {
                int currSum = 0;
                for(int k = i; k<=j; k++)
                {
                    currSum = currSum + arr[k];
                }
                if(currSum > sum)
                {
                    sum = currSum;
                }
            }
            
        }
        System.out.println(sum);
    }

    //Next Permutation
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find first decreasing element from the end
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If not the last permutation
        if (i >= 0) {
            int j = n - 1;

            // Find element just larger than nums[i]
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }

            // Swap nums[i] and nums[j]
            swap(nums, i, j);
        }

        // Step 3: Reverse the subarray after i
        reverse(nums, i + 1, n - 1);
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
}
