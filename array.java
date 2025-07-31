package array;

public class array {

	public static void main(String[] args) {
		
		int[] arr = {99, 45, 7, 89, 23, 56};

        int min = arr[0]; 

        for (int i = 1; i <arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum element in the array: " + min);
    }
}
