
public class Pattren5V2 {
	public static void main(String[] args) {
		/*
		 * 1 0 1 1 0 1 0 1 0 1
		 */
		int v = 0;
		for (int r = 1; r <= 4; r++) {
			for (int c = 1; c <= r; c++) {
				if ((r + c) % 2 == 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			} // c
			System.out.println();
		} // r
	}

}
