public class PenggajianDemo {
    public static void main(String[] args) {

        System.out.println("=== UJI TUGAS BANGUN DATAR ===");

        // Membuat objek dengan parameter baru (String namaBangun, ...)
        BangunDatar lingkaran = new Lingkaran("Lingkaran", 7.0);
        BangunDatar persegi = new Persegi("Persegi", 5.0);
        BangunDatar persegiPanjang = new PersegiPanjang("Persegi Panjang", 8.0, 4.0);

        // Memanggil method tampilkanInfo() dari superclass
        lingkaran.tampilkanInfo();
        persegi.tampilkanInfo();
        persegiPanjang.tampilkanInfo();

        // Kode untuk urusan Gaji (Manager/Direktur) biarkan saja di bawahnya
        // jika Anda masih ingin menampilkannya, atau hapus jika fokus ke tugas ini.
    }
}