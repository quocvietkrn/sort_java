/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author quocv
 */

// Tạo một lớp để biểu diễn Model (Danh sách số nguyên):
public class Numberlist {


    private List<Integer> numbers;

    public Numberlist(){
        numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void sortNumbers() {
        // Sử dụng thuật toán sắp xếp chọn (selection sort)
        int n = numbers.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numbers.get(j) < numbers.get(minIndex)) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                // Hoán đổi các phần tử
                int temp = numbers.get(i);
                numbers.set(i, numbers.get(minIndex));
                numbers.set(minIndex, temp);
            }
        }
    }
}

