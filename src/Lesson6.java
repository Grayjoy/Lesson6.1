import java.util.Scanner;

public class Lesson6 {

    private Scanner scanner = new Scanner(System.in);
    private int hours;
    private int minutes;
    private int seconds;

    public void randomValues() {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);
        getMinNumber(a, b, c);

    }

    public void getMinNumber(int a, int b, int c) {

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

        System.out.println("Введите кол-во суток");
        int day = scanner.nextInt();

        getHours(day);
        getMinutes(hours);
        getSeconds(minutes);

        System.out.println("В " + day + " сутках: " + hours + " часов, " + minutes + " минут, " + seconds + " секунд");


    }

    public int getHours(int day) {
        hours = day * 24;
        return hours;
    }

    public int getMinutes(int hours) {
        minutes = hours * 60;
        return minutes;
    }

    public int getSeconds(int minutes) {
        seconds = minutes * 60;
        return seconds;
    }


}