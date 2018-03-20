/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions.string.to.integer;

import java.util.Scanner;

/**
 *
 * @author Shalika
 */
public class ExceptionsStringToInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        try {
        int a=Integer.parseInt(s);
            System.out.println(a);
        } catch (Exception e) {
            System.err.println("Bad String");
        }
                
    }
}
