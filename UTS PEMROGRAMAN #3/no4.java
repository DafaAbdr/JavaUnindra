import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        try {
            File file = new File("pasien_rev.txt");

            Scanner scanner = new Scanner(file);

            System.out.println("======================================================================");
            System.out.println("ID PAS\tNAMA PASIEN\tKODE KAMAR\tLAMA INAP\tTOTAL BIAYA");
            System.out.println("======================================================================");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("_");
                String idPasien = parts[0];
                String kodeKamar = parts[1];
                int lamaInap = Integer.parseInt(parts[2]);
                String namaPasien = parts[3];

                int biayaHari;
                switch (kodeKamar) {
                    case "1":
                        biayaHari = 100000;
                        break;
                    case "2":
                        biayaHari = 250000;
                        break;
                    case "3":
                        biayaHari = 500000;
                        break;
                    default:
                        biayaHari = 0;
                }

                int totalBiaya = biayaHari * lamaInap;
                
                DecimalFormat decimalFormat = new DecimalFormat("#######.00");
                String formattedTotalBiaya = decimalFormat.format(totalBiaya);
                
                System.out.println(idPasien + "\t" + namaPasien + "\t" + kodeKamar + "\t\t" + lamaInap + "\t\t" + formattedTotalBiaya);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
    }
}