/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exe2;

/**
 *
 * @author Pichau
 */
public class Encomenda {
    
    String tamanho;
    Double  enderecoDoRemetente;
    Double enderecoDestinatario ;
    Double distancia;
    Double valorEncomenda ;
    Double valorFrete ;

    Double calcFrete(){
        
        if(this.distancia<=50){
            if(this.tamanho.equals("P")){
                return (this.distancia*0.1)+ 3.0;
            
            }else if(this.tamanho.equals("G")){
               return (this.distancia*0.3)+ 3.0;
            }else{
                return (this.distancia*0.5)+ 3.0;
            }
        }else if(this.distancia<=200){
         if(this.tamanho.equals("P")){
                return (this.distancia*0.1)+ 5.0;
            
            }else if(this.tamanho.equals("G")){
               return (this.distancia*0.3)+ 5.0;
            }else{
                return (this.distancia*0.5)+ 5.0;
            }
            
        }else{
       if(this.tamanho.equals("P")){
                return (this.distancia*0.1)+ 7.0;
            
            }else if(this.tamanho.equals("G")){
               return (this.distancia*0.3)+ 7.0;
            }else{
                return (this.distancia*0.5)+ 7.0;
            }
            
        }
        
    }
    
}
