package lesson6.animals;

public class Animal {
    String name;
    String color;
    int age;
    int lengthObstacle;
    int counter;

    public Animal() {
        this.name = name;
        this.color = color;
        this.age = age;
        this.lengthObstacle = lengthObstacle;
        this.counter = counter;

    }


    public void run(){
        System.out.println(name + " пробижал" + lengthObstacle);
    }

    public void swim(){
        System.out.println(name + " проплыл" + lengthObstacle);
    }

    public void info() {
        System.out.printf("%s %s %d\n", name, color, age);
    }

    int getLengthObstacle() {
        return lengthObstacle;
    }

    public int getCounter() {
        return counter;
    }
    public void printCounter() {
        System.out.println("Всего животных " + counter);
    }
}
