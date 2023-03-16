package Day4DSA;

public class PrintAllPairDifferenceK {
	public static void findPairDiffOfK(int[] array, int k) {
		int diff = 0;
		int j = 0;
		int p = 0;

		for (int i = 0; i < array.length; i++) {
			for (j = i; j < array.length; j++) {
				

				diff = array[j] - array[i];
				while (j < array.length - 1 && array[i] == array[i+1]) {
	                i++;
	            }

				
					if (diff == k) {
						System.out.println(array[i] + " " + array[j]);
						break;
					}
				}
		
			
		}
	}

	public static void main(String[] args) {

		int[] array = { 1, 5, 2, 2, 2, 5, 5, 4 };
		int k = 3;
		findPairDiffOfK(array, k);
	}

}
