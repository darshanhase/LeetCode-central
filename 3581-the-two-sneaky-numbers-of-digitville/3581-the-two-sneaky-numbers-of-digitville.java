class Solution {
     public static int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (countMap.get(num) == 2 && !result.contains(num)) {
                result.add(num);
                if (result.size() == 2) break;
            }
        }

        return result.size() == 2 ? new int[]{result.get(0), result.get(1)} : new int[0];
    }

}