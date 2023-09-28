/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo2.pkg41822010104.latihan22;
import java.util.Scanner;
/**
 *
 * @author SALSA NURUL LAELI
 * Nama : Salsa Nurul Laeli
 * NIM  : 41822010104
 */
public class PBO241822010104Latihan22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Format Tugas PBO");
        Scanner input = new Scanner(System.in);

        System.out.println("=====Perhitungan Lingkaran=====");
        double diameter = 0;
        boolean inputValid = false;
        while (!inputValid) {
            System.out.print("Masukan nilai diameter lingkaran : ");
            String inputDiameter = input.next();
            
            try {
                diameter = Double.parseDouble(inputDiameter);
                inputValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai");
            }
        }
        
        double jariJari = diameter / 2;
        double luas = Math.PI * Math.pow(jariJari, 2);
        double keliling = 2 * Math.PI * jariJari;

        System.out.println("\n=====Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-jari Lingkaran = " + jariJari + " cm");
        System.out.println("Luas Lingkaran = " + String.format("%.2f", luas) + " cm");
        System.out.println("Keliling Lingkaran = " + String.format("%.2f", keliling) + " cm");
        
        System.out.println("\nDeveloped by: Salsa Nurul Laeli");

    }
    }
