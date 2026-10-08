import java.util.Scanner;

public class StudiKasus2_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkatJuara = 0;
        int statusPendanaanPKM = 0;

        System.out.print("Nama mahasiswa : ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKROMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Jumlah dokumen : ");
        jumlahDokumen = sc.nextInt();


        if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Masukkan Status Pendanaan PKM (1 = Lolos, 0 = Tidak Lolos): ");
            statusPendanaanPKM = sc.nextInt();

            if (statusPendanaanPKM == 1) {
                if (jumlahDokumen == 4) {
                    System.out.println("\n--- Hasil Validasi ---");
                    System.out.println("Nama Mahasiswa : " + nama);
                    System.out.println("Status         : Memperoleh Dana Penghargaan");
                    System.out.println("Alasan         : Program PKM lolos pendanaan dan dokumen lengkap.");
                } else {
                    System.out.println("\n--- Hasil Validasi ---");
                    System.out.println("Nama Mahasiswa : " + nama);
                    System.out.println("Status         : Tidak Memperoleh Dana Penghargaan");
                    System.out.println("Alasan         : Dokumen tidak lengkap (Masih kurang " + (4 - jumlahDokumen) + " dokumen).");
                }
            } else {
                System.out.println("\n--- Hasil Validasi ---");
                System.out.println("Nama Mahasiswa : " + nama);
                System.out.println("Status         : Tidak Memperoleh Dana Penghargaan");
                System.out.println("Alasan         : Program PKM tidak lolos pendanaan.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
                   jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
                   jenisKegiatan.equalsIgnoreCase("Mandiri")) {
            
            System.out.print("Masukkan Peringkat Juara (1, 2, 3, atau 0 jika bukan juara): ");
            peringkatJuara = sc.nextInt();

            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("\n--- Hasil Validasi ---");
                    System.out.println("Nama Mahasiswa : " + nama);
                    System.out.println("Status         : Memperoleh Dana Penghargaan");
                    System.out.println("Alasan         : Meraih juara " + peringkatJuara + " dan dokumen lengkap.");
                } else {
                    System.out.println("\n--- Hasil Validasi ---");
                    System.out.println("Nama Mahasiswa : " + nama);
                    System.out.println("Status         : Tidak Memperoleh Dana Penghargaan");
                    System.out.println("Alasan         : Dokumen tidak lengkap (Masih kurang " + (4 - jumlahDokumen) + " dokumen).");
                }
            } else {
                System.out.println("\n--- Hasil Validasi ---");
                System.out.println("Nama Mahasiswa : " + nama);
                System.out.println("Status         : Tidak Memperoleh Dana Penghargaan");
                System.out.println("Alasan         : Hanya peraih Juara 1, 2, atau 3 yang berhak mendapat dana.");
            }

        } else {
            System.out.println("\n--- Hasil Validasi ---");
            System.out.println("Nama Mahasiswa : " + nama);
            System.out.println("Status         : Tidak Memperoleh Dana Penghargaan");
            System.out.println("Alasan         : Jenis kegiatan di luar ketentuan penyerahan dana penghargaan.");
        }

        sc.close();
        

    }
}

