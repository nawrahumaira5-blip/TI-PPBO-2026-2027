import java.util.Scanner;

public class KalkulatorBangunDatar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input panjang dan lebar
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = sc.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = sc.nextDouble();

        // Menghitung luas dan keliling
        double luasPersegiPanjang = panjang * lebar;
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        // Menampilkan hasil persegi panjang
        System.out.println("\n=== Persegi Panjang ===");
        System.out.println("Panjang = " + panjang);
        System.out.println("Lebar = " + lebar);
        System.out.println("Luas = " + luasPersegiPanjang);
        System.out.println("Keliling = " + kelilingPersegiPanjang);

        // Input jari-jari lingkaran
        System.out.print("\nMasukkan jari-jari lingkaran: ");
        double jariJari = sc.nextDouble();

        // Menghitung luas dan keliling lingkaran
        double luasLingkaran = Math.PI * jariJari * jariJari;
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        // Menampilkan hasil lingkaran
        System.out.println("\n=== Lingkaran ===");
        System.out.println("Jari-jari = " + jariJari);
        System.out.println("Luas = " + luasLingkaran);
        System.out.println("Keliling = " + kelilingLingkaran);

        // Mengecek luas persegi panjang
        boolean luasBesar = luasPersegiPanjang > 100;

        System.out.println("\n=== Pengecekan Luas ===");
        System.out.println("Apakah luas persegi panjang > 100? " + luasBesar);

        // Menutup Scanner
        sc.close();
    }
}