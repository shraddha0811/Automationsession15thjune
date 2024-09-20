package array;

public class FrequencyofElement {

	public void GetfrequencyofArreay() {
		int[] arr = new int[] { 10, 20, 10, 60, 10, 20, 60, 20, 10 };
		int[] freq = new int[arr.length];
		int visited = -1;
		for (int i = 0; i < arr.length; i++) {

			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					freq[j] = visited;
				}
			}

			if (freq[i] != visited)
				freq[i] = count;
		}

		// Displays the frequency of each element present in array
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != visited)
				System.out.println("Freqency of  " + arr[i] + "   :   " + freq[i]);
		}
	}

	public static void main(String[] args) {

		FrequencyofElement ref = new FrequencyofElement();
		ref.GetfrequencyofArreay();

	}

}
