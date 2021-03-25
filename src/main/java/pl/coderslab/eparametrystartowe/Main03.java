package pl.coderslab.eparametrystartowe;

public class Main03 {
    public static void main(String[] args) {
        double sum = 0;
        double avg;
        for(int i = 0; i < args.length; i++){
            sum = sum + Integer.parseInt(args[i]);
        }
        avg = sum / args.length;
        System.out.println(avg);
        //System.out.println("SUMA PARAMETRÓW STARTOWYCH: " + sum);  <- zakomentowano ze względu na błędy w teście
        //System.out.println("SREDNIA PARAMETRÓW STARTOWYCH: " + avg);

    }
}
