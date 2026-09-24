class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0;
        int sum = 0;
        int left = 0;

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int right = 0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            sum++;
            while(map.size()>2){
                int fruit = fruits[left];
                map.put(fruit,map.get(fruit)-1);
                sum--;
                if(map.get(fruit)==0){
                    map.remove(fruit);
                }
                left++;
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}