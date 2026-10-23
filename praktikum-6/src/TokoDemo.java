public class TokoDemo {
    public static void main(String[] args) {
        System.out.println("=== DAFTAR SELURUH PRODUK ===");
        System.out.println("---------------------------------------");

        // Perhatikan: Di sini kita panggil 'Product', bukan 'Produk'
        Product produk1 = new Product("P001", "Laptop ASUS ROG", 150000.0, 5);

        Product produk2 = new Product("", "", 0.0, 0);
        produk2.setKodeProduk("P002");
        produk2.setNamaProduk("Mouse Logitech");
        produk2.setHarga(350000.0);
        produk2.setStok(20);

        // Tampilkan datanya!
        produk1.tampilkanInfo();
        produk2.tampilkanInfo();
    }
}