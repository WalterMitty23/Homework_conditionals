package pro.sky;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();



    }
    public static void task1() {
        System.out.println("Task 1");
        byte age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Task 2");
        byte temp = -5;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (temp >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Task 3");
        short currentSpeed = 60;
        if (currentSpeed > 60) {
            System.out.println("Если скорость " + currentSpeed + " придется заплатить штраф ");
        } else {
            System.out.println("Если скорость " + currentSpeed + " можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Task 4");

    }

}