
public class Selection {

	
	public static void main(String[] args) {
		System.out.println("This is Selection Sorting");

		int a[] = { 18, 9, 33, 4, 84, 32 };
		int b = 0;
		 for (int i =0; i < a.length; i++){
			 for(int j =i ; j < a.length; j++){
					if (a[i] < a[j]) {
						b = a[i];
						a[j] = b;

					}
		
				}
			 
			 }
		 }
	}

