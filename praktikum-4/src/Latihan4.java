import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriks = new int[3][3];
        int totalSemua = 0;

        System.out.println("=== LATIHAN 4: Operasi Matriks 3x3 ===");
        System.out.println("Masukkan elemen matriks 3x3:");

        // Input elemen matriks
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks[i][j] = input.nextInt();
            }
        }

        System.out.println("\n--- Hasil Pengolahan Matriks ---");

        // Menghitung dan menampilkan jumlah setiap baris
        for (int i = 0; i < 3; i++) {
            int jumlahBaris = 0;
            for (int j = 0; j < 3; j++) {
                jumlahBaris += matriks[i][j];
                totalSemua += matriks[i][j]; // Akumulasi total keseluruhan
            }
            System.out.println("Jumlah elemen pada baris ke-" + (i + 1) + ": " + jumlahBaris);
        }

        // Menampilkan jumlah seluruh elemen matriks
        System.out.println("Jumlah seluruh elemen matriks: " + totalSemua);

        input.close();
    }
}