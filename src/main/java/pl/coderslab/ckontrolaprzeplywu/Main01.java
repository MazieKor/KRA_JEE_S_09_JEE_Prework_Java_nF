package pl.coderslab.ckontrolaprzeplywu;

public class Main01 {

    public static void main(String[] args) {
        int nr1 = 3;
        int nr2 = 7;
        if (nr1 > nr2) {
            System.out.println("Większa liczba to " + nr1);
        }
        else if (nr2 > nr1) {
            System.out.println("Większa liczba to " + nr2);
        }
        else {
            System.out.println("Liczby są sobie równe");
        }
    }

}
