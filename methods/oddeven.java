import java.util.Scanner;

public class oddeven {
    public static void main(String args[]) {

        Scanner inp = new Scanner(System.in);

        int num = 0;
        System.out.print("Enter an number to check odd or even: ");

        try {

            num = inp.nextInt();

        } catch (Exception ex) {

            System.out.println("Input is not a number");
            System.exit(0);
        }

        inp.close();

        checker caller = new checker();

        String answer = caller.oddorev(num);

        System.out.println(answer);

    }
}

class checker {
    String oddorev(int n) {

        String ans;

        if (n % 2 == 0)
            ans = n + " is an even number";
        else
            ans = n + " is an odd number";

        return ans;
    }
}