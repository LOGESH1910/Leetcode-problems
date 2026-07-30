class Solution {
    public int balancedString(String s) {
        int n = s.length();
        int target = n / 4;

        int[] count = new int[128];

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            count[c]++;
        }

        int left = 0;
        int minLength = n;

        for (int right = 0; right < n; right++) {
            count[s.charAt(right)]--;

            while (left < n &&
                   count['Q'] <= target &&
                   count['W'] <= target &&
                   count['E'] <= target &&
                   count['R'] <= target) {

                minLength = Math.min(minLength, right - left + 1);

                count[s.charAt(left)]++;
                left++;
            }
        }

        return minLength;
    }
}