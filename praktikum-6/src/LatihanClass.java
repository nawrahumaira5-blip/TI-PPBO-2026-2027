public class LatihanClass {
    public static void main(String[]args){
        Mahasiswa m1 = new Mahasiswa();

        m1.nama ="budi";
        m1.nim = "12345";
        m1.ipk = 3.75;


        Mahasiswa m2 = new Mahasiswa();
        m2.nama = "Siti";
        m2.nim = "67890";
        m2.ipk = 3.90;

        System.out.println(m1.nama + " - " + m1.ipk);
        System.out.println(m2.nama + " - " + m2.ipk);


        System.out.println("nama: "+ m1. nama);
        System.out.println("nim:"+ m1.nim);
        System.out.println("ipk:"+m1.ipk);
    }
}
