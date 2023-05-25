/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

public class PalindromicPrime {
    public static int palindrome(int n) {
        int reversedInteger = 0, remainder, originalInteger;
        originalInteger = n;
        while (n != 0) {
            remainder = n % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            n /= 10;
        }
        if (originalInteger == reversedInteger)
            return 0;
        else
            return 1;
    }

    public static int isPrime(int x) {
        for (int divisor = 2; divisor <= x / 2; divisor++) {
            if (x % divisor == 0)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int num = 1, k = 2;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                while (k > num) {
                    num = k;
                    if (palindrome(num) == 0) {
                        if (isPrime(num) == 1) {
                            System.out.print(+num + " ");
                            k++;
                            break;
                        } else
                            k++;
                    } else
                        k++;
                }
            }
            System.out.println("");
        }
    }
}
