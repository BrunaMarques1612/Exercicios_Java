/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruna
 */

/* Exercício 02 - Faça um programa que resolva o somatório:A conta será repre-
sentada por:
                    (x+x²)+ (x+x²)+ ...
Explicação: Essa notação matemática utiliza a letra grega ∑ (Sigma) e permite re-
duzir o tamanho da representação de uma longa soma a uma única expressão. 
Veja o exemplo abaixo:
                    3+4+5+6+7+8+9+10+11+12+13+14
*/


public class Exercicio02 {
    
    public static void main(String[] args) {
        
        int soma = 3+4+5+6+7+8+9+10+11+12+13+14;

        System.out.println (soma);
        for(int i = 3; i<=14; i++)
            soma += i;
    }
}
    
