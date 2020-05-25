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
public class OrderItemTest {
    private OrderItem orderItem;
    
    public OrderItemTest() {
    }
    
    @Before
    public void setUp() {
        orderItem = new OrderItem();
    }
    
    @After
    public void tearDown() {
        orderItem = null;
    }

    /**
     * Test of class OrderItem.
     */
    @Test
    public void testOrderItemClass() {
//      Arrange
        final String name = "food name";
        final String quantity = "3";
        final String unitPrice = "20";
        
//      Act
        orderItem.setName(name);
        orderItem.setQuantity(quantity);
        orderItem.setUnitPrice(unitPrice);
        
//      Assert
        Assert.assertEquals(name, orderItem.getName());
        Assert.assertEquals(quantity, orderItem.getQuantity());
        Assert.assertEquals(unitPrice, orderItem.getUnitPrice()); 
    }
}
