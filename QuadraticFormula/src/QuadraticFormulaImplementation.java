import java.util.Optional;

public class QuadraticFormulaImplementation implements QuadraticInterface {

    @Override
    public double discriminant(double a, double b, double c) {
        return b*b - 4*a*c;
    }

    @Override
    public Optional<double[]> quadratic(double a, double b, double c) {
        Optional<double[]> solution = Optional.empty();
        double disc = discriminant(a, b, c);
        if (a != 0 && disc >= 0) {
            double[] result = new double[2];
            result[0] = (-b - Math.sqrt(disc))/(2*a);
            result[1] = (-b + Math.sqrt(disc))/(2*a);
            solution = Optional.of(result);
        }
        
        return solution;
    }

}
