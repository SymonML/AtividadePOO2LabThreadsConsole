/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.appcadastro.labthreadsconsole;

public class LabThreadsConsole {

    public static void main(String[] args) {
        Contador contador = new Contador();

        Thread thread1 = new Thread(new Processador(contador));
        Thread thread2 = new Thread(new Processador(contador));
        Thread thread3 = new Thread(new Processador(contador));

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Erro ao esperar as threads");
        }
        System.out.println("Valor final do contador é " + contador.Quantidade());
    }
}