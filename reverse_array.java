package array;

public class reverse_array {

	public static void main(String[] args) {
		int[] arr = {19, 20, 33, 45, 59};

        int start = 0;
        int end = arr.length - 1;
        
        System.out.print("original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.print("\nReversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


