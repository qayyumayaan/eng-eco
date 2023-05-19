public class RetireLib {

    public static double FP(double P, double i, int N) {
        // F/P
        double F = P * Math.pow(1 + i, N);
        return F;
    }

    public static double PF(double F, double i, int N) {
        // P/F
        double P = F / Math.pow(1 + i, N);
        return P;
    }

    public static double FA(double A, double i, int N) {
        // F/A
        double F = A / i * (Math.pow(1 + i, N) - 1);
        return F;
    }

    public static double PA(double A, double i, int N) {
        // P/A
        double intRate = Math.pow(1 + i, N);
        double P = A * (intRate - 1) / (i * intRate);
        return P;
    }

    public static double AF(double F, double i, int N) {
        // A/F
        double intRate = Math.pow(1 + i, N);
        double A = i / (intRate - 1);
        return A;
    }

    public static double AP(double P, double i, int N) {
        // A/P
        double intRate = Math.pow(1 + i, N);
        double A = i * intRate / (intRate - 1);
        return A;
    }

    public static double PG(double G, double i, int N) {
        // P/G
        double intRate = Math.pow(1 + i, N);
        double P = ((intRate - 1) / (i * intRate) - N / intRate) / i;
        return P;
    }

    public static double AG(double G, double i, int N) {
        // A/G
        double intRate = Math.pow(1 + i, N);
        double A = G * (1 / i - N / (intRate - 1));
        return A;
    }

    public static double PAG(double A, double G, double i, int N) {
        // Uniform Arithmetic Gradient
        double P = PA(A, i, N) + PG(G, i, N);
        return P;
    }

    public static double PGGeo(double A, double i, int N, double f) {
        // Geometric Gradient Series
        double P = 0;
        if (f == i) {
            P = PF(A * N, i, N);
        } else if (f != i) {
            P = A * Math.abs(((1 - Math.pow((1 + i), -N) * Math.pow(1 + f, N)) / (i - f)));
        }
        return P;
    }
}
