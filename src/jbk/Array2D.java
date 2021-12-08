package jbk;

public class Array2D {
	public static void main(String[] args) {
		int sum = 0;
		int[][] a = { { 10, 20, 30 }, { 40, 50, 60 }, { 30, 40, 60 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==============================");
		for (int i = 0; i < 3; i++) {
			sum = 0;
			for (int j = 0; j < 3; j++) {
				sum = sum + a[i][j];
			}
			System.out.println("Sum of" + (i + 1) + " row is " + sum);
		}
		System.out.println("================================");
		for (int j = 0; j < 3; j++) {
			sum = 0;
			for (int i = 0; i < 3; i++) {
				sum = sum + a[i][j];
			}
			System.out.println("Sum of" + (j + 1) + " column is " + sum);
		}
		System.out.println("=============================");
		sum =0;
		for (int i = 0; i < 3; i++){
		
            for (int j = 0; j < 3; j++) 
			{
				if (i == j)
					sum = sum + a[i][j];
			}
		}
		System.out.println("Sum of dignoal elements is " + sum);
	System.out.println("=============================");
	sum =0;
	for (int i = 3; i >0; i--){
	
        for (int j = 0; j < 3; j++) 
		{
			if (i == j)
				sum = sum + a[i][j];
		}
	}
	System.out.println("Sum of dignoal elements is " + sum);
	System.out.println("=============================");
	sum =0;
	for (int i = 0; i < 3; i++){
	
        for (int j = 3; j > 0; j--) 
		{
        if (i == j)
		sum = sum + a[i][j];
		}
	}
	System.out.println("Sum of upper triangle elements is " + sum);
	
	}
		
}