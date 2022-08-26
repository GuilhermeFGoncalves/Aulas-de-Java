/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe04;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exe04 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        DescontoProgressivo desc=new DescontoProgressivo();
        System.out.println("Bem vindo ao sistema de desconto progressivo!");
        System.out.println("Qual o valor da unidade do produto");
        Double valor = in.nextDouble();
        
        System.out.println("Quanto produtos serao comprados");
        Double qtd = in.nextDouble();
        
        Double valorDesconto =desc.calcularDesconto(qtd,valor);
        
        desc.exibirNotalFiscal(valor, valorDesconto, qtd);
        
    }
    
}
