import java.util.Scanner;

public class Time {
    private int hours;
    private int minutes;

    public Time() {
        this.hours = 0;
        this.minutes = 0;
    }

    public Time(int hours) {
        this.hours = hours;
        this.minutes = 0;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public Time sum(Time other) {
        int totalHours = this.hours + other.hours;
        int totalMinutes = this.minutes + other.minutes;

        if (totalMinutes >= 60) {
            totalHours += totalMinutes / 60;
            totalMinutes %= 60;
        }

        return new Time(totalHours, totalMinutes);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter hours and minutes for time object 1:");
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        Time t1 = new Time(hours1, minutes1);

        System.out.println("Enter hours and minutes for time object 2:");
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        Time t2 = new Time(hours2, minutes2);

        scanner.close();

        System.out.println("Time Object 1: " + t1.getHours() + " hours " + t1.getMinutes() + " minutes");
        System.out.println("Time Object 2: " + t2.getHours() + " hours " + t2.getMinutes() + " minutes");

        Time sum = t1.sum(t2);

        System.out.println("Sum of Time Objects: " + sum.getHours() + " hours " + sum.getMinutes() + " minutes");
    }
}
