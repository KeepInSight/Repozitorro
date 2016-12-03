package Homeworks1;
import java.util.Scanner;

/**
 * Создать класс, который будет хранить в одной целочисленной переменной несколько

 значений меньшей длины. Например, возраст, вес, рост и год рождения. Добавить методы

 получения и добавления параметров отдельно.
 */
public class HardestTask {
    private static long myVar = 181671781996l;
    private static long age;
    private static long weight;
    private static long height;
    private static long year;

    public static void setAge(long myVar){
        myVar = (myVar * 1000000000) + (myVar % 1000000000);

    }
    public static int getAge() {
        long age = (myVar / 10000000000l);
        return (int) age;
    }

    public static void setWeight(long myVar) {
        myVar = (myVar * 10000000) + (myVar % 100000);
    }

    public static long getWeight() {
        long weight = ((myVar % 10000000000l) / 10000000);
        return  weight;
    }

    public static void setHeight(long myVar) {
        myVar = (myVar * 10000) + (myVar % 10000);
    }


    public static int getHeight() {
        long height = (myVar % 10000000) / 10000;
        return (int) height;
    }

    public static void setYear(long year) {
        myVar = (myVar - (myVar % 10000)) + (year);
    }

    public static int getYear() {
        long year = myVar % 10000;
        return (int) year;
    }

    public static void main(String[] args) {
        HardestTask myExample = new HardestTask();
        Scanner vvod = new Scanner(System.in);
        System.out.println("1 - show default:/n2 = enter your data");

        int vybor = (int)vvod.nextLong();
        switch (vybor){
            case 1:
                System.out.println("Age: "+getAge());
                System.out.println("Weight: "+getWeight());
                System.out.println("Height: "+getHeight());
                System.out.println("Year: "+getYear());break;
            case 2:
                System.out.println("Enter the age:");
                age = vvod.nextLong();
                setAge(age);
                System.out.println("Enter the weight:");
                weight = vvod.nextLong();
                setWeight(weight);
                System.out.println("Enter the height:");
                height = vvod.nextLong();
                setHeight(height);
                System.out.println("Enter the year:");
                year = vvod.nextLong();
                setYear(year);

                System.out.println(myVar);
        }






    }



}
