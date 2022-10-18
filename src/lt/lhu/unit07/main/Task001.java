package lt.lhu.unit07.main;

import java.util.Random;

public class Task001 {

	public static void main(String[] args) {
		
			int[] ar = new int[10];
			Random rand = new Random();
			
			for (int i = 0; i < ar.length; i++) {
				ar[i] = rand.nextInt(1000);
			}
			for (int i = 0; i < ar.length; i++) {
				System.out.printf("%4d ", ar[i]);
			}
				System.out.println();
			///////////////////////////////////////////////
			int min, temp;
			for (int i = 0; i < ar.length - 1; i++) {
				min = i;
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[j] > ar[min]) {
					min = j;
				}
			}
			temp = ar[i];
			ar[i] = ar[min];
			ar[min] = temp;
			}
			///////////////////////////////////////////////
			for (int i = 0; ar.length > i; i++) {
				System.out.printf("%4d ", ar[i]);
			}
				System.out.println();
			}
}

