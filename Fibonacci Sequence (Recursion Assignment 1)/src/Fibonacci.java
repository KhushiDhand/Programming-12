public class Fibonacci {
    public static long calculateFibonacci (int i)
    {
        if (i <= 2) {
            return 1;
        }
        long fibTerm = calculateFibonacci(i - 1) + calculateFibonacci(i - 2);
        return fibTerm;
    }

    public static void main(String[] args) {
        System.out.println(calculateFibonacci(7));
    }
}





