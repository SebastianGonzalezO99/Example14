import java.util.Scanner;

public class Example14 {

    public static void main(String[] argv) {

        Scanner input = new Scanner(System.in);
        int hora, min, seg;

        System.out.print("Write the amount of hours: ");
        hora = input.nextInt();

        System.out.print("Write the amount of minutes: ");
        min = input.nextInt();

        System.out.print("Write the amount of seconds: ");
        seg = input.nextInt();

        if (hora < 0 || hora > 23 || min < 0 || min > 60 || seg < 0 || seg > 60) {
            System.out.println("ERROR");
        } else {
            if (seg == 59) {
                if (min == 59) {
                    if (hora == 23) {
                        System.out.println("The time is: 00:00:00");
                    } else {
                        System.out.println("The time is: " + hora + ":00:00");
                    }
                } else {
                    System.out.println("The time is: " + hora + ":" + (min + 1) + ":00");
                }
            } else {
                System.out.println("The time is: " + hora + ":" + min + ":" + (seg + 1));
            }
        }
    }
}
