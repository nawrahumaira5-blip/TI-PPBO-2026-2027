public class Buku {
        String judul;
        String pengarang;
        int tahunTerbit;

        // Constructor berparameter pakai 'this'
        public Buku(String judul, String pengarang, int tahunTerbit) {
            this.judul = judul;
            this.pengarang = pengarang;
            this.tahunTerbit = tahunTerbit;
        }

        // Method buat nampilin data (opsional biar rapi)
        public void tampilkanData() {
            System.out.println("Judul: " + judul + ", Pengarang: " + pengarang + ", Tahun: " + tahunTerbit);
        }
    }

