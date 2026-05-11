public class peakofmountain {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,3,1};
        int target = 3;

        int ans = search(array, target);

        System.out.println(ans);
    }

    public static int search(int[] arr, int target) {

        int peak = peakIndexInMountainArray(arr);

        // search in ascending part
        int firstTry = orderAgnosticBS(arr, target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }

        // search in descending part
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
     // it returns the indexs where the peak
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {

                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            } else {

                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    public static int peakIndexInMountainArray(int[] arr) {
        //returns the index of the peak item so that in above fn we can separately do bs

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[mid + 1]) {

                // descending part
                high = mid;

            } else {

                // ascending part
                low = mid + 1;
            }
        }

        return low;
    }
}
