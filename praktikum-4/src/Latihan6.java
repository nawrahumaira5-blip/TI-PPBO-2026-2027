import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== LATIHAN 6: Bubble Sort Ascending ===");
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Masukkan " + n + " bilangan:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        // Menampilkan array sebelum diurutkan
        System.out.print("\nArray Sebelum diurutkan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Algoritma Bubble Sort (Ascending / Kecil ke Besar)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Proses Tukar Posisi (Swap)
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Menampilkan array setelah diurutkan
        System.out.print("\nArray Setelah diurutkan (Ascending): ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        input.close();
    }
}