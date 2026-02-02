package math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class FactorizerTest {

    @Test
    void testZeroReturnsEmptyList() {
        Factorizer factorizer = new Factorizer();
        assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(0));
    }

    @Test
    void testOneReturnsEmptyList() {
        Factorizer factorizer = new Factorizer();
        assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(1));
    }

    @Test
    void testPrimeNumber() {
        Factorizer factorizer = new Factorizer();
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(17);
        assertEquals(expected, factorizer.primeFactors(17));
    }

    @Test
    void testCompositeNumber() {
        Factorizer factorizer = new Factorizer();
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        expected.add(5);
        expected.add(5);
        assertEquals(expected, factorizer.primeFactors(100));
    }

    @Test
    void testAnotherCompositeNumber() {
        Factorizer factorizer = new Factorizer();
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(3);
        assertEquals(expected, factorizer.primeFactors(9));
    }
}