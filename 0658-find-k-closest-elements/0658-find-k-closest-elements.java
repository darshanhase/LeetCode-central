class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
          PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a, b) -> {
                if (Math.abs(b - x) == Math.abs(a - x))
                    return b - a;
                return Math.abs(b - x) - Math.abs(a - x);
            }
        );

        for (int num : arr) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        List<Integer> res = new ArrayList<>(maxHeap);
        Collections.sort(res);
        return res;
    }
}