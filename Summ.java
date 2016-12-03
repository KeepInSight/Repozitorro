package Homeworks1;
import java.util.Scanner;

/**
 В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую

 и выводящую на экран сумму цифр числа n (n – вводит пользователь).
 */
public class Summ {

    public static int summaNax(int num){
       int firstD = num / 10;
       int secondD = num % 10;
       int summa = firstD + secondD;
       return summa;

    }

    public static void main(String[] args) {
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter two-digit number");
        int num = myNumber.nextInt();
        System.out.println("The sum of digits : " + summaNax(num));

    }
}
