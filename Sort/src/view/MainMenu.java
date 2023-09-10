package view;

import java.util.Scanner;

import controller.Controller;

public class MainMenu extends Menu {
    Scanner scanner = new Scanner(System.in);
    private Controller controller;

    public MainMenu(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void display() {
        System.out.println("1. Add Number");
        System.out.println("2. Sort using Bubble Sort");
        System.out.println("3. Sort using Quick Sort");
        System.out.println("4. Sort using Selection Sort");
        System.out.println("5. Exit");
        controller.printNumbers();
    }

    @Override
    public int execute(int n) {
        switch (n) {
            case 1:
                // Nhập số từ người dùng và thêm vào danh sách
                int number = scanner.nextInt();
                controller.addNumber(number);
                break;
            case 2:
                controller.sortBubble();
                break;
            case 3:
                controller.sortQuick();
                break;
            case 4:
                controller.sortSelection();
                break;
            case 5:
                // Thoát khỏi chương trình
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        return n;
    }

    

}

