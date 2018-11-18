public class Police {
    boolean violation;
    boolean patrol;

    public Police(boolean violation, boolean patrol) {
        this.violation = violation;
        this.patrol = patrol;
    }

    public String chasing() {
        if (violation) {
            return "Starting the chase";
        } else {
            return "No traffic violations";
        }
    }

    public String patrolling() {
        if (patrol) {
            return "Patrolling the roads";
        } else {
            return "Going to McDonald's";
        }
    }
}
