package fizzbuzz;

class FizzBuzz {
    String print(int n) {
        if (n % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(n);
    }
}
