package src;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean next = true;

        while (next) {
            System.out.println("What's your height in centimeters?");
            double height = scanner.nextDouble(); 
            height /= 100; 
            
            System.out.println("What's your weight in KGs?");
            double weight = scanner.nextDouble(); 
            
            double imc = weight / (height * height); 
            System.out.printf("Your BMI is: %.2f\n", imc);

            if (imc < 18.5) {
                System.out.println("You're underweight! Please, take care.");
            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("You're good!");
            } else if (imc >= 25 && imc <= 29.9) {
                System.out.println("You're beggining to relax on your health...");
            } else {
                System.out.println("Please, take care of yourself.");
            }

            System.out.println("Do you want to calculate again? (yes/no)");
            String response = scanner.next();

            if (!response.equalsIgnoreCase("yes")) {
                next = false;
            }
        }

        scanner.close(); 
    }
}
