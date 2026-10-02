import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];

        // Input 10 bilangan
        System.out.println("Masukkan 10 bilangan:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        // Tampilkan array terbalik
        System.out.println("\nArray dalam urutan terbalik:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        input.close();
    }
}