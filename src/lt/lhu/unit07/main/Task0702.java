package lt.lhu.unit07.main;

import java.util.Random;

public class Task0702 {
	
	public static void main(String[] args) {
			int[] mas = {2, 5, 0, 1, 0, 0, 8, 0, 7, 0};
			
			int countZero = 0;
			
			for (int i = 0; i < mas.length; i++) {
				if (mas[i] == 0) {
					countZero++;
				}
			}
			
			int[] zeroPositionsArray = new int[countZero];
			for (int i = 0, j = 0; i < mas.length; i++) {
				if (mas[i] == 0) {
					zeroPositionsArray[j++] = i;
				}
			}
			
			for (int i = 0; i < mas.length; i++) {
				System.out.printf("[%d]", mas[i]);
			}
			
			System.out.println();
			for (int i = 0; i < zeroPositionsArray.length; i++) {
				System.out.printf("{%d}", zeroPositionsArray[i]);
			}
	}
}
	
