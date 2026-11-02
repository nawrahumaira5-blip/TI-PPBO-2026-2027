public class HewanDemo {
    public static void main(String[] args) {

        Kucing kucing = new Kucing("Mici");
        Anjing anjing = new Anjing("Mico");

        System.out.println("Nama Kucing: " + kucing.nama);
        kucing.bersuara();
        kucing.bergerak();

        System.out.println();

        System.out.println("Nama Anjing: " + anjing.nama);
        anjing.bersuara();
        anjing.bergerak();
    }
}