



public  class Polynomial {
    double[] coefficients;
    public Polynomial() {
        coefficients = new double[1];
    }

    public Polynomial(double[] polynomials) {
        coefficients = new double[polynomials.length];
        for (int i = 0; i < polynomials.length; i++) {
            coefficients[i] = polynomials[i];
        }
    }
    public Polynomial add(Polynomial otherPoly) {
        int maxLength = Math.max(coefficients.length, otherPoly.coefficients.length);
        double [] newCoefficients = new double[maxLength];
        for (int i = 0; i < otherPoly.coefficients.length; i++) {
            newCoefficients[i] += otherPoly.coefficients[i];
        }
        for (int i =0; i < coefficients.length; i++) {
            newCoefficients[i] += coefficients[i];
        }

        return new Polynomial(newCoefficients);

    }
    public double evaluate(double x) {
        double res = 0;
        for (int i =0; i < coefficients.length; i++) {
            res += coefficients[i] * Math.pow(x, i);
        }
        System.out.println(res);
        return res;
    }
    public boolean hasRoot(double x) {
        double isRoot = evaluate(x);
        if (isRoot == 0.0) {
            return true;
        }
        return false;
    }
}