public class PerusahaanDemo {
    public static void main(String[] args) {

        // Membuat objek Manager
        Manager mgr = new Manager(
                "Budi", "M001", 8000000, 2000000
        );

        // Membuat objek Staff
        Staff stf = new Staff(
                "Ani", "S001", 4000000, 1000000
        );

        // Membuat objek Direktur
        Direktur dir = new Direktur(
                "Andi", "D001", 15000000, 5000000, 3000000
        );

        // Menampilkan data Manager
        System.out.println("=== DATA MANAGER ===");
        mgr.tampilkanData();
        System.out.printf("Tunjangan Jabatan: %.0f%n",
                mgr.getTunjanganJabatan());

        // Menampilkan data Staff
        System.out.println("\n=== DATA STAFF ===");
        stf.tampilkanData();
        System.out.printf("Tunjangan Kinerja: %.0f%n",
                stf.getTunjanganKinerja());

        // Menampilkan data Direktur
        System.out.println("\n=== DATA DIREKTUR ===");
        dir.tampilkanData();
        System.out.printf("Tunjangan Jabatan: %.0f%n",
                dir.getTunjanganJabatan());
        System.out.printf("Tunjangan Direktur: %.0f%n",
                dir.getTunjanganDirektur());

        // Menguji validasi gaji negatif
        System.out.println("\n=== UJI VALIDASI GAJI ===");
        Pegawai pgw = new Pegawai(
                "Rina", "P001", -500000
        );

        pgw.tampilkanData();
    }
}