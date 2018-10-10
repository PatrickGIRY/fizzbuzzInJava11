package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzShould {

    @Test
    void print_string_1_when_the_given_integer_is_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String print = fizzBuzz.print(1);

        assertThat(print).isEqualTo("1");
    }

    @Test
    void print_string_2_when_the_given_integer_is_2() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String print = fizzBuzz.print(2);

        assertThat(print).isEqualTo("2");
    }
}
