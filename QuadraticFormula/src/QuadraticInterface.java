import java.util.Optional;

public interface QuadraticInterface {

    /**
     * Calculates the discriminant of ax^2 + bx +c.
     * @param a the coefficient of the x^2 term.
     * @param b the coefficient of the x term.
     * @param c the constant term.
     * @return the discriminant.
     */
    double discriminant(double a, double b, double c);

    /**
     * Calculates the roots of a quadratic equation using the 
     * quadratic formula, and if the answers exist,
     * returns the answers as a string array of of length 2. 
     * The first solution should be solution[0]=[-b + sqrt(b^2 - 4ac)]/2a,
     * while the second solution is solution[1]=[-b - sqrt(b^2 - 4ac)]/2a.
     * @param a the coefficient of the x^2 term.
     * @param b the coefficient of the x term.
     * @param c the constant term.
     * @return the solution set of the quadratic equation, if it exits;
     *         otherwise, returns nothing (empty Optional).
     */
    Optional<double[]> quadratic(double a, double b, double c);
}
