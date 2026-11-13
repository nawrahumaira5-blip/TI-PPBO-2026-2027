public class BangunDatar {
    // Atribut baru sesuai tugas poin (a)
    protected String namaBangun;

    public BangunDatar(String namaBangun) {
        this.namaBangun = namaBangun;
    }

    public double hitungLuas() {
        return 0;
    }

    public double hitungKeliling() {
        return 0;
    }

    // Method baru sesuai tugas poin (c)
    public void tampilkanInfo() {
        // Karena hitungLuas & hitungKeliling dipanggil dari sini,
        // Java akan otomatis menggunakan rumus dari subclass masing-masing (Polimorfisme).
        System.out.println("Nama Bangun : " + namaBangun);
        System.out.printf("Luas        : %.2f\n", hitungLuas());
        System.out.printf("Keliling    : %.2f\n", hitungKeliling());
        System.out.println("-----------------------------------");
    }
}