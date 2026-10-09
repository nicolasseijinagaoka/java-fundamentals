public class ex_6_fizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            int m3 = i % 3;
            int m5 = i % 5;

            if (m3 == 0 && m5 == 0) {
                System.out.println(i + " - FizzBuzz");
            }
            else if (m3 == 0) {
                System.out.println(i + " - Fizz");
            }
            else if (m5 == 0) {
                System.out.println(i + " - Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}