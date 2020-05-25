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
public class NameTest {
    public Name name;
    
    public NameTest() {
    }
    
    @Before
    public void setUp() {
        name = new Name();
    }
    
    @After
    public void tearDown() {
        name = null;
    }

    /**
     * Test of class Name.
     */
    @Test
    public void testNameClass() {
//      Arrange
        final String firstName = "first name";
        final String lastName = "last name";
        
//      Act
        name.setFirstName(firstName);
        name.setLastName(lastName);
        
//      Assert
        Assert.assertEquals(firstName, name.getFirstName());
        Assert.assertEquals(lastName, name.getLastName());
        
    }
    
}
