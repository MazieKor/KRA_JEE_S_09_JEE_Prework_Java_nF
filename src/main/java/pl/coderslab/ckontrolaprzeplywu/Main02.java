package pl.coderslab.ckontrolaprzeplywu;

public class Main02 {

	public static void main(String[] args) {
		byte nr1 = 3;
		byte nr2 = 7;
		byte nr3 = 11;
		if (nr1 > nr2 && nr1 > nr3) {
			System.out.println("Największa z liczb to " + nr1);
		}
		else if (nr2 > nr1 && nr2 > nr3) {
			System.out.println("Największa z liczb to " + nr2);
		}
		else {
			System.out.println("Największa z liczb to " + nr3);
		}

	}

}
