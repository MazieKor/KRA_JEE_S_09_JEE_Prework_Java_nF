package pl.coderslab.eparametrystartowe;

public class Main06 {

    public static void main(String[] args) {
        int points = Integer.parseInt(args[0]);
        int i = 1;
        while (i <= points){
            for (int j = 1; j <= points; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        System.out.println();
        i = i + 1;
        }

    }

}
