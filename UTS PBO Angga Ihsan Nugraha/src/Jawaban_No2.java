/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Angga Ihsan Nugraha
 */
public class Jawaban_No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai = 80;
        int absen = 30;
        
        boolean lulusNilai = nilai >= 75;
        boolean lulusAbsen = absen >= 75;
        
        boolean lulus = lulusNilai && lulusAbsen;
        
    if (nilai >=75 && absen >=75){
            // waktu diawal variable diatas pada saat di run sebelumnya absen <=75 tercantum lulus dengan nilai E
            // setelah diganti jadi <=75 tercantum tidak lulus dengan nilai E
        System.out.println("Selamat Anda Lulus");
    }
    else {
        System.out.println("Silahkan Coba Lagi Tahun Depan");
                }
    if (nilai >= 80 && absen >=80){
        System.out.println("Nilai Anda A");
            
    } else if  (nilai >=70 && absen >=70){
        System.out.println("Nilai Absen Anda B");
            
    }else if  (nilai >=60 && absen >=60){
        System.out.println("Nilai Absen Anda C");
    }else if  (nilai >=50 && absen >=50){
        System.out.println("Nilai Absen Anda D");
    }else {
        System.out.println("Nilai Anda E");
    }
}
}