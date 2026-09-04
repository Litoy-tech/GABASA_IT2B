import java.util.Scanner;

public class Activity2 {
    Scanner sc = new Scanner(System.in);

    public void cinemaTicketing(){
        System.out.println("========== CINEMA TICKETING SYSTEM ==========");
        System.out.print(" Select Format(1: Regular, 2: 3D, 3: IMAX): ");
        int choice = sc.nextInt();
        System.out.print(" Enter Screening Hour (24-Hour Format): ");
        int hour = sc.nextInt();
        System.out.println();
    }

}
