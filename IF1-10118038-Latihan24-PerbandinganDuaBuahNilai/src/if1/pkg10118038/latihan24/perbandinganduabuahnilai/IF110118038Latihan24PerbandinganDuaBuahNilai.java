/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan24.perbandinganduabuahnilai;
import java.util.Scanner;
/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Perbandingan Dua Buah Nilai 
 */
public class IF110118038Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========Program Perbandigan Nilai========");
        String ok = "Ya";
        while(ok.equals("Ya")) {
            System.out.print("\n" + "Masukkan Nilai Pertama : ");
            int nilaiPertama = sc.nextInt();
            System.out.print("Masukkan Nilai Kedua : ");
            int nilaiKedua = sc.nextInt();
            System.out.print(nilaiPertama);
            if(nilaiPertama < nilaiKedua)
                System.out.print(" Lebih kecil dari ");
            else if (nilaiPertama > nilaiKedua) 
                System.out.print(" Lebih besar dari ");
            else 
                System.out.print(" Sama dengan ");
            System.out.println(nilaiKedua);
            System.out.print("\n" + "Ulangi Aktifitas ? (Ya/Tidak) : ");
            ok = sc.next();
            }
      } 
}
