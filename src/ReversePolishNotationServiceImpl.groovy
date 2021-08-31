class ReversePolishNotationServiceImpl {

    def operators = [new Sum(), new Substract(), new Multiply(), new Divide()]
    def stack = new Stack();

    def calculate(List notationValue) {
        for (value in notationValue) {
            if (value instanceof Number) {
                stack.push(value)
            } else {
                def operator = operators.findAll{it.markMatch(value as String)}.first()
                def val2 = stack.pop()
                def val1 = stack.pop()
                stack.push(operator.calculate(val1 as float, val2 as float))
            }
        }

        return stack.pop();
    }
}
