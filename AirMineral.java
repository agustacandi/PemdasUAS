/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemdasuas;

import java.util.Scanner;

/**
 *
 * @author candiagusta
 */
public class AirMineral {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sudah minum air mineral hari ini?");
        String jawaban = scan.nextLine();
        System.out.println();
        System.out.print("Anda meminum berapa gelas hari ini?");
        int gelasAir = scan.nextInt();

        if (jawaban.equals("ya")) {
            if (gelasAir > 0) {
                if (gelasAir == 1 || gelasAir == 2) {
                    System.out.println("Ayo minum lebih banyak");
                } else if (gelasAir == 3 || gelasAir == 4) {
                    System.out.println("Ayo minum lebih banyak");
                } else if (gelasAir == 5 || gelasAir == 6) {
                    System.out.println("Konsumsi air mineral anda kurang dua atau satu gelas lagi");
                } else if (gelasAir == 7 || gelasAir == 8) {
                    System.out.println("Konsumsi air mineral anda tercukupi");
                } else {
                    System.out.println("Anda kelebihan meminum air mineral hari ini!");
                }
            } else {
                System.out.println("Anda belum meminum segelas air");
            }
        } else {
            System.out.println("Silahkan minum air mineral terlebih dahulu agar sehat!");
        }
    }
}
