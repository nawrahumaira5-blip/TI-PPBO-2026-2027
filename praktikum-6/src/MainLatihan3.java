public class MainLatihan3 {
        public static void main(String[] args) {
            Produk hp = new Produk("Smartphone", 5000000);
            Produk mouse = new Produk("Mouse", 150000);

            // Cek apakah mahal (batas harga misal 1.000.000)
            boolean cekHp = hp.isMahal(1000000);
            boolean cekMouse = mouse.isMahal(1000000);

            System.out.println("Apakah " + hp.namaProduk + " mahal? " + cekHp);
            System.out.println("Apakah " + mouse.namaProduk + " mahal? " + cekMouse);
        }
    }

