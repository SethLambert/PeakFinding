package twoDimensional;

import java.util.Random;

public class Find {
	public static void main(String args[]){
		
		int h = 10, w = 10;
		int a[][] = randomArray(100, h, w);
		arrayPrint2D(a, h, w);
		
	}

	private static int[][] randomArray(int max, int height, int width) {
		Random rand = new Random();
		int a[][] = new int[height][width];
		for(int i = 0; i<height; i++){
			for(int j = 0; j<width; j++){
				int num = rand.nextInt(max+1);
				a[i][j] = num;
			}
		}
		return a;
	}// end randomArray
	
	public static void arrayPrint2D(int a[][], int height, int width){
			for(int i = 0; i<height; i++){
				for(int j = 0; j<width; j++){
					System.out.print(a[i][j] + " ");
				}
			System.out.print("\n");
		}
	}// end arrayPrint2D
}
