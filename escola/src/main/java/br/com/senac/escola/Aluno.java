/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.escola;

/**
 *
 * @author henry61623916
 */
public class Aluno extends Pessoa {
    private int nota;
    private double media;
    
    public int getnota(){
        return this.nota;
    }
    public double getmedia(){
        return this.media;
    }
   
    public void setnota(int nota){
        this.nota = nota;
    }
    public void setmedia(double media){
        this.media = media;
                
    }
    public Aluno(int nota, double media, String nome, String endereco, int telefone){
        super(nome, endereco, telefone);
        this.nota = nota;
        this.media = media;
        
    }
    @Override
    public void apresentar(){
        System.out.println("Olà, sou aluno" + this.getnome());
    }
   
}
