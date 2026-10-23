public class Produk {
        String namaProduk;
        double harga;

        public Produk(String namaProduk, double harga) {
            this.namaProduk = namaProduk;
            this.harga = harga;
        }

        // Method boolean isMahal
        public boolean isMahal(double batasHarga) {
            return this.harga > batasHarga;
        }
    }

