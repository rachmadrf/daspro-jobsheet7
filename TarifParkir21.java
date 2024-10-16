import java.util.Scanner;

public class TarifParkir21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tarifMotor = 2000, tarifMobil = 3000, tarifTetap = 12500, tarifTotal = 0, jenisKendaraan;
        float durasi;

        while (true){
            System.out.print("Masukkan jenis kendaraan (1 = Motor / 2 = Mobil): ");
            jenisKendaraan = sc.nextInt();
            System.out.print("Masukkan durasi parkir (Jam): ");
            durasi = sc.nextFloat();
            sc.nextLine();

            if (durasi <= 0 || (jenisKendaraan < 1 || jenisKendaraan > 2)) {
                System.out.println("Input tidak valid. Masukkan kembali input yang valid!");
            } else {
                break;
            }
        }

        if (durasi <= 5) {
            if (jenisKendaraan == 1) {
                tarifTotal = (int) (durasi * tarifMotor);
            } else if (jenisKendaraan == 2) {
                tarifTotal = (int) (durasi * tarifMobil);
            }
        } else {
            tarifTotal = tarifTetap;
        }

        System.out.println("Total tarif parkir anda adalah sebesar: Rp." + tarifTotal);
    }
}