package lt.lhu.unit07.main;

public class Task0704 {

	public static void main(String[] args) {
		
			double[] subseq = new double[] {1.1, 2.2, 4.4, 8.8, 17.6, 35.2};
			
			int chek = 0;
			
			for (int i = 0; i < subseq.length; i++) {
				if(subseq[i] <= subseq[i ++]) {
					chek = chek + 0;
				}else {
					chek = chek + 1;
				}
			}
			
			if (chek == 0) {
				System.out.println("ascending sequence");
			}else {
				System.out.println("descending sequence");
			}
	}

}
