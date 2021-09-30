import java.util.Scanner;

public class fahtocel {
    public static void main(String args[]) {

        Scanner inp = new Scanner(System.in);

        double fah = 0;
        System.out.print("Enter a temperature in Fahrenheit to convert into Celcius: ");

        try {

            fah = inp.nextDouble();

        } catch (Exception ex) {

            System.out.println("Input is not a number");
            System.exit(0);
        }

        inp.close();

        double cel = ((fah - 32) * 5) / 9;

        System.out.println(fah + "°F in Celsius is " + cel + "°C");
    }
}