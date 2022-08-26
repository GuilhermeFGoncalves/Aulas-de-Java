/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe03;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class EXE03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Classificaldade clas=new Classificaldade();
        System.out.println("Qual a sua idade");
        Integer idade=in.nextInt();
        clas.calcularIdade(idade);
        
    }
    
}
