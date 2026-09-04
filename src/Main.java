import java.util.Scanner;
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("=== PRORTFOLIO OF ACTIVITY ===");
    System.out.println("NAME: Angelito Gabasa");
    System.out.println("SECTION/YEAR: IT2B");
    System.out.println("========== CONTENTS ==========");
    System.out.println("1. Activity 1");
    System.out.println("2. Activity 2");
    System.out.println("=============================");
    System.out.print("Enter Selection: ");
    int select = sc.nextInt();
    System.out.println();

        if(select == 1){
            Activity1 act1 = new Activity1();
            act1.userGreetings();

        }else if(select == 2){
            Activity2 act2 = new Activity2();
            act2.cinemaTicketing();
        }else{
            System.out.println("System not Found!");
        }

}
