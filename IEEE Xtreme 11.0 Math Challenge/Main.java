package MathChallenge;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = in.nextInt();

        while (t >= 1) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            t--;
            sb.append(solve(a,b,c)).append("\n");
        }

        System.out.println(sb);
    }

//    private static BigInteger solve(BigInteger a, BigInteger b, BigInteger c) {
//
//        return a.equals(BigInteger.valueOf(1))? BigInteger.valueOf(1):(Power(a , getFactorial(b).divide(getFactorial(c).multiply(getFactorial(b.subtract(c)))))).mod(BigInteger.valueOf(1000000007));
//
//    }

    private static BigInteger solve(int a, int b, int c) {

        return a==1 ? BigInteger.valueOf(1):
                (Power(BigInteger.valueOf(a) , getFactorial(b).divide(getFactorial(c).multiply(getFactorial(b-c))))).mod(BigInteger.valueOf(1000000007));

    }

    public static BigInteger Power(BigInteger a, BigInteger exponent) {
        if (exponent.equals(BigInteger.ONE)) return a;
        else if (exponent.equals(BigInteger.ZERO)) return BigInteger.ONE;
        else return a.multiply(Power(a, exponent.subtract(BigInteger.ONE)));
    }
//
//    private static BigInteger getFactorial(int n) {
//
//        return n.compareTo(BigInteger.valueOf(1)) == 1 ? n.multiply(getFactorial(n.subtract(BigInteger.valueOf(1)))) : BigInteger.valueOf(1);
//    }


    private static BigInteger getFactorial(int n) {

        return n>1 ? BigInteger.valueOf(n).multiply(getFactorial(n-1)) :
                BigInteger.valueOf(1);
    }
}

