package lt.lhu.unit07.main;

public class Task0705 {

	public static void main(String[] args) {
		int[] mas = new int[] {1, 2, 3, 4, 5};
		
		int evenAr = 0;
		
		for (int i = 0; i < mas.length; i++) {
			if(mas[i] % 2 == 0) {
				evenAr++;
			}
		}
		
		int[] evenPosition = new int[evenAr];
		for (int i = 0, j = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				evenPosition[j++] = mas[i];
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%d]", mas[i]);
		}
		
		System.out.println();
		for (int i = 0; i < evenPosition.length; i++) {
			System.out.printf("{%d}", evenPosition[i]);
		}
	}

}
