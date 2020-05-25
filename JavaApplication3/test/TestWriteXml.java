/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javaapplication3.WriteXml;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jamaiya FX
 */
public class TestWriteXml {
    private WriteXml writeXML;
    
    public TestWriteXml() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        writeXML = new WriteXml();
    }

    @Test
    public void writexmlTests() throws ParserConfigurationException, TransformerException{
//      Arrange
        final String success = "Xml Created succesfully";
        
//      Act
        final String actual = writeXML.main();
        
//      Assert
         Assert.assertEquals(success, actual);
    }
    
    @After
    public void tearDown() {
        writeXML = null;
    }
}
