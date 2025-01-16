import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("choose conversion type: ");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");
        int choice = scan.nextInt();

        System.out.println("Enter temperature value: ");
        double temp = scan.nextDouble();

        double result =0;

        switch(choice){
            case 1: // Celsius to Fahrenheit
                result = (temp * 9/5) +32;
                break;
            case 2: // Celsius to Kelvin
                result = temp + 273.15;
                break;
            case 3: // Fahrenheit to Celsius
                result = (temp - 32) * 5/9 ;
                break;
            case 4: // Fahrenheit to Celsius
                result = (temp - 32) * 5/9 + 273.15;
                break;
            case 5: // Kelvin to Celsius
                result = temp - 273.15;
                break;
            case 6: // Kelvin to Fahrenheit
                result = (temp - 273.15) * 9/5 + 32;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        System.out.printf("Coverted temperature: %.2f", result);
    }
}