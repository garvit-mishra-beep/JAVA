class Solution {
    public int getLength(int[] nums) {
        int[] dremovical = nums;
        int n = nums.length, ans = 1;
        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> cnt = new HashMap<>(), freq = new HashMap<>();
            for (int j = i; j < n; j++) {
                int x = nums[j], c = cnt.getOrDefault(x, 0);
                if (c > 0) {
                    freq.put(c, freq.get(c) - 1);
                    if (freq.get(c) == 0) freq.remove(c);
                }
                cnt.put(x, c + 1);
                freq.put(c + 1, freq.getOrDefault(c + 1, 0) + 1);
                if (cnt.size() == 1) ans = Math.max(ans, j - i + 1);
                else if (freq.size() == 2) {
                    int a = 0, b = 0;
                    for (int f : freq.keySet())
                        if (a == 0) a = f;
                        else b = f;
                    if (Math.max(a, b) == 2 * Math.min(a, b))
                        ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}