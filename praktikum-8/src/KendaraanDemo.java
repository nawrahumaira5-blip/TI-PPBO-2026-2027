public class KendaraanDemo {
    public static void main(String[] args) {

        // Latihan 2
        Mobil mobil = new Mobil("Toyota", 180, 4);
        Motor motor = new Motor("Honda", 120, "Matic");

        System.out.println("=== DATA MOBIL ===");
        System.out.println("Merek: " + mobil.merek);
        System.out.println("Kecepatan Maksimum: " + mobil.kecepatanMaks);
        System.out.println("Jumlah Pintu: " + mobil.jumlahPintu);

        System.out.println("\n=== DATA MOTOR ===");
        System.out.println("Merek: " + motor.merek);
        System.out.println("Kecepatan Maksimum: " + motor.kecepatanMaks);
        System.out.println("Jenis Motor: " + motor.jenisMotor);


        // Latihan 3
        System.out.println("\n=== MEMBUAT MOBIL ===");
        Mobil mobil2 = new Mobil("Honda", 200, 4);

        System.out.println("\n=== MEMBUAT MOTOR ===");
        Motor motor2 = new Motor("Yamaha", 150, "Sport");


        // Latihan 4
        System.out.println("\n=== LATIHAN 4 ===");
        mobil.tampilkanInfo();

    }
}