import java.util.Scanner;

public class KeretaApi {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    boolean lanjutBeli = true;

    while (lanjutBeli) {
      System.out.println("=== Program Pemesanan Tiket Kereta Api ===");
      System.out.println("Jurusan yang tersedia: ");
      System.out.println("1. Cikampek-Tuparev");
      System.out.println("2. Johar-Bypass");
      System.out.println("3. Klari-badami");

      System.out.print("Pilih jurusan (1-3): ");
      int pilihan = scan.nextInt();

      String jurusan = "";
      int harga = 0;

      switch (pilihan) {
        case 1:
          jurusan = "Cikampek-Tuparev";
          harga = 20000;
          break;
        case 2:
          jurusan = "Johar-Bypass";
          harga = 10000;
          break;
        case 3:
          jurusan = "Klari-badami";
          harga = 15000;
          break;
        default:
          System.out.println("Pilihan tidak valid");
          continue;
      }

      System.out.println("Anda telah memilih jurusan: " + jurusan);

      System.out.println("Pilih kelas: ");
      System.out.println("1. Bisnis");
      System.out.println("2. Executive");

      int pilihanKelas = scan.nextInt();

      String kelas = "";

      switch (pilihanKelas) {
        case 1:
          kelas = "Bisnis";
          break;
        case 2:
          kelas = "Executive";
          break;
        default:
          System.out.println("Pilihan tidak valid");
          continue;
      }

      System.out.println("Anda telah memilih kelas: " + kelas);

      System.out.print("Jumlah tiket yang ingin dipesan: ");
      int jumlahTiket = scan.nextInt();

      int totalHarga = harga * jumlahTiket;

      System.out.println("=== Detail Pemesanan ===");
      System.out.println("Jurusan: " + jurusan);
      System.out.println("Kelas: " + kelas);
      System.out.println("Jumlah tiket: " + jumlahTiket);
      System.out.println("Total harga: Rp" + totalHarga);

      System.out.println(" Silahkan lakukan pembayaran di tempat pembayaran yang tersedia. ");

      System.out.print("Apakah ingin membeli tiket lain? (Y/T): ");
      String jawaban = scan.next();

      lanjutBeli = jawaban.equalsIgnoreCase("Y");
    }

    System.out.println("Terima kasih telah menggunakan program pemesanan tiket kereta api!");
  }
}
