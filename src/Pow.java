//implement pow(x, n) [x raised to the n power]
public class Pow {
    public static double myPow(double x, int n) {
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        double dub = 1.3;
        int myInt = 3;
        System.out.println(myPow(dub, myInt));
    }
}
