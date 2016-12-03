
package Homeworks1;

/**
 Создать класс Dog, который будет содержать 2 поля name и says. В main( ) создать 2

 экземпляра класса с name “spot” (says, “Ruff!”) и “scruffy” (says, “Wurf!”). И распечатать поля

 объектов.
 */
public class Dog {
    private String name;
    private String say;

    public Dog(String n, String s){
        this.name = n;
        this.say = s;

    }
    public static void main(String[] args) {
        Dog firstDog = new Dog("Spot", "Ruff!!");
        Dog secondDog = new Dog("Scruffy", "Wurf!!");

        System.out.println("First dog "+firstDog.name + " says "+ firstDog.say);
        System.out.println("Second dog "+secondDog.name + " says "+ secondDog.say);

    }
}