public class Metro {
    boolean isInStation;
    boolean isMoving;
    boolean doorsAreOpen;

    public Metro(boolean isInStation, boolean isMoving, boolean doorsAreOpen) {
        this.isInStation = isInStation;
        this.isMoving = isMoving;
        this.doorsAreOpen = doorsAreOpen;
    }

    public boolean stop() {
        if (isInStation) {
            return isMoving = false;
        } else {
            return isMoving = true;
        }
    }

    public boolean moving() {
        if (isMoving) {
            return doorsAreOpen = false;
        } else {
            return doorsAreOpen = true;
        }
    }

}
