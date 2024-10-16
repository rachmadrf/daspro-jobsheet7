import java.util.Scanner;

public class Bioskop21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int hargaTiket = 50000, totalHarga, jmlTiket = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket: ");
            jmlTiket = sc.nextInt();

            if (jmlTiket < 0) {
                System.out.println("Input tidak valid. Masukkan kembali input yang valid!");
            } else {
                break;
            }
        }

        if (jmlTiket > 4 && jmlTiket <= 10) {
            totalHarga = (int) (jmlTiket * hargaTiket - ((jmlTiket * hargaTiket) * 0.10));
            System.out.println("Total harga + diskon 10%: " + totalHarga);
        } else if (jmlTiket > 10) {
            totalHarga = (int) (jmlTiket * hargaTiket - ((jmlTiket * hargaTiket) * 0.15));
            System.out.println("Total harga + diskon 15%: " + totalHarga);
        } else {
            totalHarga = (jmlTiket * hargaTiket);
            System.out.println("Total harga: " + totalHarga);
        }
    }
}