package jbk;

import java.util.Arrays;

public class MissingElement {
public static void main(String[] args) {
	int[] a = {1,2,4,6,8,10};
	Arrays.sort(a);
	System.out.println("sorted Array is " + a);
	int temp;
	for(int i = 0; i<a.length-1; i++)
	{
         temp=a[i]+1;
         while(temp<a[i+1])
         {
        	 System.out.println(temp + " ");
        	 temp= temp+1;
         }
	}
}
}
