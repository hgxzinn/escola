/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.escola;

/**
 *
 * @author henry61623916
 */
public class Prof extends Pessoa {
    private int salario;
    private double ncontrato;

    public int getsalario() {
        return this.salario;
    }

    public double getncontrato() {
        return this.ncontrato;
    }

    public void setsalario(int salario) {
        this.salario = salario;
    }

    public void setncontrato(double ncontrato) {
        this.ncontrato = ncontrato;
    }

    public Prof(int salario, double ncontrato, String nome, String endereco, int telefone) {
        super(nome, endereco, telefone);
        this.salario = salario;
        this.ncontrato = ncontrato;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, sou professor " + this.getnome());
    }
}
