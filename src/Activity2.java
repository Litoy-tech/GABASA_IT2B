import java.util.Scanner;

public class Activity2 {
    Scanner sc = new Scanner(System.in);

    public void cinemaTicketing(){
        System.out.println("========== CINEMA TICKETING SYSTEM ==========");
        System.out.print(" Select Format(1: Regular, 2: 3D, 3: IMAX): ");
        int format = sc.nextInt();

        System.out.print(" Enter Screening Hour (24-Hour Format): ");
        int hour = sc.nextInt();
        System.out.println();

        String screeningFormat = "";
        double price = 0;
        double peakFee = 0;

        if(format == 1){
            screeningFormat = "REGULAR";
            price = 300;
        }else if(format == 2){
            screeningFormat = "3D";
            price = 350;
        } else if (format == 3) {
            screeningFormat = "IMAX";
            price = 400;
        }else{
            System.out.println("Invalid format selected!");
            return;
        }

        if(hour >= 17 && hour <= 20){
            peakFee = 50;
        }

        double total = price + peakFee;

        System.out.println();
        System.out.println("=== TICKET BREAKDOWN ===");
        System.out.println("Screening Format: " + screeningFormat);
        System.out.printf("Base Ticket Price: PHP %.2f%n", price);
        System.out.printf("Peak Hour Fee:     PHP %.2f%n", peakFee);
        System.out.println("-------------------------");
        System.out.printf("TOTAL TICKET COST: PHP %.2f%n", total);
        System.out.println("STATUS: SEAT RESERVED");
        System.out.println("-------------------------");
    }

}
