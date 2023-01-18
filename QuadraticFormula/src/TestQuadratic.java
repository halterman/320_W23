import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;

class TestQuadratic {
    QuadraticFormulaImplementation quad = new QuadraticFormulaImplementation();
    
    @Test
    void test2_8_4() {
        Optional<double[]> soln = quad.quadratic(2, 8, 4);
        double[] ans = soln.get();
        double[] expected = {-0.5857864376269049, -3.414213562373095};
        assertArrayEquals(expected, ans, 0.0001);
    }

}
