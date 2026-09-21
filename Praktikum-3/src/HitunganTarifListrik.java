import java.util.Scanner;

public class HitunganTarifListrik {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Konstanta tarif per kWh untuk setiap golongan daya (tentukan sendiri nilainya)
        final double TARIF_450 = 415.0;
        final double TARIF_900 = 1352.0;
        final double TARIF_1300 = 1444.70;
        final double TARIF_2200 = 1444.70;
        final double TARIF_DI_ATAS_2200 = 1700.0; // Contoh tarif untuk golongan di atas 2200 VA

        System.out.println("=========================================");
        System.out.println("   PROGRAM HITUNG TARIF LISTRIK (PLN)    ");
        System.out.println("=========================================");

        // 1) Membaca input golongan daya listrik pelanggan dalam VA
        System.out.println("Pilihan Golongan Daya (VA):");
        System.out.println("1. 450");
        System.out.println("2. 900");
        System.out.println("3. 1300");
        System.out.println("4. 2200");
        System.out.println("5. Di atas 2200");
        System.out.print("Masukkan golongan daya (contoh: 450, 900, 1300, 2200, atau 2300): ");
        int golonganDaya = scanner.nextInt();

        // 2) Membaca input jumlah pemakaian listrik dalam kWh
        System.out.print("Masukkan jumlah pemakaian listrik (kWh): ");
        double pemakaianKWh = scanner.nextDouble();

        // 4) Validasi menggunakan operator logika agar menolak input kWh negatif atau nol
        if (pemakaianKWh <= 0) {
            System.out.println("\n[ERROR] Input tidak valid!");
            System.out.println("Jumlah pemakaian kWh harus lebih besar dari 0 (nol).");
            System.out.println("Program dihentikan.");
        } else {
            // Variabel untuk menyimpan tarif yang akan digunakan
            double tarifPerKWh = 0;
            String namaGolongan = "";

            // 3) Menghitung total tagihan berdasarkan tarif per kWh yang berbeda
            // Menggunakan switch-case untuk menentukan golongan
            switch (golonganDaya) {
                case 450:
                    tarifPerKWh = TARIF_450;
                    namaGolongan = "450 VA";
                    break;
                case 900:
                    tarifPerKWh = TARIF_900;
                    namaGolongan = "900 VA";
                    break;
                case 1300:
                    tarifPerKWh = TARIF_1300;
                    namaGolongan = "1300 VA";
                    break;
                case 2200:
                    tarifPerKWh = TARIF_2200;
                    namaGolongan = "2200 VA";
                    break;
                default:
                    // Jika input bukan 450, 900, 1300, atau 2200, diasumsikan di atas 2200
                    if (golonganDaya > 2200) {
                        tarifPerKWh = TARIF_DI_ATAS_2200;
                        namaGolongan = "Di atas 2200 VA";
                    } else {
                        // Menangani input golongan yang tidak valid (misal: 500, 1000)
                        System.out.println("\n[ERROR] Golongan daya tidak dikenali!");
                        System.out.println("Pastikan Anda memasukkan angka 450, 900, 1300, 2200, atau >2200.");
                        System.out.println("Program dihentikan.");
                        scanner.close();
                        return; // Keluar dari program
                    }
                    break;
            }

            // Menghitung total tagihan
            double totalTagihan = pemakaianKWh * tarifPerKWh;

            // 5) Menampilkan hasil akhir dalam format yang rapi
            System.out.println("\n=========================================");
            System.out.println("           RINCIAN TAGIHAN LISTRIK       ");
            System.out.println("=========================================");
            System.out.printf("Golongan Daya       : %s%n", namaGolongan);
            System.out.printf("Jumlah Pemakaian    : %.2f kWh%n", pemakaianKWh);
            System.out.printf("Tarif per kWh       : Rp %.2f%n", tarifPerKWh);
            System.out.println("-----------------------------------------");
            System.out.printf("TOTAL TAGIHAN       : Rp %.2f%n", totalTagihan);
            System.out.println("=========================================");
        }

        // Menutup scanner
        scanner.close();
    }
}