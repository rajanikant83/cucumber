import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bubble {

	public static void main(String[] args) {
		System.out.println("This is Bubble Sorting");

		int a[] = { 18, 9, 33, 4, 84, 32 };
		int b = 0;

		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i] + " ");
			for (int j = i+ 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					b = a[i];
					a[i] = a[j];
					a[j] = b;

				}
				
			}	

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}


}
