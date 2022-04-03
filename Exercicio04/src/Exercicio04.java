/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruna
 */
import java.util.Scanner;

/* Exercício 04 - Desenvolva um algoritmo em Java que leia um número inteiro e 
imprima o seu sucessor e antecessor.
Se o número for 35, a saída será: 
                “O antecessor de 35 é 34”.
                “O sucessor de 35 é 36”.
*/

public class Exercicio04 {

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int num=0, ant =0, suc=0;
       
        System.out.println("Insira um número");
        num = entrada.nextInt();
        suc = num + 1;
        ant = num -1;
       
        System.out.println("O antecessor é: "+ant);
        System.out.println("O sucessor é: "+suc);
       
    }
}