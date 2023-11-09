import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class no3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        byte digitNPM, lamaInap;
        String idPasien, namaPasien;
        char kodeKamar;

        System.out.print("Input Digit Terakhir NPM Anda : ");
        digitNPM = s.nextByte();
        s.nextLine();

        System.out.println("==========================================");
        System.out.println();

        String[][] arraynpm = new String[digitNPM][3];

        try {
            PrintWriter writer = new PrintWriter(new FileWriter("pasien_rev.txt"));

            if (digitNPM % 2 == 0) {
                for (int i = 0; i < 4; i++) {
                    System.out.print("ID Pasien   : ");
                    idPasien = s.nextLine();
                    System.out.print("Nama Pasien : ");
                    namaPasien = s.nextLine();
                    System.out.print("Kode Kamar  : ");
                    kodeKamar = s.nextLine().charAt(0);
                    System.out.print("Lama Inap   : ");
                    lamaInap = s.nextByte();
                    s.nextLine();
                    writer.println(idPasien+"_"+kodeKamar+"_"+lamaInap+"_"+namaPasien);
                    System.out.println();
                }
            } else {
                for (int i = 0; i < 3; i++) {
                    System.out.print("ID Pasien   : ");
                    idPasien = s.nextLine();
                    System.out.print("Nama Pasien : ");
                    namaPasien = s.nextLine();
                    System.out.print("Kode Kamar  : ");
                    kodeKamar = s.nextLine().charAt(0);
                    System.out.print("Lama Inap   : ");
                    lamaInap = s.nextByte();
                    s.nextLine();
                    writer.println(idPasien+"_"+kodeKamar+"_"+lamaInap+"_"+namaPasien);
                    System.out.println();
                }
            }
            System.out.println("==========================================");
            System.out.println("Selesai Menulis ke File");
            writer.close();
        } catch (IOException e) {
            System.out.println("==========================================");
            System.out.println("Gagal Menulis ke File");
            e.printStackTrace();
        }
    }    
}