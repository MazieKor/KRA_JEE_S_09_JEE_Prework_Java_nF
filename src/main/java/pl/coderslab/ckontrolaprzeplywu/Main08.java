package pl.coderslab.ckontrolaprzeplywu;

public class Main08 {

    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            String result = "";
            for(int j = 1; j <= n; j++) {
                if (j <= i) {
                    result += "* ";
                }
                else {
                    result = result + j + " ";
                }
            }
            System.out.println(result);
        }

        /* Inny sposób na osiągnięcie tego samego wyniku
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= n; j++) {
                if (j == n) {
                    System.out.println();
                }
                else if (j <= i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(j + 1 + " ");
                }

            }
        }  */

    }
}
