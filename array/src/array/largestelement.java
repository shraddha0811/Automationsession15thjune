package array;

public class largestelement {

	public static void main(String[] args) {
		int[] arr = new int []{ 208, 78, 10, 108 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println(max);

	}
}
