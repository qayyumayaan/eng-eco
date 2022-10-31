public class RetirementCalculator {
    public static void main(String[] args) {

        String[] order = {
                "F/P",
                "P/F",
                "F/A",
                "P/A",
                "A/F",
                "A/P",
                "P/G",
                "A/G",
                "Present Arithmetic Gradient (P/A and P/G)",
                "Present Geometric Gradient"
        };

        double P = 0;
        double F = 0;
        double i = 0;
        double A = 0;
        int N = 0;
        double G = 0;
        double f = 0;
        double output = 0;
        System.out.println(f % .2f);

        boolean cont = true;
        while (cont == true) {

            StdOut.println("What would you like to calculate today?");

            for (int j = 0; j < 10; j++) {
                StdOut.println(j + ": " + order[j]);
            }
            StdOut.println("10: End the program. ");

            int response = StdIn.readInt();
            if (response == 10) {
                StdOut.println("Thank you for using this program!");
                cont = false;
                break;
            } else if (response == 0) { // F/P
                StdOut.print("Please input P. ");
                P = StdIn.readDouble();
                StdOut.print("Please input i as a decimal. ");
                i = StdIn.readDouble();
                StdOut.print("Please input N. ");
                N = StdIn.readInt();
                output = RetireLib.FP(P, i, N);

            } else if (response == 1) { // P/F
                StdOut.print("Please input F. ");
                F = StdIn.readDouble();
                StdOut.print("Please input i as a decimal. ");
                i = StdIn.readDouble();
                StdOut.print("Please input N. ");
                N = StdIn.readInt();
                output = RetireLib.PF(F, i, N);

            } else if (response == 2) { // F/A
                StdOut.print("Please input A. ");
                A = StdIn.readDouble();
                StdOut.print("Please input i as a decimal. ");
                i = StdIn.readDouble();
                StdOut.print("Please input N. ");
                N = StdIn.readInt();
                output = RetireLib.FA(A, i, N);

            } else if (response == 3) { // P/A
                StdOut.print("Please input A. ");
                A = StdIn.readDouble();
                StdOut.print("Please input i as a decimal. ");
                i = StdIn.readDouble();
                StdOut.print("Please input N. ");
                N = StdIn.readInt();
                output = RetireLib.PA(A, i, N);

            } else if (response == 4) { // A/F
                StdOut.print("Please input F. ");
                F = StdIn.readDouble();
                StdOut.print("Please input i as a decimal. ");
                i = StdIn.readDouble();
                StdOut.print("Please input N. ");
                N = StdIn.readInt();
                output = RetireLib.AF(F, i, N);

            } else if (response == 5) { // AP

            } else if (response == 6) { // PG

            } else if (response == 8) { // AG

            } else if (response == 9) { // PAG

            } else if (response == 10) { // PGGeo

            } else {
                StdOut.println("Invalid input. Please try again. ");
            }

        }

    }
}
