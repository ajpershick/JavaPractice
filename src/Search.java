public class Search {

    public static int binarySearch(int[] arr, int target) {
        int first = 0;
        int last = arr.length;
        int mid = first + (last-first)/2;
        while (first < last) {
            if (arr[mid] > target) {
                last = mid - 1;
            } else if (arr[mid] < target) {
                first = mid + 1;
            } else if (arr[mid] == target) {
                return mid;
            }
            mid = first + (last-first)/2;
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13};
        int target1 = 3;
        int target2 = 10;
        System.out.println(binarySearch(arr, target1));
        System.out.println(binarySearch(arr, target2));
    }

}
