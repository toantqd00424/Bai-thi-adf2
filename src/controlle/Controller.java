/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlle;

import java.util.PriorityQueue;
import java.util.Scanner;
import newpackage.Passenger;

/**
 *
 * @author MSI
 */
public class Controller {
    
    static Passenger passenger = new Passenger();
    static PriorityQueue<Passenger> pq = new PriorityQueue<>();
    
    public void add() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Moi nhap thong tin");
        System.out.println("Nhập Id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên");
        String passengerName = scanner.nextLine();
        System.out.println("Nhập địa chỉ ");
        String address = scanner.nextLine();
        System.out.println("Nhập SDT");
        String phone = scanner.nextLine();
        System.out.println("Ngày đi và về");
        String date = scanner.nextLine();
        System.out.println("Tên :" + passengerName + "\nĐịa chỉ : " + address + "\nSĐT : " + phone + "\nNgày đi ngày về : " + date);
        
        
        Passenger passenger = new Passenger(id, passengerName, address, phone, date);
        pq.add(passenger);
        
    }
    
    public void modify() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            for (Passenger passenger : pq) {
                try {
                    int id;
                    String stringId = scanner.nextLine();
                    id = Integer.parseInt(stringId);
                    
                    if (id == passenger.getId()) {
                        pq.remove();
                        System.out.println("Nhập thông tin mới : ");
                        System.out.println("Nhập tên");
                        String passengerName = scanner.nextLine();
                        System.out.println("Nhập địa chỉ : ");
                        String address = scanner.nextLine();
                        System.out.println("Nhập số điện thoại : ");
                        String phone = scanner.nextLine();
                        System.out.println("Nhập ngày đi và về : ");
                        String date = scanner.nextLine();
                        System.out.println("Thông tin sau khi sửa : ");
                        System.out.println("\nTên :" + passengerName + "\nĐịa chỉ : " + address + "\nSĐT : " + phone + "\nNgày đi ngày về : " + date);
                        
                        passenger.setPassengerName(passengerName);
                        passenger.setAddress(address);
                        passenger.setPhone(phone);
                        passenger.setDate(date);
                        pq.add(passenger);
                        System.out.println("Sửa thành công...");
                        break;
                    } else {
                        System.out.println("không tìm thấy Id");
                    }
                    
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Chỉ nhập chữ số....");
                }
            }
            
        }
        
    }
    
    public void dislay() {
        for (Passenger passenger : pq) {
            System.out.println("ID : " + passenger.getId() 
                    + "\nTên : " + passenger.getPassengerName() 
                    + "\nĐịa chỉ : " + passenger.getAddress() 
                    + "\nSDT : " + passenger.getPhone() 
                    + "\nNgày đi và về : " + passenger.getDate());
        }
    }
}
