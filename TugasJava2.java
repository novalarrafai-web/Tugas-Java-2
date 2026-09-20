import java.util.Scanner;

public class TugasJava2 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai mahasiswa: ");
        int nilai = input.nextInt();
        while (nilai > 100 || nilai < 0) {
            System.out.println("Error: Nilai anda tidak valid. Nilai harus antara 0 dan 100.");
            System.out.print("Masukkan nilai mahasiswa: ");
            nilai = input.nextInt();
        }
        if (nilai >= 85 && nilai <= 100) {
            System.out.println("Predikat A");
        } else if (nilai >= 70 && nilai <= 84) {
            System.out.println("Predikat B");
        } else if (nilai >= 55 && nilai <= 69) {
            System.out.println("Predikat C");
        } else if (nilai >= 40 && nilai <= 54) {
            System.out.println("Predikat D");
        } else {
            System.out.println("Predikat E");
        }

        input.close();
    }
}
