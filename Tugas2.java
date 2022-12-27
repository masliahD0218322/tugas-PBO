
package tugas2;
//NAMA: MASLIAH
//NIM : D0218322

import java.util.Scanner;


public class Tugas2 {

    
    public static void main(String[] args) {
      int pilihan,tambah,kurang,hasil,simpan;
      int saldo = 5000;
      
      Scanner input = new Scanner(System.in);
      while (true){
          System.out.println("------------=MENU ATM=------------");
          System.out.println("-1. LIHAT SALDO = ------------");
          System.out.println("-2. MENABUNG    = ------------");
          System.out.println("-3. MENGAMBIL   = ------------");
          System.out.println("-4. KELUAR      = ------------");
          System.out.println("------------=########=------------");
          System.out.println("Masukkan Pilihan Anda : ");
          pilihan = Integer.parseInt(input.next());
          
          switch (pilihan){
          case 1:
              System.out.println("Saldo anda adalah : Rp. "+saldo);
          break;
          case 2:
              System.out.println("Masukkan jumlah uang yang ingin anda tabung =Rp. ");
              tambah = input.nextInt();
              saldo += tambah;
              System.out.println("saldo anda adalah Rp. "+saldo);
          break;
          case 3:
              System.out.println("Masukkan jumlah uang yang ingin anda ambil = Rp. ");
              kurang = input.nextInt();
              System.out.println("Saldo anda adalah Rp. ");
              System.out.println(saldo - kurang);
              simpan = saldo - kurang;
          if (simpan<5000){
                  
              System.out.println("saldo anda adalah Rp. "+saldo +"batas minimal saldo Rp.5000");
          }else{
                System.out.println("Saldo anda adalah Rp. "+simpan);  
              }
          break;
          case 4:
              System.exit(0);
          break;
          default:
              System.out.println("Anda Harus Memilih Menu (1,2,3,4)");
          break;
          }
          
      }
    }
    
}
