/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafall2017.test;

import java.util.Arrays;

/**
 *
 * @author againes
 */
public class App {
    String [] args;
    App(String[] _args){
        args = _args;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        App app = new App(args);
        app.run();
       
    }
    
    void run() throws Exception {
        System.out.println("args: " + Arrays.toString(args));
    }
}
