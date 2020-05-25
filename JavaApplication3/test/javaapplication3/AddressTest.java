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
public class AddressTest {
    private Address address;
    
    public AddressTest() {
    }
    
    @Before
    public void setUp() {
        address = new Address();
    }
    
    @After
    public void tearDown() {
        address = null;
    }
    @Test
     public void TestAddressClass(){
//      Arrange
        final String street = "Street name";
        final String city = "City name";
        final String country = "Country name";
        final String postalCode = "Postal code";
        
//      Act 
        address.setStreet(street);
        address.setCity(city);
        address.setPostalCode(postalCode);
        address.setCountry(country);
        
//      Assert
        Assert.assertEquals(street, address.getStreet());
        Assert.assertEquals(city, address.getCity());
        Assert.assertEquals(country, address.getCountry());
        Assert.assertEquals(postalCode, address.getPostalCode());
        
    }
}