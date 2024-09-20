package array;

import java.util.Arrays;

public class sortarray {

	public static void main(String[] args) {
		int[] array = new int[] { 2, 20, 54, 30 };
		Arrays.sort(array); // using pre-defined method

		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");

	}

}