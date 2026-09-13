import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input suhu Celsius
        System.out.print("Masukkan suhu (Celsius): ");
        double celsius = input.nextDouble();

        // Mengubah Celsius ke Fahrenheit
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        // Menampilkan hasil
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);

        // Menutup Scanner
        input.close();
    }
}
