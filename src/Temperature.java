import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.println("Unesite temperature u °C (0 za kraj):");

        double minTemperature = 0;
        double maxTemperature = 0;
        double sum = 0;
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
            sum += temperature;
        }

        if (count == 0) {
            System.out.println("Nije uneseno nijedno mjerenje.");
        } else {
            System.out.printf("%n Broj mjerenja: %d %n", count);
            System.out.printf("Najniža temperatura: %.2f°C%n", minTemperature);
            System.out.printf("Najviša temperatura: %.2f°C%n", maxTemperature);
            System.out.printf("Prosijek: %.2f %n", sum/count);
            System.out.printf("Broj povišenih temperatura (> %.2f°C): %d%n", Poviseno, povisenoCount);
        }
        if(count>0 && povisenoCount == 0){
            System.out.println("Sva mjerenja u granicama normale");
        }
        else {
            System.out.println("Povišena temperatura zabilježena");
        }
        input.close();
    }
}
