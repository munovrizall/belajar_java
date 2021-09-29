package com.programLuas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int panjang,lebar, luas;
        System.out.println("Selamat datang di program penghitung luas persegi");

        // Meminta panjang dari user
        System.out.print("Panjang = ");
        panjang = userInput.nextInt();

        // Meminta lebar dari user
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas persegi adalah " + luas);
    }
}
