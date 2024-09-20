package array;

public class Example3 {

	public static void main(String[] args) {

		int[] array = new int[3];
		int[] array2 = new int[3];

		array[0] = 30;
		array[1] = 50;
		array[2] = 10;
		
		array2[0] = 50;
		array2[1] = 80;
		array2[2] = 60;
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}
		
	

		for (int i = 0; i < array2.length; i++) {

			System.out.print(array2[i] + " ");
		}

	}
}
