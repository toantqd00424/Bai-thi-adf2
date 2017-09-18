/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlle;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Menu {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.createMenu();
    }

    private void createMenu() {
        while (true) {            
            System.out.println("===========>Menu<===========");
            System.out.println("1. Add reservation");
            System.out.println("2. Modify passenger records");
            System.out.println("3. Dislay passenger records");
            System.out.println("4. Exit");
            System.out.println("=================================================");
            Scanner scanner = new Scanner(System.in);
            String strChoice = scanner.nextLine();
            
            int choice = 0;
            try {
                choice = Integer.parseInt(strChoice);
                
            } catch (NumberFormatException e) {
                System.err.println("Nhap chu so...");
                continue;
            }
            Controller controller = new Controller();
            if (choice == 4) {
                break;
            } else {
                switch (choice) {
                    case 1 :
                        controller.add();
                        break;
                    case 2 :    
                        System.out.println("Nhập id cần sửa thông tin ");
                        controller.modify();
                        break;
                    case 3 :
                        controller.dislay();
                        break;
                    default:
                        System.out.println("Chỉ nhập số từ 1 đến 4 ");
                        break;
                   
                        
                }
            }
        }
    }
}
