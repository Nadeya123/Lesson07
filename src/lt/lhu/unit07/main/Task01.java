package lt.lhu.unit07.main;

import java.util.Random;

public class Task01 {

	public static void main(String[] args) {

			int n = 20;
			int [] mas = new int[n];
			int sum = 0;
			int remainder = 3;
			
			Random rand = new Random();
			for(int i = 0;i < mas.length; ++i) {
				mas[i] = rand.nextInt();
			}
			
			for(int i = 0; i < mas.length; i++) {
				if(i % remainder == 0) {
					System.out.printf("[%4d] ", mas[i]);
					sum = sum + mas[i];
				}else {
					System.out.printf("[%4d] ", mas[i]);
				}
			}
		System.out.print("\n Sum of all multiples of an array > " + sum);
	}

}
