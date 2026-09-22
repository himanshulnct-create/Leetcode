class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int L = 10;
        int n = s.length();
        HashSet <String> set = new HashSet<>();
        HashSet<String> res = new HashSet<>();
        for(int right = 0;right<=(n-L);right++){
            if(set.contains(s.substring(right,right+10))){
                res.add(s.substring(right,right+10));
            }
            set.add(s.substring(right,right+10));
        }
        ArrayList<String> list = new ArrayList<>(res);
        return list;
    }
}