import java.util.Optional;

public class MainClass {

    public static void main(String[] args) {
        var quad = new QuadraticFormulaImplementation();
        Optional<double[]> soln = quad.quadratic(2, 8, 4);
        if (soln.isPresent()) {
            double[] ans = soln.get();
            System.out.println(ans[0] + "  " + ans[1]);
        } else {
            System.out.println("No solution");
        }
    }
}
