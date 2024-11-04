/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg5;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Latihan_30 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input:");
        System.out.print("Kamu ngerjain sendiri latihan 17 sampai latihan 30 ini? ");
        String jawab = scanner.nextLine();

        System.out.println("\nOutput:");
        System.out.print("Kamu ngerjain sendiri latihan 17 sampai latihan 30 ini? ");
        
        if (jawab.equalsIgnoreCase("ya") || jawab.equalsIgnoreCase("yoi")) {
            System.out.println("Jawab (Yoi/Enggak) : yoi");
            System.out.println("Cakep Bener. Good Job");
            System.out.println("BUILD SUCCESSFUL (total time: 8 seconds)");
        } else {
            System.out.println("Jawab (Yoi/Enggak) : ENGGAK");
            System.out.println("Tetep cakep sih.");
            System.out.println("Tapi jangan sampe konsep nya yes.");
            System.out.println("Keep the code works dude.");
        }
    }
}
