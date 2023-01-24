package by.teachmeskills.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Box extends Container {

    private int maxSize;

    public Box(int maxSize) {
        this.maxSize = maxSize;
        this.balls = new HashSet<>();
    }

    public void addBalls(Set<Ball> balls) {
        if (checkBallsSize(balls)) {
            this.balls.addAll(balls);
        }
    }

    private boolean checkBallsSize(Set<Ball> balls) {
        if (balls.size() <= this.maxSize) {
            return true;
        } else {
            System.out.println("Balls were not added. Box can contain max " + maxSize + " balls. There are "
                    + balls.size() + " balls in current set.");
            return false;
        }
    }

    public List<Ball> getSortedBalls() {
        return this.balls.stream().sorted().collect(Collectors.toList());
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
