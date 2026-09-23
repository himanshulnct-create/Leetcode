class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int L = 10;
        int n = s.length();
        HashSet <String> seen = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();
        for(int i = 0;i<=(n-L);i++){
            String seq = s.substring(i, i + L);
            if(!seen.add(seq)){
                repeated.add(seq);
            }
        }
        ArrayList<String> list = new ArrayList<>(repeated);
        return list;
    }
}
