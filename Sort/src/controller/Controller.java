package controller;


import java.util.ArrayList;

import model.Model;



public class Controller {
    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public int addNumber(int number) {
        model.addNumber(number);
        return number;
    }

    public void sortBubble() {
        model.sortBubble();
    }

    public void sortQuick() {
        model.sortQuick(0, model.getNumbers().size() - 1);
    }

    public void sortSelection() {
        model.sortSelection();
    }
    public void printNumbers() {
        ArrayList<Integer> numbers = model.getNumbers();
        System.out.println("Current ArrayList: " + numbers);
    }
}

