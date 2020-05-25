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
public class CustomerDetailTest {
    private CustomerDetail customerDetail;
    
    public CustomerDetailTest() {
    }
    
    @Before
    public void setUp() {
        customerDetail = new CustomerDetail();
    }
    
    @After
    public void tearDown() {
        customerDetail = null;
    }

    @Test
    public void TestCustomerDetailsClass(){
//      Arrange
        final String firstName = "firstname";
        final String lastName =  "lastname";
        final String orderType = "order type";
        final String comment = "some comment";
        
//      Act
        customerDetail.setFirstName(firstName);
        customerDetail.setLastName(lastName);
        customerDetail.setOrderType(orderType);
        customerDetail.setComment(comment);
        
//      Assert
        Assert.assertEquals(firstName, customerDetail.getFirstName());
        Assert.assertEquals(lastName, customerDetail.getLastName());
        Assert.assertEquals(orderType, customerDetail.getOrderType());
        Assert.assertEquals(comment, customerDetail.getComment());
    }
}
