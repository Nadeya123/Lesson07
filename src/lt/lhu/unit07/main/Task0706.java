package lt.lhu.unit07.main;

import java.util.Random;

public class Task0706 {

	public static void main(String[] args) {
		int n = 10;
		double[] mas = new double[n];
		
		double min;
		double max;
		double shortestLength;
		
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble();
		}
		System.out.println("Source array >");
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%4.8f]", mas[i]);
		}
		
		min = mas[0];
		for (int i = 1; i < mas.length; i++) {
			if(mas[i] < min) {
				min = mas[i];
			}
		}
		System.out.println();
		System.out.println("The minimum value of the array > " + min);
		max = mas[0];
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
			}
		}
		System.out.println("The maximum value of the array > " + max);
		shortestLength = max - min;
		System.out.println("The shortest length > " + shortestLength);
	}

}
