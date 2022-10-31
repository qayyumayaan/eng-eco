public class RetirementCalculatorLib {

    public static double FP(double P, int N, double i) {
        // F/P
        double F = P * Math.pow(1 + i, N);
        return F;
    }

    public static double PF(double F, int N, double i) {
        // P/F
        double P = F / Math.pow(1 + i, N);
        return P;
    }

    public static double FA(double A, int N, double i) {
        // F/A
        double F = A / i * (Math.pow(1 + i, N) - 1);
        return F;
    }

    public static double PA(double A, int N, double i) {
        // P/A
        double intRate = Math.pow(1 + i, N);
        double P = A * (intRate - 1) / (i * intRate);
        return P;
    }

    public static double AF(double F, int N, double i) {
        // A/F
        double intRate = Math.pow(1 + i, N);
        double A = i / (intRate - 1);
        return A;
    }

    public static double AP(double P, int N, double i) {
        // A/P
        double intRate = Math.pow(1 + i, N);
        double A = i * intRate / (intRate - 1);
        return A;
    }

    public static double PG(double G, int N, double i) {
        // P/G
        double intRate = Math.pow(1 + i, N);
        double P = ((intRate - 1) / (i * intRate) - N / intRate) / i;
        return P;
    }

    public static double AG(double G, int N, double i) {
        // A/G
        double intRate = Math.pow(1 + i, N);
        double A = G * (1 / i - N / (intRate - 1));
        return A;
    }

    public static double PAG(double G, int N, double i, double A) {
        // Uniform Arithmetic Gradient
        double P = PA(A, N, i) + PG(G, N, i);
        return P;
    }

    public static double PGGeo(double A, int N, double i, double f) {
        // Geometric Gradient Series
        double P = 0;
        if (f == i) {
            P = PF(A * N, N, i);
        } else if (f != i) {
            P = A * Math.abs(((1 - Math.pow((1 + i), -N) * Math.pow(1 + f, N)) / (i - f)));
        }
        return P;
    }
}
