package math;

import java.util.ArrayList;

public class Factorizer {

    public ArrayList<Integer> primeFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();

        if (number <= 1) {
            return factors;
        }

        int divisor = 2;

        while (number > 1) {
            while (number % divisor == 0) {
                factors.add(divisor);
                number /= divisor;
            }
            divisor++;
        }

        return factors;
    }
}