package by.teachmeskills.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Container {

    protected Set<Ball> balls;

    public Container() {
        this.balls = new HashSet<>();
    }

    public void removeBall(Ball ball) {
        if (this.balls.contains(ball)) {
            this.balls.remove(ball);
            System.out.println(ball + " was removed from set");
        } else {
            System.out.println("Set does not contain " + ball);
        }
    }

    public void addBall(Ball ball) {
        if (this.balls.contains(ball)) {
            System.out.println(ball + " is already defined in set. Please add unique ball");
        } else {
            this.balls.add(ball);
        }
    }

    public void addBalls(Set<Ball> balls) {
        if (this.balls != null) {
            this.balls.addAll(balls);
        }
    }

    public void printBallsAmount() {
        System.out.println("Amount of balls = " + this.balls.size());
    }

    public void cleanUpContainer() {
        this.balls.clear();
    }

    public void checkBallIfExist(Ball ball) {
        boolean matches = this.balls.stream().anyMatch(b -> this.balls.contains(ball));
        if (matches) {
            System.out.println(ball.toString());
        } else {
            System.out.println(ball.toString() + " does not exist in " + this.balls);
        }
    }

    public void printSizeOfEachBall() {
        System.out.println("Balls sizes:");
        this.balls.forEach(b -> System.out.println(b.getSize()));
    }

    public void printSumOfBallsSizes() {
        int sum = this.balls.stream().mapToInt(Ball::getSize).sum();
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
