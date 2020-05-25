/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Jamaiya FX
 */
public class WriteXmlTest {
    private WriteXml writeXML;
    
    public WriteXmlTest() {
        
    }
    
    @Before
    public void setUp() {
        writeXML = new WriteXml();
    }
    
    @After
    public void tearDown() {
        writeXML = null;
    }

    /**
     * Test of main method, of class WriteXml.
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws javax.xml.transform.TransformerException
     */
    
    @Test
    public void writexmlTests() throws ParserConfigurationException, TransformerException{
//      Arrange
        final String success = "Xml Created succesfully";
        
//      Act
        final String actual;
        actual = writeXML.WriteToXml();
        
//      Assert
         Assert.assertEquals(success, actual);
    }
    
    
}
