/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;

/**
 *
 * @author quocv
 */
public class View {
    public void displayNumbers(List<Integer> numbers) {
        System.out.println("Danh sách số nguyên:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public void displaySortedNumbers(List<Integer> numbers) {
        System.out.println("Danh sách số nguyên đã được sắp xếp:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
