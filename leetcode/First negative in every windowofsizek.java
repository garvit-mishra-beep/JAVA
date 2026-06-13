import java.util.*;
class Solution {
    public List<Integer> firstNegInt(int[] arr, int k) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                q.add(i);
            if (i >= k - 1) {
                while (!q.isEmpty() && q.peek() < i - k + 1)
                    q.poll();
                ans.add(q.isEmpty() ? 0 : arr[q.peek()]);
            }
        }
        return ans;
    }
}