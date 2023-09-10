/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author quocv
 */

import java.util.Scanner;

public abstract class Menu<T> {

    public abstract void display();

    public abstract int execute(int n);

    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            display();
            int n = sc.nextInt();
            execute(n);
        }
    }

    

}
