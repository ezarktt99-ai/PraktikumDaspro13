import java.util.Scanner;

public class StudiKasus1_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

          System.out.print("Masukkan jumlah cup :");
        jumlahCup = sc.nextInt();

        System.out.print("Masukkan uang bayar :");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >=100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.print("Total harga :");
        totalHarga = sc.nextInt();
        System.out.print("Diskon :");
        diskon = sc.nextInt();
        System.out.print("Total bayar :");
        totalBayar = sc.nextInt();

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.print("kembalian : Rp." + kembalian );

        }else {
            kurang = totalBayar - uangBayar;
            System.out.print("Uang tidak cukup, kurang Rp." + kurang);

        }

        sc.close();


      


    }
}