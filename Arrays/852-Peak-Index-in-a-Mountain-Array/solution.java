public class peakofmountain {
    public static void main(String[] args) {
        int [] array = { 0,10,5,2};
        int a = peakIndexInMountainArray(array);
        System.out.println(a);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = (arr.length)-1;
        while(low < high){

            int mid = low+(high-low)/2;

            if ( arr[mid]> arr[mid+1]) {
                high = mid ;
            }
            else  {
                low = mid +1;
            }



        }return low; //or return high as both are same

    }
}
