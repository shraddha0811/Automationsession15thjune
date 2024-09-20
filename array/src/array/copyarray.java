package array;

public class copyarray {
	 
 public void CopyArray() {
 
	  int [] arr1= new int[] {60,20,50}; // declaring array 1
	  
	  int [] arr2=new int [arr1.length]; // declaring array 2
	  
	  for(int i=0; i<arr1.length;i++) 
	  {
		  arr2[i]=arr1[i];   // Assigning array 2 to array 1
		  
	  }
	  
	  System.out.println("Elements of array 1 "); 
			
		for(int i=0; i<arr1.length; i++) {   // for displaying array 1
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		 
		System.out.println("Elements of array 2 "); // for displaying array 2
			
			for(int i=0; i<arr1.length; i++) {
				
				System.out.print(arr2[i]+" ");
			}}
	

	public static void main(String[] args) {
 
		copyarray ref=new copyarray();
		ref.CopyArray();
	
		
	}

}
