package jbk;

public class ArrayMUltipication {
	public static void main(String[] args) {
		int sum = 0;
		int[] a = { 10, 20, 30, 40, 50 };
		System.out.print("Array is" + " ") ;
		for (int i = 0; i < 5; i++) {
			
			System.out.print( a[i] + " ");
		}
		System.out.println();
       int[] b = {50 , 40, 30, 20, 10 };
       System.out.print("Array is" + " ") ; 
     for(int j = 0; j < 5; j++)
	{
		System.out.print(b[j] + " ");
	}
     System.out.println();
	for (int i = 0; i < 5; i++) 
	{
		for(int j = 0; j < 5; j++)	
		{
			sum =  sum + a[i]*b[j];
		}
		System.out.println("sum of Array "+ sum + " ");
}
	System.out.println();
	}
}