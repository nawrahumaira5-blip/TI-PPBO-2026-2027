import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== LATIHAN 5: Mencari Nilai Terbesar Kedua ===");
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Masukkan " + n + " bilangan:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }


        int terbesar = Integer.MIN_VALUE;
        int terbesarKedua = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > terbesar) {
                terbesarKedua = terbesar; // Nilai terbesar lama turun pangkat
                terbesar = arr[i];        // Update nilai terbesar baru
            } else if (arr[i] > terbesarKedua && arr[i] != terbesar) {
                terbesarKedua = arr[i];   // Update nilai terbesar kedua
            }
        }

        System.out.println("\n--- Hasil ---");
        if (terbesarKedua == Integer.MIN_VALUE) {
            System.out.println("Tidak ada nilai terbesar kedua (semua elemen sama atau kurang dari 2 elemen unik).");
        } else {
            System.out.println("Nilai TERBESAR KEDUA dalam array adalah: " + terbesarKedua);
        }

        input.close();
    }
}