package Exercicios;
import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {
        int[] A = new int[8];
        int[] B = new int[A.length*2];


        for(int i = 0; i<A.length;i++){
            int inteiro = (int)(Math.random() * 10);
            A[i] = inteiro;
        }
        for(int i = 0; i< B.length; i++){
            int inteiro = (int)(Math.random() * 10);
            B[i] = inteiro;
        }
        System.out.println("Vetor A: ");
        for(int i = 0; i<A.length;i++){
            System.out.println(A[i]);
        }
        System.out.println("----------------------");
        System.out.println("Vetor B");
        for(int i = 0; i< B.length; i++){
            System.out.println(B[i]);
        }
        System.out.println("-----------------------");

    }
}
