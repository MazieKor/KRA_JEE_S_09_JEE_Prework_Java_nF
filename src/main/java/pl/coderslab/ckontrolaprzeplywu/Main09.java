package pl.coderslab.ckontrolaprzeplywu;

public class Main09 {

    public static void main(String[] args) {
        int n = 5;
        // Rozwiązanie za pomocą pętli zależnej:
        for(int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();  //dodane w celu zrobienia odstępu od drugiego rozwiązania

        // Rozwiązanie za pomocą pętli niezależnej (?):
        for(int i = 0; i < n; i++) {
            String row = "";
            for(int j = 0; j < n; j++) {
                if (j <= i) {
                    row = row + "* ";
                }
                else {
                    break;
                }
            }
                System.out.println(row);

        }
    }
}
