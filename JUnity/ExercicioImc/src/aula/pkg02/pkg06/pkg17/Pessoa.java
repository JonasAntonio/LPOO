/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg02.pkg06.pkg17;

/**
 *
 * @author alunoces
 */
public class Pessoa {
    
    private String nome;
    private String sexo;
    private float peso;
    private float altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public String calcularIMC(){
        
        float imc = this.getPeso()*this.getAltura()*this.getAltura();
        
        
        if(sexo.equals("F")){ //1
            if(imc<19.1){ //2
                return "Abaixo do peso"; //3
            }
            else if(imc<25.8){ //4
                return "No peso normal"; //5
            }
            else if(imc<27.3){ //6
                return "Marginalmente acima do peso"; //7
            }
            else if(imc<32.3){ //8
                return "Acima do peso ideal"; //9
            }
            else {
                return "Obeso"; //10
            }
        }
        else{
            if(imc<20.7){ //11
                return "Abaixo do peso"; //12
            }
            else if(imc<26.4){ //13
                return "No peso normal"; //14
            }
            else if(imc<27.8){ //15
                return "Marginalmente acima do peso"; //16
            }
            else if(imc<31.1){ //17
                return "Acima do peso ideal"; //18
            }
            else {
                return "Obeso"; //19
            }
        }
        //20                
        
    }
    

    
}
