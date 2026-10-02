import java.util.Scanner;

public class PengolahanNilaiKelas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int KKM = 70;

        System.out.println("--- PROGRAM PENGOLAH NILAI KELAS ---");


        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = input.nextInt();

        int[] nilai = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }


        int total = 0;
        int max = nilai[0];
        int min = nilai[0];
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 0; i < N; i++) {
            total = total + nilai[i];

            if (nilai[i] > max) max = nilai[i];
            if (nilai[i] < min) min = nilai[i];

            if (nilai[i] >= KKM) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        double rataRata = (double) total / N;


        System.out.println("\n--- HASIL STATISTIK ---");
        System.out.printf("Rata-rata kelas   : %.2f\n", rataRata);
        System.out.println("Nilai tertinggi   : " + max);
        System.out.println("Nilai terendah    : " + min);
        System.out.println("Jumlah Lulus      : " + lulus);
        System.out.println("Jumlah Tidak Lulus: " + tidakLulus);


        System.out.print("\nArray Sebelum diurutkan: ");
        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }


        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        System.out.print("\nArray Setelah diurutkan: ");
        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }
        System.out.println();

        input.close();
    }
}