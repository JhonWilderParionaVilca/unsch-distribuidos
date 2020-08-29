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
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HelloThread t001 = new HelloThread(10);
        t001.start();
        HelloThread t002 = new HelloThread(100);
        t002.start();
        System.out.println("This code is outside of the thread"); //la respuesta no sale ordenado y siempre sale una diferente posición
    }

}
