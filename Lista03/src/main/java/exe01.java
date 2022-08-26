
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class exe01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        calculador calc = new calculador();
        System.out.println("Informe sua primeira nota");
        Double notaUm = in.nextDouble();
        
        System.out.println("Informe sua segunda nota");
        Double notaDois = in.nextDouble();
        Double calcMedia=calc.media(notaUm, notaDois);
        System.out.println("Sua media é de " + calcMedia);
        
        
        
    }
}
