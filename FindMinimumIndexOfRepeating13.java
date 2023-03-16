package Day4DSA;

public class FindMinimumIndexOfRepeating13 {
	
	public static void findIndexOfMin(int[] array) {
		int minIndex = 0;
		int maxIndex = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + i; j < array.length; j++) {
				if (array[i] == array[j]) {
					if (minIndex <= 0) {

						minIndex = i;
					}
					//

				}

			}
		}
		System.out.println("minimum index of repeated element " + minIndex);
	}

	public static void main(String[] args) {

		int[] array = { 5, 6, 3, 4, 3, 6, 4 };
		findIndexOfMin(array);
	}

}
