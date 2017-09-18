/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author MSI
 */
public class Passenger {

   
    
    
    private int id;
    private String passengerName;
    private String address;
    private String phone;
    private String date;

    public Passenger() {
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

   
    
  

    public Passenger(int id, String passengerName, String address, String phone, String date) {
        this.id = id;
        this.passengerName = passengerName;
        this.address = address;
        this.phone = phone;
        this.date = date;
    }

  

   
   

    
}
