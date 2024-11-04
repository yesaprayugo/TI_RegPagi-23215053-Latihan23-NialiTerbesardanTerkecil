/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author Dell
 */
import java.util.Scanner;

public class NilaiTerbesarTerkecil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Petugas: ");
        String namaPetugas = scanner.nextLine();

        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        int banyakNilai = scanner.nextInt();

        int nilaiTerbesar = Integer.MIN_VALUE;
        int nilaiTerkecil = Integer.MAX_VALUE;

        for (int i = 1; i <= banyakNilai; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + i + ": ");
            int nilai = scanner.nextInt();

            nilaiTerbesar = Math.max(nilaiTerbesar, nilai);
            nilaiTerkecil = Math.min(nilaiTerkecil, nilai);
        }

        System.out.println("\n-------->Hasil Nilai Mahasiswa<---------");
        System.out.println("Nilai Terbesar adalah: " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah: " + nilaiTerkecil);
        System.out.println("Petugas: " + namaPetugas);
    }
}
        