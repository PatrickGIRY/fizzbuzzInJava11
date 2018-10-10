package fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzShould {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void print_string_1_when_the_given_integer_is_1() {

        String print = fizzBuzz.print(1);

        assertThat(print).isEqualTo("1");
    }

    @Test
    void print_string_2_when_the_given_integer_is_2() {

        String print = fizzBuzz.print(2);

        assertThat(print).isEqualTo("2");
    }

    @Test
    void print_string_Fizz_when_the_given_integer_is_3() {

        String print = fizzBuzz.print(3);

        assertThat(print).isEqualTo("Fizz");
    }
}
