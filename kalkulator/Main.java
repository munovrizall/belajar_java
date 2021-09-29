package com.kalkulator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner inputUser = new Scanner(System.in);
        int a, b, hasil;
        char operator;
        System.out.println("Selamat datang di program kalkulator sederhana\n");

        // Untuk mendapatkan input dari user

        System.out.print("Masukkan angka pertama : ");
        a = inputUser.nextInt();

        System.out.print("Pilih operator (+, -, *, /) : ");
        operator = inputUser.next().charAt(0);

        System.out.print("Masukkan angka kedua : ");
        b = inputUser.nextInt();

        // Untuk mendapatkan hasil
        if (operator == '+'){

            hasil = a + b;
            System.out.println("Hasil = " + hasil);

        } else if (operator == '-'){

            hasil = a - b;
            System.out.println("Hasil = " + hasil);

        } else if (operator == '*'){

            hasil = a * b;
            System.out.println("Hasil = " + hasil);

        } else if (operator == '/'){

            // Nested if karena semua angka yang dibagi 0 hasilnya 1

            if (b == 0){
                hasil = 1;
                System.out.println("Hasil = " + hasil);

            } else {
                hasil = a/ b;
                System.out.println("Hasil = " + hasil);

            }

        } else {
            System.out.println("Operator yang dimasukkan salah");
        }


    }

}
