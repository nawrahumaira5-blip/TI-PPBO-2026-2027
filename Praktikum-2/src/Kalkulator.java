import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dua angka
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        // Operasi aritmatika
        System.out.println("\n--- Hasil Aritmatika ---");
        System.out.println("Penjumlahan = " + (a + b));
        System.out.println("Pengurangan = " + (a - b));
        System.out.println("Perkalian   = " + (a * b));
        System.out.println("Pembagian   = " + ((double) a / b));
        System.out.println("Sisa Bagi   = " + (a % b));

        // Operasi perbandingan
        System.out.println("\n--- Hasil Perbandingan ---");
        System.out.println(a + " > " + b + " : " + (a > b));
        System.out.println(a + " < " + b + " : " + (a < b));
        System.out.println(a + " == " + b + " : " + (a == b));

        // Menutup Scanner
        input.close();
    }
}