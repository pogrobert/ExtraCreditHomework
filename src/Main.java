public class Main {
    public static void main() {
        Car car = new Car(60, 150);
        Police police = new Police(false, true);
        Metro metro = new Metro(true, false, true);

        System.out.println(Recursive.recursiveFactorial(3));
    }
}
