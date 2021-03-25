package pl.coderslab.eparametrystartowe;

public class Main05 {

    public static void main(String[] args) {
        int points = Integer.parseInt(args[0]);
        if(points > 100 || points < 0) {
            System.out.println("BADVALUE");
        }
        else if(points >= 0 && points <= 50) {
            System.out.println("F");
        }
        else if (points > 50 && points <= 70) {
            System.out.println("E");
        }
        else if (points > 70 && points <= 90) {
            System.out.println("C");
        }
        else {
            System.out.println("A");
        }
    }

}
