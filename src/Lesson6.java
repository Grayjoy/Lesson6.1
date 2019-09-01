import java.util.Scanner;

public class Lesson6 {

    private Scanner scanner = new Scanner(System.in);

    public void min() {

        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);

        if (a < b && a < c) {
            System.out.println("min: " + a);
        } else if (b < a && b < c) {
            System.out.println("min: " + b);
        } else {
            System.out.println("min: " + c);

        }
        count();
    }

    public void count() {
        int hours = 24;
        int minutes = 1440;
        int seconds = 86400;

        System.out.println("Введите кол-во суток");
        int scr = scanner.nextInt();

        hours = hours * scr;
        minutes = minutes * scr;
        seconds = seconds * scr;

        System.out.println("В " + scr + " сутках: " + hours + " часов, " + minutes + " минут, " + seconds + " секунд");


    }
}