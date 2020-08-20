package pl.coderslab.ckontrolaprzeplywu;

public class Main06 {

	public static void main(String[] args) {
		int n = 6;
		int i = 0;
		while (n >= i) {
			System.out.print(i);
			if (i % 2 == 0) {
				System.out.println(" - parzysta");
			}
			else {
				System.out.println(" - nieparzysta");
			}
			i++;
		}
		for (int j = 0; n >= j; j++) {
			System.out.print(j);
			if (j % 2 == 0) {
				System.out.println(" - parzysta");
			}
			else {
				System.out.println(" - nieparzysta");
			}
		}
	}

}
