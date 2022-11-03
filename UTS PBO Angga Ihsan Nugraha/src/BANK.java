/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class BANK {
    int saldoPribadi;
    int total;
    
    BANK(int saldo){
        saldoPribadi = saldo;
    }

    void getsaldo(){
        System.out.println("Selamat Datang DiBank Rakyat");
        System.out.println("Saldo anda sisa : Rp." + saldoPribadi);
         }
    void simpanUang (int simpan){
        total = simpan + saldoPribadi;
        System.out.println("Simpan uang : " + simpan);
        System.out.println("Saldo anda sisa : Rp." + total);
    }
    void ambilUang (int ambil){
        if (ambil < saldoPribadi){
        saldoPribadi -= ambil ;
        System.out.println("Ambil uang : " + ambil);
         System.out.println("Saldo anda sisa : Rp." +saldoPribadi);
        
    } else  {
            System.out.println("Maaf saldo anda tidak cukup");
        }
    
}
   
    
    
}
    

