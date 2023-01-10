package by.teachmeskills.interfacesandinheritence.figure;

import java.util.Random;

public class FigureDemo {
    private static final String PERIMETER_OF_FIGURE_MESSAGE = "Perimeter of figure is: ";
    private static final String SUM_OF_PERIMETERS_OF_FIGURES_MESSAGE = "Sum of the perimeters of all figures is: ";

    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(10);
        int b = random.nextInt(20);
        int c = random.nextInt(30);

        Figure[] figures = {new Triangle(a, b, c), new Rectangle(a, b), new Circle(a), new Circle(b), new Circle(c)};
        sumOfPerimeters(figures);
    }

    private static void sumOfPerimeters(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            double perimeter = figure.calculatePerimeter();
            System.out.println(PERIMETER_OF_FIGURE_MESSAGE + perimeter);
            sum += perimeter;
        }
        System.out.printf(SUM_OF_PERIMETERS_OF_FIGURES_MESSAGE + (String.format("%.2f", sum)));
    }
}
