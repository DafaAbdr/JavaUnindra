import java.util.Scanner;
import java.text.DecimalFormat;

public class no1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        byte jumlahNasabah, i;
        int noRekening;
        String namaNasabah;
        double bunga, saldoAwal, saldoAkhir;

        System.out.print("Jumlah Nasabah : ");
        jumlahNasabah = s.nextByte();
        s.nextLine();
        
        System.out.println();
        System.out.println("=============================================================================");
        System.out.println();

        String[][] arrayNasabah = new String[jumlahNasabah][5];

        DecimalFormat df = new DecimalFormat("0.00");

        for (i = 0; i < jumlahNasabah; i++) {
            System.out.print("No. Rekening : ");
            noRekening = s.nextInt();
            s.nextLine();
            System.out.print("Nama Nasabah : ");
            namaNasabah = s.nextLine();
            System.out.print("Saldo Awal   : ");
            saldoAwal = s.nextDouble();
            s.nextLine();
            System.out.println();

            bunga = 0.0;

            if (saldoAwal >= 5000000) {
                bunga = 0.05;
            } else if (saldoAwal >= 3000000) {
                bunga = 0.03;
            } else if (saldoAwal >= 1000000) {
                bunga = 0.015;
            }

            saldoAkhir = saldoAwal + (saldoAwal * bunga);

            arrayNasabah[i][0] = Integer.toString(noRekening);
            arrayNasabah[i][1] = namaNasabah;
            arrayNasabah[i][2] = df.format(saldoAwal);
            arrayNasabah[i][3] = df.format(bunga);
            arrayNasabah[i][4] = df.format(saldoAkhir);
        }

        System.out.println("=============================================================================");
        System.out.println("                                  BANK XYZ                                   ");
        System.out.println("=============================================================================");
        System.out.println("No.Rekening \t Nama Nasabah \t Saldo Awal \t Bunga \t\tSaldo Akhir");
        System.out.println("=============================================================================");
        
        for (i = 0; i < jumlahNasabah; i++) {
            System.out.println(arrayNasabah[i][0] + "\t\t" + arrayNasabah[i][1] + "\t\t" + arrayNasabah[i][2] + "\t" + 
                               (Double.parseDouble(arrayNasabah[i][2]) * Double.parseDouble(arrayNasabah[i][3])) + "\t" + arrayNasabah[i][4]);
        }

        System.out.println("=============================================================================");
    }
}