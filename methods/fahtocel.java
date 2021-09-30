import java.lang.Math;
import java.util.Scanner;

public class fahtocel {
    public static void main(String args[]) {

        Scanner inp = new Scanner(System.in);

        double num = 0;
        System.out.print("Enter a temperature in Fahrenheit to convert into Celcius: ");

        try {

            num = inp.nextDouble();

        } catch (Exception ex) {

            System.out.println("Input is not a number");
            System.exit(0);
        }

        inp.close();

        converter caller = new converter();

        double cel = caller.tocel(num);

        System.out.println(num + "°F in Celsius is " + Math.round(cel) + "°C");

    }
}

class converter {
    double tocel(Double fah) {

        double cel = ((fah - 32) * 5) / 9;

        return cel;
    }
}