/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.escola;

/**
 *
 * @author henry61623916
 */
public class Escola {

    public static void main(String[] args) {
        Prof professor = new Prof (10000.55, 98765432, "Ana" , "ceicity", 040028922 );
        Prof.apresentar();
        
        Aluno aluno = new Aluno (6, 6.5, "Andre", "ceicity", 040028933 );
        Aluno.apresentar();
    }
              
    }

