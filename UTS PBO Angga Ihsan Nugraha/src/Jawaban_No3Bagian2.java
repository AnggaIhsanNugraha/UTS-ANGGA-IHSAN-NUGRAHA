/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
public class Jawaban_No3Bagian2 {

 public static void main(String[] args) {
          
        int result1 = sum(100, 100);
        System.out.println(result1);
        
        System.out.println(sum(200, 200));
        
        System.out.println(hitung(100,"+",100));
        System.out.println(hitung(200, "-", 100));
        System.out.println(hitung(200, "salah", 100));
    }
    
    static int sum(int value1,int value2) {
        int total = value1 + value2;
        return total;
    }
    static int hitung(int value1, String operasi,int value2) {
        switch(operasi){
            case "+":
                return (value1 + value2);
            case "-":   
                return (value1 - value2);
            
            
        }
        return 0;
    }
    }