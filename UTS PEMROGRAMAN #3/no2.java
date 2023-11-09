import java.util.Scanner;
import java.text.DecimalFormat;

public class no2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input NPM Anda    : ");
        String npm = s.nextLine();
        System.out.print("Input Nama Anda   : ");
        String nama = s.nextLine();
        System.out.print("Tinggi Badan (CM) : ");
        double tinggiBadan = s.nextDouble();
        System.out.print("Berat Badan (KG)  : ");
        double beratBadan = s.nextDouble();
        
        System.out.println("------------------------------------");
        double bmi = beratBadan / Math.pow(tinggiBadan / 100, 2);

        String kategori;
        if (bmi < 18.5) {
            kategori = "Kekurangan BB";
        } else if (bmi >= 18.5 && bmi <= 24.99) {
            kategori = "Ideal";
        } else if (bmi >= 25.0 && bmi <= 29.99) {
            kategori = "Kelebihan BB";
        } else {
            kategori = "Obesitas";
        }

        DecimalFormat df = new DecimalFormat("#.00");
        String formattedBMI = df.format(bmi);

        System.out.println("BMI      : " + formattedBMI);
        System.out.println("Status   : " + kategori);

        s.close();
    }
}