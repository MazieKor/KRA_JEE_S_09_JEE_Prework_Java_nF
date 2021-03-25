package pl.coderslab.dtablice;

public class Main07 {

	public static void main(String[] args) {
		double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};
		for(int i = 0; i < temps.length; i++) {
			temps[i] = temps[i] * 1.8 +32;
		}
		double sum = 0;
		double avg;
		for(int i = 0; i < temps.length; i++) {
			sum += temps[i];
		}
		avg = sum / temps.length;
		String result = String.format("%.2f", avg);
		System.out.println("SREDNIA: " + avg);
		System.out.println("SREDNIA SKRÓCONA: " + result);  //polecana w preworku metoda zaokrąglenia wywołuje błąd
															//w teście (jesli użyć tylko niej do podania wyniku)
	}


}
