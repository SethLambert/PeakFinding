package oneDimensional;

import java.util.Random;

public class Find {

public static void main(String args[]){
	
	//int a[] = randomArray(10, 20);
	int a[] = {9, 9, 11, 15, 0, 0, 11, 11, 6, 0};
	System.out.println("Hey guy, here's an array: ");
	arrayPrint(a);
	
	int peakIndex = findIndex(a);
	System.out.println("The number at index " + peakIndex + 
			" is a peak. (value: " + a[peakIndex] + ")");
}

private static int findIndex(int[] a) {
	int n = a.length;
	if (a[n/2] >= a[n/2-1] && a[n/2] >= a[n/2+1]){
		return n/2;
	}
	if (a[n/2] <= a[n/2 -1] && a[n/2-1] >= a[n/2 + 1]){
		// create LHS copy
		int sizeB;
		if(a.length/2%2 == 0){
			sizeB = a.length/2;
		}else{
			sizeB = a.length/2 + 1;
		}
		int b[] = new int[sizeB]; 
		for(int i = 0; i<b.length; i++){
			b[i] = a[i];
		}
		arrayPrint(b);
		return findIndex(b);
	} else if (a[n/2] <= a[n/2 + 1] && a[n/2+1] >= a[n/2 - 1]) {
		// create RHS copy
		int sizeC;
		if(a.length/2%2 == 0){
			sizeC = a.length/2;
		}else{
			sizeC = a.length/2 + 1;
		}
		int c[] = new int[sizeC]; // create RHS copy
		int j = a.length - sizeC;
		for(int i = sizeC; i>=0; i--){
			c[i] = a[i+j];
		}
		arrayPrint(c);
		return findIndex(c);
	} else {
		return n/2;
	}
 	
}

public static int[] randomArray(int size, int max){
	Random rand = new Random();
	int a[] = new int[size];
	for(int i = 0; i<a.length; i++){
		int num = rand.nextInt(max);
		a[i] = num;
	}
	return a;
}

public static void arrayPrint(int a[]){
	for(int i = 0; i < a.length; i++){
		System.out.print(a[i] + ", ");
	}
	System.out.print("\n");
}

}