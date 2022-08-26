/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe03;

/**
 *
 * @author Aluno
 */
public class Classificaldade {
    
    void calcularIdade(Integer idade){
        if(idade>60){
            System.out.println("Idoso");
        }else if(idade>=31){
            System.out.println("adulto");
        }else if(idade>=20){
            System.out.println("Jovem");
        }else if(idade>=12){
            System.out.println("Adolescente");
        }else if(idade>=3){
            System.out.println("Criança");
        }else{
            System.out.println("Bebe");
        }
    
    }
    
}
