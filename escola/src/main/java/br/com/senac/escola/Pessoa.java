/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.escola;

/**
 *
 * @author henry61623916
 */
public class Pessoa {
    private String nome;
    private String endereco;
    private int telefone;
    
    public String getnome(){
        return this.nome;
    }
    public String getendereço(){
        return this.endereco;
    }
    public int gettelefone(){
        return this.telefone;
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }
    public void setendereço(String endereço){
        this.endereco = endereço;
    }
    public void settelefone(int telefone){
        this.telefone = telefone;
    }
    
    public Pessoa(String nome,String endereço, int telefone){
    this.nome = nome;
    this.endereco = endereço;
    this.telefone = telefone;
}
    
    
   public void apresentar(){
       
   }
}
