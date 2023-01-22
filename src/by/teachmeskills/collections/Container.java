package by.teachmeskills.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;

public class Container {

    private Set<Ball> balls;

    public void removeBall(Set<Ball> balls, Ball ball) {
        this.balls = balls;
        if (balls.contains(ball)) {
            balls.remove(ball);
            System.out.println(ball + " was removed from set");
        } else {
            System.out.println("Set does not contain " + ball);
        }
    }

    public void addBall(Set<Ball> balls, Ball ball) {
        this.balls = balls;
        if (balls.contains(ball)) {
            System.out.println(ball + " is already defined in set. Please add unique ball");
        } else {
            balls.add(ball);
        }
    }

    public void addBalls(Set<Ball> balls) {
        this.balls = balls;
        new HashSet<>(balls);
    }

    public void getBallsAmount(Set<Ball> balls) {
        System.out.println("Amount of balls = " + balls.size());
    }

    public void cleanUpContainer(Set<Ball> balls) {
        balls.clear();
    }

    public void getBallIfExist(Set<Ball> balls, Ball ball) {
        boolean matches = Stream.of(balls).anyMatch(b -> balls.contains(ball));
        if (matches) {
            System.out.println(ball.toString());
        } else {
            System.out.println(ball.toString() + " does not exist in " + balls);
        }
    }

    public void getSizeOfEachBall(Set<Ball> balls) {
        System.out.println("Balls sizes:");
        balls.forEach(b -> System.out.println(b.getSize()));
    }

    public void getSummaryBallsSize(Set<Ball> balls) {
        int sum = balls.stream().mapToInt(Ball::getSize).sum();
        System.out.println("Sum of all balls sizes is: " + sum);
    }

    @Override
    public String toString() {
        return "Container{" +
                "balls=" + balls +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Container)) return false;
        Container container = (Container) o;
        return balls.equals(container.balls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balls);
    }
}
