package fizzbuzz;

class FizzBuzz {
    String print(int n) {
        String result = "";
        if (n % 3 == 0) {
            result += "Fizz";
        }
        if (n % 5 == 0) {
            result += "Buzz";
        }
        return result.isEmpty() ? String.valueOf(n) : result;
    }
}
