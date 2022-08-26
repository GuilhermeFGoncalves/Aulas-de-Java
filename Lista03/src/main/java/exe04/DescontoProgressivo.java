/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe04;

/**
 *
 * @author Aluno
 */
public class DescontoProgressivo {
    Double calcularDesconto(Double qtd, Double valor){
        Double valorTotal = qtd * valor;
        if(qtd>=3){
         return (valorTotal*0.3)-valorTotal;
          }else if(qtd>=2){
          return (valorTotal*0.2)-valorTotal;
          }else {
          return (valorTotal*0.1)-valorTotal;
          }
    }
   void   exibirNotalFiscal(Double valor,Double valorDesconto,Double qtd){
        System.out.println("---------------------");
        System.out.println("Valor do produto: R$"+valor);
        System.out.println("Quantidade: "+  qtd);
        System.out.println("---------------------");
        System.out.println("Valor com desconto: R$ "+valorDesconto);

    }
}
