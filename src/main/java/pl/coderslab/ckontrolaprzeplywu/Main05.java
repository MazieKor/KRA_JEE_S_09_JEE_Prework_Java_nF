package pl.coderslab.ckontrolaprzeplywu;

public class Main05 {

	public static void main(String[] args) {
		int resultFor = 0;
		int resultWhile = 0;
		int i = 0;
		while (i < 11) {
			resultWhile = resultWhile + i;
			i++;
		}
		System.out.println(resultWhile);
		for (int j = 0; j < 11; j++) {
			resultFor = resultFor + j;
		}
		System.out.println(resultFor);

	}

}
