/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
public class Jawaban_No3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] values = {80, 50, 50, 50, 80};
    sayCongrats("Eko", values);

    sayCongrats("Budi", 80, 90, 76, 80);

  }

  static void sayCongrats(String name, int... values) {
    int total = 0;
    for (int value : values) {
      total += value;
    }
    int finalValue = total / values.length;

    if (finalValue >= 75) {
      System.out.println("Selamat " + name + ", Anda Lulus");
    } else {
      System.out.println("Maaf " + name + ", Anda Tidak Lulus");
    }
  }
} 
    
 
