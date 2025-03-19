public enum TypePassager {
    REGULIER(1.0),
    ETUDIANT(0.8),
    SENIOR(0.65),
    HANDICAPE(0.5);

    private final double coefficient;

    TypePassager(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }
}
