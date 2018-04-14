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
    private double peso;
    private double altura;

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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public String calcularIMC(){
        String condicao;
        double imc = this.getPeso()/(this.getAltura()*this.getAltura());
        
        if(getSexo().equals("F")){                         //1
            if(imc < 19.1){                                //2
                condicao = "Abaixo do peso";               //3
            }
            else if(imc <= 25.8){                          //4
                condicao = "No peso normal";               //5
            }
            else if(imc <= 27.3){                          //6
                condicao = "Marginalmente acima do peso";  //7
            }
            else if(imc <= 32.3){                          //8
                condicao = "Acima do peso ideal";          //9
            }
            else {
                condicao = "Obeso";                        //10
            }
        }
        else{
            if(imc <= 20.7){                               //11
                condicao = "Abaixo do peso";               //12
            }
            else if(imc <= 26.4){                          //13
                condicao = "No peso normal";               //14
            }
            else if(imc <= 27.8){                          //15
                condicao = "Marginalmente acima do peso";  //16
            }
            else if(imc <= 31.1){                          //17
                condicao = "Acima do peso ideal";          //18
            }
            else {
                condicao = "Obeso";                        //19
            }
        } 
        return condicao;                                   //20
    }
}
