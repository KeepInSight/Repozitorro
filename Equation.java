package Homeworks1;
import java.util.Scanner;

/**
 * В три переменные a, b и c записаны три вещественных числа. Создать программу, которая

 будет находить и выводить на экран вещественные корни квадратного уравнения

 ax^2+bx+c=0, либо сообщать, что корней нет (a, b и c – вводит пользователь).
 */
public class Equation {
    private static float a;
    private static float b;
    private static float c;
    private static double D;
    private static double x1;
    private static double x2;

        public static int Define(float a, float b, float c){
            D = Math.pow(b,2) - 4 * a * c;
            if (D < 0){
                System.out.println("Roots not exist");
            }
            else if (D==0){
                x1 = ((-b)/(2*a));
                System.out.println("We have 1 root: "+ x1);
            }
            else{
                x1 = (((-b)+Math.sqrt(D))/(2*a));
                x2 = (((-b)-Math.sqrt(D))/(2*a));
                System.out.println("We have 2 roots: "+ x1 + " and "+ x2);
            }
            return 0;
        }

    public static void main(String[] args) {
        Equation mySomeEquation = new Equation();
        Scanner myEquation = new Scanner(System.in);
        System.out.println("Enter 'a':");
        a = myEquation.nextFloat();
        System.out.println("Enter 'b':");
        b = myEquation.nextFloat();
        System.out.println("Enter 'c':");
        c = myEquation.nextFloat();
        System.out.println(Define(a,b,c));
    }
}
