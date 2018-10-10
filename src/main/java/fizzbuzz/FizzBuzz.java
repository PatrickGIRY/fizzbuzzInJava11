package fizzbuzz;

class FizzBuzz {
    String print(int n) {
        if (n % 5 == 0) {
            return "Buzz";
        }
        if (n % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(n);
    }
}
