package pl.coderslab.eparametrystartowe;

public class Main04 {

    public static void main(String[] args) {
        int prawLiczbArg = 3;
        if(args.length != prawLiczbArg){
            System.out.println("Błąd - proszę podaj dokładnie 3 boki");
        }
        else if (Integer.parseInt(args[0]) + Integer.parseInt(args[1]) > Integer.parseInt(args[2]) &&
                Integer.parseInt(args[0]) + Integer.parseInt(args[2]) > Integer.parseInt(args[1]) &&
                Integer.parseInt(args[1]) + Integer.parseInt(args[2]) > Integer.parseInt(args[0])
                ) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }

}
