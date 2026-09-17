import java.util.Scanner;

public class HargaTiketBioskop{
    public static void main(String[] args){
        Scanner input = new
                Scanner(System.in);

        System.out.println("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("apakah mahasiswa? (true/false): ");
        boolean mahasiswa = input.nextBoolean();

        int harga;

        if(mahasiswa && umur < 25) {
            harga = 30000;
        }else{
            harga = 50000;
        }
        System.out.println("harga tiket: Rp" + harga);
    }
}