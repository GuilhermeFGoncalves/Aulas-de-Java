/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe2;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class exe2 {
    public static void main(String[] args) {
        Encomenda calc = new Encomenda();
         Encomenda ticket = new Encomenda();
        Scanner in = new Scanner(System.in);
            System.out.println("Qual é o valor da encomenda");
            ticket.valorEncomenda = in.nextDouble();

            System.out.println("Qual é o tamanho da encomenda");
            ticket.tamanho = in.nextLine();
        
            System.out.println("Qual é o endereco do remetente");
            ticket.enderecoDoRemetente = in.nextDouble();
        

            System.out.println("Qual é o endereco do destinatario");
            ticket.enderecoDestinatario = in.nextDouble();
            
            ticket.distancia=(ticket.enderecoDestinatario-ticket.enderecoDoRemetente);
            
           ticket.valorFrete= ticket.calcFrete();
            System.out.println("****ETIQUETA PARA ENVIO*****");
            System.out.println("Endereço do remente :"+ ticket.enderecoDoRemetente);
            System.out.println("Endereço do destinatario:"+ ticket.enderecoDestinatario);
            System.out.println("Tamanho"+ ticket.tamanho);
            System.out.println("----------------------");
            System.out.println("Valor encomenda R$"+ ticket.valorEncomenda);
            System.out.println("Valor frete R$"+ ticket.valorFrete);
            System.out.println("----------------------");
            System.out.println("Valor final R$"+ (ticket.valorFrete+ticket.valorEncomenda));

        
        
        
    }
    
}
