package com.bilgeadam;

public class FindMax {
	public static int findMax(int array[]) {
		int max =array[0] ;
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		return max;
		
	}
}



