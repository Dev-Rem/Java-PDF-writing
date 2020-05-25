/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Aremu Oluwaseyi Festus(https://github.com/Dev-Rem)
 */
public class Restaurant extends Address {
  
    private String restaurantName;
    private String restaurantMobile;
    private String restaurantEmail;
    
    public Restaurant(){}
    
    public Restaurant(String restaurantName, String restaurantMobile, 
            String restaurantEmail, String street, String city, String country, 
            String postalCode) {
        
        super(street, city, country, postalCode);
        this.restaurantName = restaurantName;
        this.restaurantMobile = restaurantMobile;
        this.restaurantEmail = restaurantEmail;
    }
    
    


    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantMobile() {
        return restaurantMobile;
    }

    public void setRestaurantMobile(String restaurantMobile) {
        this.restaurantMobile = restaurantMobile;
    }

    public String getRestaurantEmail() {
        return restaurantEmail;
    }

    public void setRestaurantEmail(String restaurantEmail) {
        this.restaurantEmail = restaurantEmail;
    }  
    
}
