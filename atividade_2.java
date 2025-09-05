import java.util.Scanner;

public class atividade_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        // Conversões
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        // Saída formatada
        System.out.println("\n--- Conversão de Temperaturas ---");
        System.out.printf("Temperatura em Celsius: %.2f ºC%n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f ºF%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);

        sc.close();
    }
}
