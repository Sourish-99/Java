import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {

        Scanner inp = new Scanner(System.in);

        int num = 0;
        System.out.print("Enter an number to get its factorial: ");

        try {

            num = inp.nextInt();

        } catch (Exception ex) {

            System.out.println("Input is not a number");
            System.exit(0);
        }

        inp.close();

        checker caller = new checker();

        int ans = caller.factfinder(num);

        System.out.println("Factorial of " + num + " is: " + ans);
    }
}

class checker {
    int factfinder(int n) {

        int i, fact = 1;

        for (i = 1; i <= n; i++) {

            fact = fact * i;
        }

        return fact;
    }
}