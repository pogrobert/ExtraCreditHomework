public class Car {
    int speed;
    int maxSpeed;

    public Car(int speed, int maxSpeed) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    public int speedUp() {
        if (speed != maxSpeed) {
            return speed += 1;
        } else {
            return speed += 0;
        }
    }

    public int slowDown() {
        if (speed == 0) {
            return 0;
        } else {
            return speed -= 1;
        }
    }

}

