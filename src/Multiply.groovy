class Multiply implements Operator {

    @Override
    boolean markMatch(String operator) {
        return '*'.equals(operator)
    }

    @Override
    float calculate(float val1, float val2) {
        return val1 * val2
    }
}
