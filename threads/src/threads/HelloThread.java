/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author bh
 */
public class HelloThread extends Thread {

    int valor = 0;

    public HelloThread(int valor) {
        this.valor = valor;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            valor++;
            System.out.println("This code is running in a thread . . ." + valor);
        }
    }

}
