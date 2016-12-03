package Homeworks1;
import java.util.Scanner;

/**
 * Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в

 переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45 (n и m –

 вводит пользователь).
 */
public class CloserTo10 {
   private  float firstNum;
   private float secondNum;

    public static float define(float fSt, float sCnd){
        if ((Math.abs(10 - fSt) > Math.abs(10-sCnd)))
            return sCnd;
        else return fSt;


    }

    public static void main(String[] args) {

        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter first number");
        float firstNum = myNumber.nextFloat();
        System.out.println("Enter second number");
        float secondNum = myNumber.nextFloat();
        System.out.println("Closer to 10 is " + define(firstNum,secondNum));
    }
}
