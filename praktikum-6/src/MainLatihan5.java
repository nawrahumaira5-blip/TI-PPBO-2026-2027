public class MainLatihan5 {
        public static void main(String[] args) {
            // Array of object Persegi minimal 4 ukuran
            Persegi[] daftarPersegi = new Persegi[4];
            daftarPersegi[0] = new Persegi(4);
            daftarPersegi[1] = new Persegi(12);
            daftarPersegi[2] = new Persegi(7);
            daftarPersegi[3] = new Persegi(9);

            // Logika nyari nilai maksimum (Luas Terbesar)
            double luasTerbesar = 0;
            Persegi persegiTerbesar = null;

            for (int i = 0; i < daftarPersegi.length; i++) {
                double luasSekarang = daftarPersegi[i].hitungLuas();

                // Bandingin
                if (luasSekarang > luasTerbesar) {
                    luasTerbesar = luasSekarang;
                    persegiTerbesar = daftarPersegi[i];
                }
            }

            // Tampilkan hasil
            System.out.println("--- Pencarian Luas Terbesar ---");
            if (persegiTerbesar != null) {
                System.out.println("Luas Terbesar adalah: " + luasTerbesar);
                System.out.println("Dimiliki oleh persegi dengan sisi: " + persegiTerbesar.sisi);
            }
        }
    }

