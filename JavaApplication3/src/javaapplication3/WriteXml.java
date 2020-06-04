/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 *
 * @author Aremu Oluwaseyi Festus(https://github.com/Dev-Rem)
 */
public class WriteXml {
    
//    Specify file path of xml file to be created
//      Can be changed to a local file path on your machine
public static final String filePath = "C:\\Users\\user\\Desktop\\school\\"
        + "JavaApplication3\\src\\javaapplication3\\receipt.xml";    

public static String WriteToXml() throws ParserConfigurationException, 
        TransformerException{
  try{
//      Create an instance of DocumentBuilder Factory
        DocumentBuilderFactory documentFac = DocumentBuilderFactory.newInstance();

//      Instance of DocumentBuilder 
        DocumentBuilder documentBuilder = documentFac.newDocumentBuilder();

//      Instance of Doccument 
        org.w3c.dom.Document xmldocument = documentBuilder.newDocument();

//      Instance of Address class 
        Address customerAddress1 = new Address("streetname","cityname",
                "country name","postal code");

//      Instance of OrderInfo class
        OrderInfo orderInfo = new OrderInfo("Some customer comment","Delivery");

//      Instance of Name
        Name customerName = new Name("firstname", "lastname");

//      Instance of OrderItem class
        OrderItem orderItem = new OrderItem("food name ","3","20");

//      Instance of Restaurant class
        Restaurant restaurant1 = new Restaurant("restuarant name", 
                "mobile number","restaurantname@email.com","streetname",
                "city name","country name","postal code");

//      Create root element
        org.w3c.dom.Element root = xmldocument.createElement("receipt");
        xmldocument.appendChild(root); 

        org.w3c.dom.Element customerDetails = xmldocument.createElement("customerdetails");
        customerDetails.setAttribute("id","1");
        root.appendChild(customerDetails);

//      Create first name element
        org.w3c.dom.Element firstName = xmldocument.createElement("firstname");
        firstName.appendChild(xmldocument.createTextNode(customerName.getLastName()));
        customerDetails.appendChild(firstName);

//      Create last name element
        org.w3c.dom.Element lastName = xmldocument.createElement("lastname");
        lastName.appendChild(xmldocument.createTextNode(customerName.getFirstName()));
        customerDetails.appendChild(lastName);            

//      Create postal code element
        org.w3c.dom.Element customerPC = xmldocument.createElement("postalcode");
        customerPC.appendChild(xmldocument.createTextNode(customerAddress1.getPostalCode()));
        customerDetails.appendChild(customerPC);           

//      Create street name element
        org.w3c.dom.Element streetName = xmldocument.createElement("streetname");
        streetName.appendChild(xmldocument.createTextNode(customerAddress1.getStreet()));
        customerDetails.appendChild(streetName);

//      Create city element
        org.w3c.dom.Element cityName = xmldocument.createElement("cityname");
        cityName.appendChild(xmldocument.createTextNode(customerAddress1.getCity()));
        customerDetails.appendChild(cityName);

//      Create country name element
        org.w3c.dom.Element countryName = xmldocument.createElement("countryname");
        countryName.appendChild(xmldocument.createTextNode(customerAddress1.getCountry()));
        customerDetails.appendChild(countryName);

//      Create order type element
        org.w3c.dom.Element orderType = xmldocument.createElement("ordertype");
        orderType.appendChild(xmldocument.createTextNode(orderInfo.getOrderType()));
        customerDetails.appendChild(orderType);            

//      Create customer comment element
        org.w3c.dom.Element customerComment = xmldocument.createElement("comment");
        customerComment.appendChild(xmldocument.createTextNode(orderInfo.getComment()));
        customerDetails.appendChild(customerComment);            

//      Create order item root element
        org.w3c.dom.Element orderItems = xmldocument.createElement("orderitems");
        root.appendChild(orderItems);

//      Create item root element
        org.w3c.dom.Element item = xmldocument.createElement("item");
        item.setAttribute("id","1");
        orderItems.appendChild(item);

//      Create item name elemen
        org.w3c.dom.Element itemName = xmldocument.createElement("name");
        itemName.appendChild(xmldocument.createTextNode(orderItem.getName()));
        item.appendChild(itemName);   

//      Create item quantity element
        org.w3c.dom.Element itemQnty = xmldocument.createElement("quantity");
        itemQnty.appendChild(xmldocument.createTextNode(orderItem.getQuantity()));
        item.appendChild(itemQnty);     

//      Create item quantity element
        org.w3c.dom.Element itemUnitPrice = xmldocument.createElement("unitprice");
        itemUnitPrice.appendChild(xmldocument.createTextNode(orderItem.getUnitPrice()));
        item.appendChild(itemUnitPrice);

//      Create restaurant details root element
        org.w3c.dom.Element restaurantDetails = xmldocument.createElement("restaurantdetails");
        root.appendChild(restaurantDetails);

//      Create restaurant name element
        org.w3c.dom.Element restaurantName = xmldocument.createElement("name");
        restaurantName.appendChild(xmldocument.createTextNode(restaurant1.getRestaurantName()));
        restaurantDetails.appendChild(restaurantName);

//      Create restaurant postal code element
        org.w3c.dom.Element restaurantPC = xmldocument.createElement("postalcode");
        restaurantPC.appendChild(xmldocument.createTextNode(restaurant1.getPostalCode()));
        restaurantDetails.appendChild(restaurantPC);    

//      Create restaurant street name element
        org.w3c.dom.Element restaurantSN = xmldocument.createElement("streetname");
        restaurantSN.appendChild(xmldocument.createTextNode(restaurant1.getStreet()));
        restaurantDetails.appendChild(restaurantSN);

//      Create restaurant city element
        org.w3c.dom.Element restaurantCN = xmldocument.createElement("cityname");
        restaurantCN.appendChild(xmldocument.createTextNode(restaurant1.getCity()));
        restaurantDetails.appendChild(restaurantCN);

//      Create country name element
        org.w3c.dom.Element restaurantCountry = xmldocument.createElement("countryname");
        restaurantCountry.appendChild(xmldocument.createTextNode(restaurant1.getCountry()));
        restaurantDetails.appendChild(restaurantCountry);

//      Create restaurant email elemnent
        org.w3c.dom.Element restaurantEmail = xmldocument.createElement("email");
        restaurantEmail.appendChild(xmldocument.createTextNode(restaurant1.getRestaurantEmail()));
        restaurantDetails.appendChild(restaurantEmail);

//      Create restaurant mobile element
        org.w3c.dom.Element restaurantMobile = xmldocument.createElement("mobile");
        restaurantMobile.appendChild(xmldocument.createTextNode(restaurant1.getRestaurantMobile()));
        restaurantDetails.appendChild(restaurantMobile);

           
//       Create  TransformerFactory instance
         TransformerFactory transFactory = TransformerFactory.newInstance();
         transFactory.setAttribute("indent-number", 5);
          
//       Create new Transformer instance
         Transformer transformer = transFactory.newTransformer();
         transformer.setOutputProperty(OutputKeys.INDENT, "yes");
         
//       Create DOMSource instance
         DOMSource domSource = new DOMSource(xmldocument);
         
//       Create  StreamResult instance
         StreamResult streamResult = new StreamResult(new File(filePath));
         transformer.transform(domSource,streamResult);
         System.out.println("Xml Created succesfully");
               

        }
//       catch ParserConfigurationException
  catch (ParserConfigurationException pce) {
        }        
    return "Xml Created succesfully";
     
    }
        
}
