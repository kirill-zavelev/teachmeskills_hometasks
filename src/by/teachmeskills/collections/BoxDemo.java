package by.teachmeskills.collections;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BoxDemo {
    public static void main(String[] args) {
        Set<Ball> balls = Stream.of(new Ball(10), new Ball(20), new Ball(30)).collect(Collectors.toSet());
        Ball ball = new Ball(40);
        System.out.println(balls);
        Container container = new Container();
        container.addBalls(balls);
        container.getSizeOfEachBall(balls);
        container.getSummaryBallsSize(balls);
        container.getBallsAmount(balls);
        container.getBallIfExist(balls, ball);
        container.removeBall(balls, ball);
        container.removeBall(balls, balls.iterator().next());
        System.out.println(container);
        container.cleanUpContainer(balls);
        System.out.println(balls);
        Ball ballWithRandomSize = new Ball();
        container.addBall(balls, ballWithRandomSize);
        System.out.println(balls);
        Set<Ball> balls1 = Stream.of(new Ball(22), new Ball(54), new Ball(99), new Ball(33)
                , new Ball(11), new Ball(12), new Ball(45), new Ball(66), new Ball(83)
                , new Ball(89), new Ball(37), new Ball(1)).collect(Collectors.toSet());
        Box box = new Box(balls1);
        box.sortBalls();
    }
}
