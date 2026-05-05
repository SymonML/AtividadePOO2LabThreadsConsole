/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Syminho
 */
package com.appcadastro.labthreadsconsole;

public class Contador {
    private int quantidade = 0;

    public void Incrementar() {
        try {
            int atual = this.quantidade;
            
            Thread.sleep(2);
            this.quantidade = atual + 1;
        } catch (InterruptedException e) {
            System.out.println("Thread interrompida!!!");
        }
    }
    public int Quantidade() {
        return quantidade;
    }

} 
