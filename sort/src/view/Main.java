/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.NumberlistController;
import model.Numberlist;

/**
 *
 * @author quocv
 */
public class Main {
      public static void main(String[] args) {
        Numberlist model = new Numberlist();
        View view = new View();
        NumberlistController controller = new NumberlistController(model, view);

        controller.addNumber(5);
        controller.addNumber(2);
        controller.addNumber(9);
        controller.addNumber(1);

        controller.displayNumbers();

        controller.sortNumbers();

        controller.displaySortedNumbers();
    }
}
