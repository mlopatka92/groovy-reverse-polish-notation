class Main {

    static void main(String[] args) {
        def examples = [
                [2, 3, '+', 5, '*'], 25,
                [2, 7, '+', 3, '/', 14, 3, '-', 4, '*', '+', 2, '/'], 23.5
        ]

        def service = new ReversePolishNotationServiceImpl();
        def execution = 0..3
        execution.findAll {it % 2 == 0 }
                .each {it ->
                    def result = service.calculate(examples[it as int] as List);
                    println("First example: $result")
                    assert result == examples[it + 1]
                }
    }
}
