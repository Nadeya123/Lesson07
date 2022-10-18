package lt.lhu.unit07.main;

import java.util.Random;

public class Task0703 {

	public static void main(String[] args) {
		int n = 10;
		int[] mas = new int[n];
		
		int first;
		
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt();
		}
		
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%4d]", mas[i]);
			}
		
		first = mas[0];
		for(int i = 1; i < mas.length - 9; i++);{
			if(mas[0] < 0) {
				System.out.println("\n negative first >" + first);
			}else {
				System.out.println("\n positive first >" + first);
			}
		}
	}
}