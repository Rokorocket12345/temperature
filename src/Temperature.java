import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.println("Unesite temperature u °C (0 za kraj):");

        double minTemperature = 0;
        double maxTemperature = 0;
        int count = 0;
        int povisenoCount = 0;
        final double Poviseno = 37.0;

        while (true) {
            System.out.print("Temperatura: ");
            double temperature = input.nextDouble();
            if (temperature == 0.0) {
                break;
            }
            if (count == 0 || temperature < minTemperature) {
                minTemperature = temperature;
            }
            if (temperature > maxTemperature) {
                maxTemperature = temperature;
            }
            if (temperature > Poviseno) {
                povisenoCount++;
            }
            count++;
        }

        if (count == 0) {
            System.out.println("Nije uneseno nijedno mjerenje.");
        } else {
            System.out.printf("Najniža temperatura: %.2f°C%n", minTemperature);
            System.out.printf("Najviša temperatura: %.2f°C%n", maxTemperature);
            System.out.printf("Broj povišenih temperatura (> %.2f°C): %d%n", Poviseno, povisenoCount);
        }
        if(poviseniCount > 0){}

        input.close();
    }
}
