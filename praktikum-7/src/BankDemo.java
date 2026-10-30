public class BankDemo {
    public static void main(String[] args) {

        RekeningBank rek1 = new RekeningBank("001", "Budi", 100000, "Tabungan");
        RekeningBank rek2 = new RekeningBank("002", "Andi", 50000, "Giro");

        System.out.println("=== KONDISI AWAL ===");
        rek1.cetakMutasi();
        rek2.cetakMutasi();

        System.out.println("\n=== UJI COBA SETOR & TARIK (Masing-masing rekening) ===");
        rek1.setor(50000);
        rek1.tarik(30000);
        rek1.tarik(500000);

        rek2.setor(-1000);

        System.out.println("\n=== UJI COBA TRANSFER ===");


        rek1.transferKe(rek2, -50000);

        rek1.transferKe(rek2, 200000);


        rek1.transferKe(rek2, 50000);

        System.out.println("\n=== MUTASI AKHIR KEDUA REKENING ===");

        rek1.cetakMutasi();
        rek2.cetakMutasi();
    }
}