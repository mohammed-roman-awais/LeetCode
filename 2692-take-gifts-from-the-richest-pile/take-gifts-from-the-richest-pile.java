import java.util.*;
class Solution {
    public long pickGifts(int[] gifts, int k) {
        // Max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // Add all gifts to heap
        for (int gift : gifts) {
            maxHeap.add(gift);
        }
        // Perform k operations
        while (k-- > 0) {
            int max = maxHeap.poll();
            int reduced = (int) Math.floor(Math.sqrt(max));
            maxHeap.add(reduced);
        }
        // Calculate total remaining gifts
        long sum = 0;
        while (!maxHeap.isEmpty()) {
            sum += maxHeap.poll();
        }       
        return sum;
    }
}