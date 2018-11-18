public class Recursive {
    public static int recursiveFactorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return (num * recursiveFactorial(num - 1));
        }
    }
}
