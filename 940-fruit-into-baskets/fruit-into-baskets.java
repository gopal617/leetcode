class Solution {
    public int totalFruit(int[] fruits) {
            int left = 0;
        int maxLen = 0;

        Map<Integer, Integer> map = new HashMap<>(); 

        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], right);
            if (map.size() > 2) {

                // Find fruit with smallest last index (oldest)
                int minIndex = Integer.MAX_VALUE;
                int fruitToRemove = -1;

                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if(entry.getValue()<minIndex){
                        minIndex = entry.getValue();
                        fruitToRemove = entry.getKey();
                
                    }
                }

                left = minIndex + 1;
                map.remove(fruitToRemove);
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}