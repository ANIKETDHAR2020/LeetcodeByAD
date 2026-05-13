public class Search_in_rotated_array_element_duplication {


        public static void main(String[] args) {
            int[] array = {4,5,6,7,0,1,2};
            int target = 0;

            int ab = search(array, target);
            System.out.println(ab);
        }

        public static int search(int[] nums, int target) {

            int pivot = findpivotwithduplicatsvalues(nums);

            // array not rotated
            if (pivot == -1) {
                return binarysearch(nums, 0, nums.length - 1, target);
            }

            // pivot element itself
            if (nums[pivot] == target) {
                return pivot;
            }

            // search left half
            if (target >= nums[0]) {
                return binarysearch(nums, 0, pivot - 1, target);
            }

            // search right half
            return binarysearch(nums, pivot + 1, nums.length - 1, target);
        }

        /*public static int findpivot(int[] array) {

            int start = 0;
            int end = array.length - 1;

            while (start <= end) {

                int mid = start + (end - start) / 2;

                // case 1
                if (mid < end && array[mid] > array[mid + 1]) {
                    return mid;
                }

                // case 2
                if (mid > start && array[mid] < array[mid - 1]) {
                    return mid - 1;
                }

                // case 3
                if (array[start] >= array[mid]) {
                    end = mid - 1;
                } else { //case4
                    start = mid + 1;
                }
            }

            return -1;
        }*/
    public static int findpivotwithduplicatsvalues(int[] array) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // case 1
            if (mid < end && array[mid] > array[mid + 1]) {
                return mid;
            }

            // case 2
            if (mid > start && array[mid] < array[mid - 1]) {
                return mid - 1;
            }

            //if middle and start and end are equal then just skip them
            if (array[start] == array[mid] && array[mid] == array[end]) {
                //now if the start itself is the pivot then we just cannot skip it without checking
                // if start = pivot then next item must be less then it
                if(array[start] > array[start+1]){
                    return start;
                }
                start++;
                //check if the end is pivot or not
                if(array[end] < array[end-1]){
                    return end-1;
                }
                end--;

            } else if(array[start] < array[mid] || array[start] == array[mid] && array[mid] > array[end]){ //case4
                start = mid + 1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }

        public static int binarysearch(int[] array, int start, int end, int target) {

            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (target < array[mid]) {
                    end = mid - 1;
                }

                else if (target > array[mid]) {
                    start = mid + 1;
                }

                else {
                    return mid;
                }
            }

            return -1;
        }
    }

