package Exercicios;

import java.util.Random;

public class Exercicio08 {
    public static void main(String[] args) {
        int [] A = new int[10];
        int [] B = new int[10];
        int [] C = new int[B.length];

        for(int i = 0; i<A.length;i++){
            int inteiro = (int)(Math.random()*10);
            A[i] = inteiro;
        }
        for(int i = 0; i<B.length;i++){
            int inteiro = (int)(Math.random()*10);
            B[i] = inteiro;
        }
        for(int i = 0; i<C.length;i++){
            C[i] = A[i]*B[i];
        }
        System.out.println("Vetor C:");
        for(int i = 0; i<C.length; i++){
            System.out.println(C[i]);
        }
        System.out.println("-------------------");
    }
}
