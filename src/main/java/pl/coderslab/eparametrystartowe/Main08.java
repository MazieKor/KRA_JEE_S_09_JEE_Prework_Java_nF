package pl.coderslab.eparametrystartowe;

public class Main08 {

    public static void main(String[] args) {
        double x = Integer.parseInt(args[0]);
        double y = Integer.parseInt(args[1]);
        double min;
        double max[] = new double[10000];
        int a = 0;
        if (x > y) {
            min = y;
            max[a] = x;
        }
        else {
            min = x;
            max[a] = y;
        }
        while (max[a] % min > 0) {
               max[a+1] = min;
               min = max[a] % min;
               a++;
        }
        System.out.println(x + " i " + y + ": " + min);



    }

}
