package array;

public class Reversearray {
	
	
	public  void getReversedarray() {
    int[] arr = new int[] { 1, 2, 3, 4, 5,};   // define & declare array
		
		System.out.println("print original array"); //here printing original array

		for (int i = 0; i < arr.length; i++) { //i=0 i<5 then it will print arr[0] i.e 1 
			                                   //then i++ 
			                                   //i=1 i<5 then it will print arr[1] i.e 2
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("print array in reverse order ");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}	
		
	
	}

	public static void main(String[] args) {
		Reversearray ref =new Reversearray();
		ref.getReversedarray();
	}

}
