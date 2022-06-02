package best.nquantum;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Type in number as scientific notation (ex. 1.59812e+68): ");
        Scanner scan = new Scanner(System.in);
        final String input = scan.next();
        final String part1 = input.split("e+")[0];
        final String part2 = input.split("e+")[1];
        final BigInteger numba = new BigInteger("10");
        double powered = numba.pow(Integer.parseInt(part2)).doubleValue();
        int result = (int) Math.round(powered * Double.parseDouble(part1));
        System.out.println(new BigInteger(String.valueOf(result)));
    }
}
