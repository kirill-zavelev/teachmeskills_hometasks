package by.teachmeskills.collections;

import java.util.Objects;
import java.util.Set;

public class Box extends Container {

    private Set<Ball> balls;

    public Box(Set<Ball> balls) {
        if (isSetHasMax10Balls(balls)) {
            addBalls(balls);
            this.balls = balls;
        }
    }

    private boolean isSetHasMax10Balls(Set<Ball> balls) {
        if (balls.size() <= 10) {
            return true;
        } else {
            System.out.println("Balls were not added. Box can contain max 10 balls. There are "
                    + balls.size() + " balls in current set.");
            return false;
        }
    }

    public void sortBalls() {
        if (this.balls != null) {
            this.balls.stream().sorted().forEach(System.out::println);
        } else {
            System.out.println("The box can't be empty");
        }
    }

    @Override
    public String toString() {
        return "Box{" +
                "balls=" + balls +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;
        Box box = (Box) o;
        return balls.equals(box.balls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balls);
    }
}
