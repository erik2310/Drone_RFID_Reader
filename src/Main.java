import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Datatype til værdien
        String valueFromScanner;


        // Læs værdien fra RFID scanneren
        System.out.println("Venter på værdi:");
        Scanner scanner = new Scanner(System.in);
        valueFromScanner = scanner.nextLine();


        // Gør noget med værdien fra scanneren
        System.out.println("Værdien er: " + valueFromScanner);


    }
}
