public class InsertionSort {
		public static void insertionSort(int[] array) {
			int n = array.length;
			for (int i = 1; i <= n-1; i++) {
				int current = array[i];
				int previous = i-1;

//				Finding the correct position for insertion.
				while (previous >= 0 && array[previous] > current) {
					array[previous+1] = array[previous];
					previous--;
				}
//				Insertion
				array[previous+1] = current;
			}
		}

		public static void printArray(int[] array) {
            for (int j : array) {
                System.out.print(j + " ");
            }
		}

		public static void main(String[] sadoxer) {
			int[] array = {5, 4, 1, 3, 2};

			insertionSort(array);
			printArray(array);
		}
}
