import java.util.Scanner;

public class BilanganBulat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan bulat: ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println (bilangan +  "adalah Bilangan Genap ");
        } else {
            System.out.println( bilangan +" adalahBilangan Ganjil ");
        }
        input.close();

    }
}