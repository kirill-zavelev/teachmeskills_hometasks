package by.teachmeskills.collections;

import java.util.Set;

public class BoxDemo {
    public static void main(String[] args) {
        Set<Ball> balls = Set.of(new Ball(10), new Ball(20), new Ball(30));
        Ball ball = new Ball(40);
        System.out.println(balls);
        Container container = new Container();
        container.addBalls(balls);
        container.printSizeOfEachBall();
        container.printSumOfBallsSizes();
        container.printBallsAmount();
        container.checkBallIfExist(ball);
        container.removeBall(ball);
        container.removeBall(balls.iterator().next());
        System.out.println(container);
        container.cleanUpContainer();
        System.out.println(balls);
        Ball ballWithRandomSize = new Ball();
        container.addBall(ballWithRandomSize);
        System.out.println(balls);
        Set<Ball> balls1 = Set.of(new Ball(22), new Ball(54), new Ball(99), new Ball(33)
                , new Ball(11), new Ball(12), new Ball(45), new Ball(66), new Ball(83)
                , new Ball(89), new Ball(37), new Ball(1));
        Box box = new Box(10);
        box.addBalls(balls1);
        System.out.println(box.getSortedBalls());
    }
}
