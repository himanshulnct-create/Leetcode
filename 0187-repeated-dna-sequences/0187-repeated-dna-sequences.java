class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();

        if (n <= 10) {
            return new ArrayList<>();
        }

        Set<Integer> seen = new HashSet<>();
        Set<Integer> repeated = new HashSet<>();

        int code = 0;
        int mask = (1 << 20) - 1;

        // First 10 characters
        for (int i = 0; i < 10; i++) {
            code = (code << 2) | encode(s.charAt(i));
        }

        seen.add(code);

        // Rolling window
        for (int i = 10; i < n; i++) {
            code = ((code << 2) | encode(s.charAt(i))) & mask;

            if (!seen.add(code)) {
                repeated.add(code);
            }
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i <= n - 10; i++) {
            int current = 0;

            for (int j = i; j < i + 10; j++) {
                current = (current << 2) | encode(s.charAt(j));
            }

            if (repeated.contains(current)) {
                result.add(s.substring(i, i + 10));
                repeated.remove(current);
            }
        }

        return result;
    }

    private int encode(char c) {
        if (c == 'A') return 0;
        if (c == 'C') return 1;
        if (c == 'G') return 2;
        return 3;
    }
}
