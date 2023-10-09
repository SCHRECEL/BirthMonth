import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthChoice = 0;

        System.out.println("Enter the number corresponding with your birth month (1-12): ");
        monthChoice = scanner.nextInt();

        if (monthChoice == 1){
            System.out.println("Your birth month is: January");
        }
        else if (monthChoice == 2){
            System.out.println("Your birth month is: February ");
        }
        else if (monthChoice == 3){
            System.out.println("Your birth month is: March");
        }
        else if (monthChoice == 4){
            System.out.println("Your birth month is: April");
        }
        else if (monthChoice == 5){
            System.out.println("Your birth month is: May");
        }
        else if (monthChoice == 6){
            System.out.println("Your birth month is: June");
        }
        else if (monthChoice == 7){
            System.out.println("Your birth month is: July");
        }
        else if (monthChoice == 8){
            System.out.println("Your birth month is: August");
        }
        else if (monthChoice == 9){
            System.out.println("Your birth month is: September");
        }
        else if (monthChoice == 10){
            System.out.println("Your birth month is: October");
        }
        else if (monthChoice == 11){
            System.out.println("Your birth month is: November");
        }
        else if (monthChoice == 12){
            System.out.println("Your birth month is: December");
        }
        else{
            System.out.println("You entered an invalid number (" +monthChoice+")");
        }
    }
}