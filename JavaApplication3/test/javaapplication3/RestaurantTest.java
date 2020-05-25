/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author Jamaiya FX
 */
public class RestaurantTest {
    private Restaurant restaurant;
    
    public RestaurantTest() {
    }
    
    @Before
    public void setUp() {
        restaurant = new Restaurant();
    }
    
    @After
    public void tearDown() {
        restaurant = null;
    }

    /**
     * Test of class Restaurant.
     */
    @Test
    public void testGetRestaurantName() {
//      Arrange
        final String restaurantName = "Restaurant name";
        final String restaurantMobile = "233249274";
        final String restaurantEmail = "restaurantname@email.com";
        
//      Act
        restaurant.setRestaurantName(restaurantName);
        restaurant.setRestaurantMobile(restaurantMobile);
        restaurant.setRestaurantEmail(restaurantEmail);
        
//      Assert
        Assert.assertEquals(restaurantName, restaurant.getRestaurantName());
        Assert.assertEquals(restaurantMobile, restaurant.getRestaurantMobile());
        Assert.assertEquals(restaurantEmail, restaurant.getRestaurantEmail());
    }
}
