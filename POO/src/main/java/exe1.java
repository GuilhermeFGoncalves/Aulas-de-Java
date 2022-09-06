
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pichau
 */
public class exe1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Confeitaria conf = new Confeitaria();
        Confeitaria boloUm = new Confeitaria();
        Confeitaria boloDois = new Confeitaria();
        Confeitaria boloTres = new Confeitaria();
         boloUm.sabor="Morango";
         boloUm.valor=100.0;
         boloUm.quantidadeVendida=100;
         
         
         boloDois.sabor="chocolate";
         boloDois.valor=50.0;
         boloDois.quantidadeVendida=100;
         
         boloTres.sabor="abacaxi";
         boloTres.valor=40.0;
         boloTres.quantidadeVendida=100;
            
           System.out.println("Escolha o bolo que deseja (moramgo. chocolate. abacaxi)");
           String sabor = in.nextLine();
           
           System.out.println("Escolha a quantidade comprada de bolo");
           Integer qtd = in.nextInt();
           
           if(sabor.equals("morango")){
               if(qtd<boloUm.quantidadeVendida){
                  boloUm.comprarBolo(qtd);
                   System.out.println("O bolo sabor "+ boloUm.sabor + " foi comprado " + qtd + " totalizando " + (boloUm.valor * qtd));
               }else{
                   System.out.println("Seu pedido passou da quantidade no estoque");
               }
            }
           if(sabor.equals("chocolate")){
               if(qtd<boloDois.quantidadeVendida){
                  boloDois.comprarBolo(qtd);
                  System.out.println("O bolo sabor "+ boloDois.sabor + " foi comprado " + qtd + " totalizando " + (boloDois.valor * qtd));

               }else{
                   System.out.println("Seu pedido passou da quantidade no estoque");
               }
            }
           if(sabor.equals("abacaxi")){
               if(qtd<boloTres.quantidadeVendida){
                  boloTres.comprarBolo(qtd);
                  System.out.println("O bolo sabor "+ boloTres.sabor + " foi comprado " + qtd + " totalizando " + (boloTres.valor * qtd));
               }else{
                   System.out.println("Seu pedido passou da quantidade no estoque");
               }
            }
           
           
        
        

        
    }
}
