package Homeworks1;
import java.util.Scanner;

/**
 * В переменных a и b лежат положительные длины катетов прямоугольного треугольника.

 Вычислить и вывести на экран площадь треугольника и его периметр (a и b – вводит

 пользователь).
 */
public class Triangle {
    private static float cathetus1;
    private static float cathetus2;
    private static float S;
    private static double P;

    public static void DefineSandP(){

        Scanner cathetus = new Scanner(System.in);
        System.out.println("Enter first cathetus:");
        cathetus1 = cathetus.nextFloat();
        System.out.println("Enter second cathetus:");
        cathetus2 = cathetus.nextFloat();
        S = (cathetus1 * cathetus2)/2;
        P = (Math.sqrt(Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2))) + cathetus1 + cathetus2;
        System.out.println("Area of a Triangle is " + S);
        System.out.println("Perimeter of a Triangle is " + P);
    }

    public static void main(String[] args) {

        Triangle myTriangle = new Triangle();
        DefineSandP();
    }
}
