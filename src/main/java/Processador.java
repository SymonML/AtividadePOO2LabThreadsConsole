/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Syminho
 */
package com.appcadastro.labthreadsconsole;

public class Processador implements Runnable {
    private Contador contador;
            
    public Processador (Contador contador){
        this.contador = contador;
    }
    @Override
    public void run(){
        for (int i = 0; i < 100; i++){
            contador.Incrementar();
        }
    }
}    
