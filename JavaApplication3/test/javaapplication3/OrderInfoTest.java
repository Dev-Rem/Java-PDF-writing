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
public class OrderInfoTest {
    private OrderInfo orderInfo;
    
    public OrderInfoTest() {
    }
    
    @Before
    public void setUp() {
        orderInfo = new OrderInfo();
    }
    
    @After
    public void tearDown() {
        orderInfo = null;
    }

    /**
     * Test of class OrderInfo.
     */
    @Test
    public void testOrderInfoClass() {
//      Arrange
        final String comment = "Some Comment";
        final String orderType = "Delivery";

//      Act
        orderInfo.setComment(comment);
        orderInfo.setOrderType(orderType);
        
//      Assert
        Assert.assertEquals(comment, orderInfo.getComment());
        Assert.assertEquals(orderType, orderInfo.getOrderType());
       
    }
}
