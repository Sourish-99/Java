import java.util.*;

public class eligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Students to take input from: ");
        int stu = 0;

        try {
            stu = sc.nextInt();

        } catch (Exception ex) {
            System.out.println("Input is not a number");
        }

        core caller = new core();

        String[] array = new String[stu];

        for (int i = 0; i < stu; i++) {

            array[i] = caller.analyze();

        }

        for (int i = 0; i < stu; i++) {

            System.out.println(array[i]);

        }
    }
}

class core {
    String analyze() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Candidate name:");
        String caname = scan.nextLine();
        System.out.print("Enter Marks for " + caname + " in Math:");
        int mathMarks = scan.nextInt();
        System.out.print("Enter Marks " + caname + " in Physics:");
        int phyMarks = scan.nextInt();
        System.out.print("Enter Marks " + caname + " in Chemistry:");
        int chemMarks = scan.nextInt();
        System.out.println("---------------------------------------------");
        Boolean iseligible = false;

        if (mathMarks >= 60) {
            if (phyMarks >= 50) {
                if (chemMarks >= 40) {
                    if ((mathMarks + phyMarks + chemMarks >= 200) || (mathMarks + phyMarks >= 150)) {
                        iseligible = true;
                    }
                }
            }
        }

        return iseligible ? caname + " is eligible" : caname + " is not eligible";
    }
}
