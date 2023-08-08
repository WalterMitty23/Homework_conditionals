package pro.sky;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

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
        int age = 69;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
        } else if (age >= 2 && age < 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        } else if (age >= 24 && age < 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть");
        }

    }

    public static void task5() {
        System.out.println("Task 5");
        int age = 11;
        boolean okForRide = age < 5;
        boolean escortedByAdults = age >= 5 && age < 14;
        boolean rideAlone = age >= 14;
        if (okForRide) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе");
        } else if (escortedByAdults) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого");
        } else if (rideAlone) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого");

        }
    }

    public static void task6() {
        System.out.println("Task 6");
        int totalCapacity = 102;
        int seatingPlaces = 60;
        int standingPlaces = totalCapacity - seatingPlaces;
        int pax = 105;
        boolean full = pax > 102;
        boolean youCanSeat = (pax > 0) && (pax <= seatingPlaces);
        boolean sorryYouStand = (pax > seatingPlaces) && (pax <= totalCapacity) && !youCanSeat;
        if (full) {
            System.out.println("вагон уже полностью забит");
        } else if (youCanSeat) {
            System.out.println("в вагоне есть сидячие места");
        } else if (sorryYouStand) {
            System.out.println("в вагоне остались только стоячие места");
        } else {
            System.out.println("не правильно введен пассажир");
        }
    }
    public static void task7() {
        System.out.println("Task 7");
        int one = 23;
        int two = 15;
        int three = 82;
        if ((one > two) && (one > three)) {
            System.out.println("наибольшее число " + one);
        } else if (two > three) {
            System.out.println("наибольшее число " + two);
        } else {
            System.out.println("наибольшее число " + three);
        }

    }

   /* P.S. задача оказалась очень легкая, но после подсказки Nina Pikhota. Все что ниже возился я
   итог - плюнул и решил проверитть иную гипотезу
   В моих решения я проверял каждый отдельный кейс, срабатывало 2 условия, но если появлось третье = не получалось


   public static void task7() {
        System.out.println("Task 7");
        int one = 11;
        int two = 10;
        int three = 12;
        boolean oneTheBiggest = (one > two) && (two > three);
        boolean oneTheBiggestToo = (one > two) && (three > two);
        boolean twoTheBiggest = (two > three) && (three > one) && (two > one);
        boolean twoTheBiggestToo = (two > three) && (one > three) && (two > one);
        boolean threeTheBiggest = (three > one) && (one > two) && (three > two);
        boolean threeTheBiggestToo = (three > one) && (three > two);
            if (oneTheBiggest) {
                System.out.println("наибольшее число " + one);
            } else if (oneTheBiggestToo) {
                System.out.println("наибольшее число " + one);
            } else if (twoTheBiggest) {
                System.out.println("наибольшее число " + two);
            } else if (twoTheBiggestToo) {
                System.out.println("наибольшее число " + two);
            } else if (threeTheBiggest) {
                System.out.println("наибольшее число " + three);
            } else if (threeTheBiggestToo) {
                System.out.println("наибольшее число " + three);
            } else {
                System.out.println("введи нормальное число");
            }

        }
    */

}