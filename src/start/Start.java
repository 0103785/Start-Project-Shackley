/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import java.util.Scanner;
/**
 *
 * @author Owner
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String txt;
        int i;
        Scanner in = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Hello World!");
        txt = in.next();
        System.out.println(txt);
        i = Integer.parseInt(txt);
        System.out.println(i);
    }
    
}
