/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;

import controller.Controller;
import model.Model;
import view.MainMenu;
/**
 *
 * @author quocv
 */
public class Main {
    
    public static void main(String[] args) {
        
        

        Model model = new Model();
        Controller controller = new Controller(model);
        MainMenu menu = new MainMenu(controller);
       
        menu.run();
    }
}

