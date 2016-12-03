package Homeworks1;
import java.util.Scanner;



/**
 * Создать программу, проверяющую и сообщающую на экран, является ли целое число,

 записанное в переменную n, чётным либо нечётным (n – вводит пользователь).
 */
public class Parity {


    public static boolean checkNum(int n) {
        if (n % 2 == 0)
            return true;
        else return false;

    }

    public static void main(String[] args) {
        System.out.println("Введите проверяемое число");
        Scanner myNumber = new Scanner(System.in);
        int n = myNumber.nextInt();
        System.out.println("Sentence: The digit is parry: "+checkNum(n));;




    }
}
