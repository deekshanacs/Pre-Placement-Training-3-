public class BinarySearch {
    public static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArr = {2, 5, 8, 12, 16, 23, 38, 56};
        int target = 16;
        int result = search(sortedArr, target);
        
        System.out.println(result != -1 ? "Element found at index " + result : "Element not found");
    }
}
