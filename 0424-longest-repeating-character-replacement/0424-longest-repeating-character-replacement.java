class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int left =0;
        int right = 0;
        int maxC = 0;
        int [] counts = new int [26];

        while(right<s.length()){
            char c = s.charAt(right);
            counts[c - 'A']++;
            maxC = Math.max(maxC, counts[c - 'A']);

            while((right-left+1) - maxC > k){
                char d = s.charAt(left);
                counts[d - 'A']--;
                left++;
                for(int l = 0; l<26; l++){
                    maxC = Math.max(maxC, counts[l]);
                }
            }
            max = Math.max(max, (right-left+1));
            right++;
        }
        return max;
    }
}