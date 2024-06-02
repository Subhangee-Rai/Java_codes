public class check_sorted_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean isSorted = true; // Assume the array is sorted initially

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false; // If any element is greater than the next, array is not sorted
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted in ascending order");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
