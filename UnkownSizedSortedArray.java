/**
 * TC - O(log n)
 * SC - O(1)
 */
public class UnkownSizedSortedArray {

        public int search(ArrayReader reader, int target) {

            int low = 0, high = 1;

            while (reader.get(high) < target) {
                low = high + 1;
                high = high * 2;
            }

            while (low <= high) {
                int mid = low + (high - low) /2;

                if (reader.get(mid) == target) {
                    return mid;
                }

                if (reader.get(mid) < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            return -1;
        }
}