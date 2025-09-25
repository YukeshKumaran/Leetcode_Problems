class Solution {
    public String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int maxLen = 0;
        int startIndex = 0;

        for (int i = 0; i < n; i++) {
            int l1 = i, r1 = i;
            while (l1 >= 0 && r1 < n && arr[l1] == arr[r1]) {
                if (r1 - l1 + 1 > maxLen) {
                    maxLen = r1 - l1 + 1;
                    startIndex = l1;
                }
                l1--;
                r1++;
            }

            int l2 = i, r2 = i + 1;
            while (l2 >= 0 && r2 < n && arr[l2] == arr[r2]) {
                if (r2 - l2 + 1 > maxLen) {
                    maxLen = r2 - l2 + 1;
                    startIndex = l2;
                }
                l2--;
                r2++;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = startIndex; i < startIndex + maxLen; i++) {
            result.append(arr[i]);
        }

        return result.toString();
    }
}
