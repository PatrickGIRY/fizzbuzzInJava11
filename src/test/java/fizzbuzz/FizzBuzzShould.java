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

    @Test
    void print_string_Fizz_when_the_given_integer_is_6() {

        String print = fizzBuzz.print(6);

        assertThat(print).isEqualTo("Fizz");
    }

    @Test
    void print_string_Buzz_when_the_given_integer_is_5() {

        String print = fizzBuzz.print(5);

        assertThat(print).isEqualTo("Buzz");
    }

    @Test
    void print_string_Buzz_when_the_given_integer_is_10() {

        String print = fizzBuzz.print(10);

        assertThat(print).isEqualTo("Buzz");
    }

    @Test
    void print_string_FizzBuzz_when_the_given_integer_is_15() {

        String print = fizzBuzz.print(15);

        assertThat(print).isEqualTo("FizzBuzz");
    }
}
