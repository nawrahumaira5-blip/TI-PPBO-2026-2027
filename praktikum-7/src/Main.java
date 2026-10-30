public class Main {
    public static void main(String[] args) {

        // ==========================================
        // 1 & 2. UJI COBA CLASS BUKU
        // ==========================================
        System.out.println("=== UJI COBA CLASS BUKU ===");
        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        System.out.println("Judul Awal    : " + buku1.getJudul());
        System.out.println("Tahun Terbit  : " + buku1.getTahunTerbit());
        buku1.setJudul("Bumi Manusia");
        System.out.println("Judul Baru    : " + buku1.getJudul());
        System.out.println();


        // ==========================================
        // 3. UJI COBA CLASS WAKTU
        // ==========================================
        System.out.println("=== UJI COBA CLASS WAKTU ===");
        Waktu w = new Waktu();
        System.out.println("-- Uji Input Jam --");
        w.setJam(25); // Ditolak
        w.setJam(12); // Diterima

        System.out.println("-- Uji Input Menit --");
        w.setMenit(70); // Ditolak
        w.setMenit(45); // Diterima

        System.out.println("-- Uji Input Detik --");
        w.setDetik(99); // Ditolak
        w.setDetik(30); // Diterima

        System.out.println("Waktu Tersimpan: " + w.getJam() + ":" + w.getMenit() + ":" + w.getDetik());
        System.out.println();


        // ==========================================
        // 4. UJI COBA CLASS SISWA
        // ==========================================
        System.out.println("=== UJI COBA CLASS SISWA ===");
        Siswa s = new Siswa();

        System.out.println("-- Uji Nilai 110 (Ditolak) --");
        s.setNilai(110);

        System.out.println("-- Uji Nilai 85 (Diterima) --");
        s.setNilai(85);
        System.out.println("Nilai Huruf  : " + s.getNilaiHuruf());
        System.out.println();


        // ==========================================
        // 5. UJI COBA CLASS PRODUK (VERSI LENGKAP)
        // ==========================================
        System.out.println("=== UJI COBA CLASS PRODUK ===");
        Produk p = new Produk();


        p.setKodeProduk("PRD-001");
        p.setNamaProduk("Keyboard Mechanical");

        System.out.println("\n-- Uji Validasi Harga --");
        p.setHarga(-5000);
        p.setHarga(1500000);

        System.out.println("\n-- Uji Validasi Tambah Stok --");
        p.tambahStok(-10);
        p.tambahStok(10);

        System.out.println("\n-- Uji Validasi Kurang Stok --");
        p.kurangStok(-5);
        p.kurangStok(15);
        p.kurangStok(4);


        System.out.println("\n-- Info Produk Akhir --");
        System.out.println("Kode Produk  : " + p.getKodeProduk());
        System.out.println("Nama Produk  : " + p.getNamaProduk());
        System.out.printf("Harga        : Rp %,.2f\n", p.getHarga());
        System.out.println("Sisa Stok    : " + p.getStok());
    }
}