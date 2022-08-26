/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXE02;

/**
 *
 * @author Aluno
 */
public class ClassesSociais {


    
    String checarClasse(Double renda){
        if(renda>20){
        return "Classe A";
        }else if(renda>10){
        return "Classe B";
        }else if(renda>4){
        return "Classe C";
        }else if(renda>2){
        return "Classe D";
        }else{
        return "Classe E";
        }
    }
   Double qtdSalariosMinimos(Double renda){
         return renda/1045;
    }
       
    
}
