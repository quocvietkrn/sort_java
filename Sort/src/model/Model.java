/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author quocv
 */




public class Model {
    
    private ArrayList<Integer> numbers;

    public Model() {
        numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void sortBubble() {
        int n = numbers.size();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (numbers.get(i - 1) > numbers.get(i)) {
                    Collections.swap(numbers, i - 1, i);
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public void sortQuick(int left, int right) {
        if (left < right) {
            int pivotIndex = partition(left, right);
            sortQuick(left, pivotIndex - 1);
            sortQuick(pivotIndex + 1, right);
        }
    }

    private int partition(int left, int right) {
        int pivot = numbers.get(right);
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (numbers.get(j) < pivot) {
                i++;
                Collections.swap(numbers, i, j);
            }
        }
        Collections.swap(numbers, i + 1, right);
        return i + 1;
    }

    public void sortSelection() {
        int n = numbers.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numbers.get(j) < numbers.get(minIndex)) {
                    minIndex = j;
                }
            }
            Collections.swap(numbers, i, minIndex);
        }
    }
}


    


