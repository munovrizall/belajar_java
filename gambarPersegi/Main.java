package com.gambarPersegi;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        int inputPanjang, inputLebar, luas;

        System.out.print("Panjang : ");
        inputPanjang = userInput.nextInt();
        System.out.print("lebar : ");
        inputLebar = userInput.nextInt();
        persegi(inputPanjang, inputLebar);

        luas(inputPanjang, inputLebar);

        System.out.println("Keliling = " + keliling(inputPanjang, inputLebar));
    }

    public static void persegi (int panjang, int lebar){

        for(int i = 0; i < lebar; i++){
            for(int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    private static void luas (int panjang, int lebar){
        int luas = panjang * lebar;
        System.out.println("Luas = " + luas);
    }

    private static int keliling (int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }
}
