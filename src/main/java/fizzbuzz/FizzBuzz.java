package fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class FizzBuzz {
    private final Rule[] rules;

    FizzBuzz() {
        rules = new Rule[]{
                Rule.rule().isMultipleOf(3).thenReturn("Fizz").build(),
                Rule.rule().isMultipleOf(5).thenReturn("Buzz").build()
        };
    }

    String print(int n) {
        String result = Stream.of(rules)
                .filter(rule -> rule.isMultipleOf(n))
                .map(Rule::thenReturn)
                .collect(Collectors.joining());

        return result.isEmpty() ? String.valueOf(n) : result;
    }

    private static class Rule {
        private int multipleOf;
        private String thenReturn;

        private Rule(int multipleOf, String thenReturn) {
            this.multipleOf = multipleOf;
            this.thenReturn = thenReturn;
        }

        static Builder rule() {
            return new Builder();
        }

        boolean isMultipleOf(int n) {
            return n % multipleOf == 0;
        }

        String thenReturn() {
            return thenReturn;
        }

        private static class Builder {
            private int multipleOf;
            private String thenReturn;

            Builder isMultipleOf(int multipleOf) {
                this.multipleOf = multipleOf;
                return this;
            }

            Builder thenReturn(String thenReturn) {
                this.thenReturn = thenReturn;
                return this;
            }

            Rule build() {
                return new Rule(multipleOf, thenReturn);
            }
        }
    }
}
