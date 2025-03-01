import java.util.Scanner;
import java.util.Stack;

class Solution {
    public long minSubarraySum(int n, int[] a) {
        long result = 0;
        int mod = (int) (1e9 + 7);

        // Arrays to hold the next and previous less element indices
        int[] next = new int[n];
        int[] prev = new int[n];

        // Stack for previous less elements
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && a[stack.peek()] >= a[i]) {
                stack.pop();
            }
            prev[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear(); // Clear the stack for next less elements
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && a[stack.peek()] > a[i]) {
                stack.pop();
            }
            next[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Calculate the contribution of each element as the minimum
        for (int i = 0; i < n; i++) {
            long left = i - prev[i];
            long right = next[i] - i;
            result = (result + (a[i] * left * right) % mod) % mod;
        }

        return result;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        System.out.println(obj.minSubarraySum(n, a));
    }
}