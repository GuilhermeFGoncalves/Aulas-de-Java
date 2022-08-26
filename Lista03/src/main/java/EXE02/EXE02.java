/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXE02;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class EXE02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ClassesSociais classe=new ClassesSociais();
        
        System.out.println("Qual a sua renda?");
        Double renda=in.nextDouble();
        Double media =classe.qtdSalariosMinimos(renda);
       String frase= classe.checarClasse(media);
        System.out.println("Sua classe é "+ frase);
        
        
    }
    
}
