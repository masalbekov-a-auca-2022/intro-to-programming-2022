public class Problem10 {
    public static void main(String[] args) {
        final int primes = 50;
        final int lines = 10;
        int count = 0;
        int num = 2;
        System.out.println("The first 50 prime numbers are ");
        while (count < primes) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= num / 2; divisor++) {
                if (num % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                if (count % lines == 0) {
                    System.out.println(num);
                } else
                    System.out.print(num + " ");
            }
            num++;
        }
    }
}
