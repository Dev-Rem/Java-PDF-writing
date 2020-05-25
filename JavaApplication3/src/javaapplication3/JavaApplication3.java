/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;

import java.io.FileOutputStream;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.DocumentBuilder;  

import org.w3c.dom.NodeList;  
import org.w3c.dom.Node;    
import java.io.File;  
import java.util.ArrayList;

/**
 *
 * @author Aremu Oluwaseyi Festus(https://github.com/Dev-Rem)
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     * @throws javax.xml.transform.TransformerConfigurationException
     */
    
    
    public static void main(String[] args) throws TransformerConfigurationException, 
        TransformerException {
//      Define file path where pdf will be created
    	String FILE_NAME = "C:\\Users\\user\\Desktop\\receipt.pdf";
        
//      Create an instance of Document()
        Document document = new Document();
        
//       Path of xml file to be read
        String filePath = "C:\\Users\\user\\Desktop\\school\\JavaApplication3\\src"
                + "\\javaapplication3\\receipt.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        
        try{  
            
            dBuilder = dbFactory.newDocumentBuilder();
//          Parse xml file
            org.w3c.dom.Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
           
           
            NodeList nodeListCD = doc.getElementsByTagName("customerdetails");
            NodeList nodeListOI = doc.getElementsByTagName("orderitems");
            NodeList nodeListRD = doc.getElementsByTagName("restaurantdetails");
            
//          Now XML is loaded as Document in memory, lets convert it to Object List
            ArrayList<CustomerDetail> detailList = new ArrayList<>();
            ArrayList<ItemOrdered> itemList = new ArrayList<>();
            ArrayList<Restaurant> restaurantDetailList = new ArrayList<>();
            
            for (int i = 0; i < nodeListCD.getLength(); i++) {
                detailList.add(customerDetail(nodeListCD.item(i)));
            }
            for (int i = 0; i < nodeListOI.getLength(); i++) {
                itemList.add(itemOrdered(nodeListOI.item(i)));
            }
            for (int i = 0; i < nodeListRD.getLength(); i++) {
                restaurantDetailList.add(restaurantDetail(nodeListRD.item(i)));
            }

//         Get an instance of PDFWriter
           PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
           
//          Open pdf document
            document.open();
            
//          Create an instance of Font() class
            Font bold = new Font(FontFamily.TIMES_ROMAN, 12, Font.BOLD);
            Font italic = new Font(FontFamily.HELVETICA, 8, Font.ITALIC);
            
//          Create pdf title paragraph
//          Create an instance of Paragraph()
            Paragraph title = new Paragraph();
            
//          Add text to the paragraph
            title.setFont(bold);
            title.add("RECEIPT");
//          Align text
            title.setAlignment(Element.ALIGN_CENTER);
//          Add paragraph to document
            document.add(title);
            
            
//          Line break paragrapgh
            Paragraph space = new Paragraph();
            space.add(" ");
            document.add(space);
            
            
//          Sub title paragraph
            Paragraph subTitle = new Paragraph();
            subTitle.setFont(bold);
            subTitle.add("ORDER DETAILS");
            subTitle.setAlignment(Element.ALIGN_LEFT);
            document.add(subTitle);
            
//          Add line break
            document.add(space);
            
//           Customer Information paragraph
            Paragraph customerInfo = new Paragraph();
            customerInfo.add("Customer Information");
            customerInfo.setAlignment(Element.ALIGN_LEFT);
            document.add(customerInfo);
            
            document.add(space);
            
       for (CustomerDetail detail : detailList) {
             
//          Create address paragraph
            Paragraph CustomerName = new Paragraph();
//          Create an instance of Name() class
            CustomerName.add("Name:                                                 "
                    + "     "+ detail.fullName());
            CustomerName.setAlignment(Element.ALIGN_LEFT);
            document.add(CustomerName);
            
            
//          Create address paragraph
            Paragraph deliveryAddress = new Paragraph();
//          Create an instance of Address() class
            deliveryAddress.add("Address                                                "
                    + "   "+detail.joinAddress());
            deliveryAddress.setAlignment(Element.ALIGN_LEFT);
            document.add(deliveryAddress);

//          Create type of order paragraph
            Paragraph typeOfOrder = new Paragraph();
            typeOfOrder.add("Order type                                            "
                    + "   "+detail.getOrderType());
            typeOfOrder.setAlignment(Element.ALIGN_LEFT);
            document.add(typeOfOrder);
            
//          Customer comment paragraph
            Paragraph comment = new Paragraph();
            comment.add("Comment                                                "
                    + ""+detail.getComment());
            comment.setAlignment(Element.ALIGN_LEFT);
            document.add(comment);  
       }
            
//          Create an instance of LineSeperator() class to add a horizontal line in document
            LineSeparator line = new LineSeparator(1, 200, new BaseColor(204, 204,
			204), Element.ALIGN_CENTER, -2);
            Paragraph horizontalLine = new Paragraph();
            horizontalLine.add(line);
            document.add(horizontalLine);
                        
            document.add(space);

//          Create pdf title paragraph
            Paragraph midTitle = new Paragraph();
            midTitle.setFont(bold);
            midTitle.add("ITEM(S) ORDERED");
            midTitle.setAlignment(Element.ALIGN_CENTER);
            document.add(midTitle);
            
            document.add(space);
            
//          Add column headers
            Paragraph itemListing = new Paragraph();
            itemListing.setFont(bold);
            itemListing.add("ITEM(s)                           QUANTITY                      "
                    + "PRICE");
            itemListing.setAlignment(Element.ALIGN_CENTER);
            document.add(itemListing);

            document.add(space);
            
        for (ItemOrdered item : itemList) {
       
            Paragraph item1 = new Paragraph();
            item1.setAlignment(Element.ALIGN_CENTER);
            item1.add(item.getName()+"                           "+item.getQuantity()+"                                  "
                    + ""+item.getUnitPrice());
            document.add(item1);
            
            document.add(space);

            document.add(horizontalLine);
            
            document.add(space);
           
//          Calculate total
            String calTotal = Integer.toString(Integer.parseInt(item.getUnitPrice().trim())* 
                    Integer.parseInt(item.getQuantity().trim()));
            Paragraph total = new Paragraph();
            total.setAlignment(Element.ALIGN_CENTER);
            total.add("Total in USD                                                               "
                    + ""+calTotal);
            document.add(total);
        }
            
            document.add(space);
           
            document.add(horizontalLine);
            
            document.add(space);            

            Paragraph restaurantInfo = new Paragraph();
            restaurantInfo.setFont(italic);
            restaurantInfo.add("Restaurant Information");
            document.add(restaurantInfo);
            
        for (Restaurant rdetail : restaurantDetailList) {
                
            Paragraph restaurantName = new Paragraph();
            restaurantName.setFont(italic);
            restaurantName.add("Name:   "+rdetail.getRestaurantName());
            document.add(restaurantName);
            
            Paragraph restaurantEmail = new Paragraph();
            restaurantEmail.setFont(italic);
            restaurantEmail.add("Email Address:   "+rdetail.getRestaurantEmail());
            document.add(restaurantEmail);
            
            Paragraph restaurantMobile = new Paragraph();
            restaurantMobile.setFont(italic);
            restaurantMobile.add("Mobile Number:   "+rdetail.getRestaurantMobile());
            document.add(restaurantMobile);
            
            Paragraph restaurantStreet = new Paragraph();
            restaurantStreet.setFont(italic);
            restaurantStreet.add("Street Name:   "+rdetail.getStreet());
            document.add(restaurantStreet);
        }
            document.close();
            System.out.println("Done");
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }
//  
     private static CustomerDetail customerDetail(Node node) {
        CustomerDetail detail = new CustomerDetail();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            org.w3c.dom.Element element = (org.w3c.dom.Element) node;
            detail.setFirstName(getTagValue("firstname", element));
            detail.setLastName(getTagValue("lastname", element));
            detail.setPostalCode(getTagValue("postalcode", element));
            detail.setStreet(getTagValue("streetname", element));
            detail.setCity(getTagValue("cityname", element));
            detail.setCountry(getTagValue("countryname", element));
            detail.setOrderType(getTagValue("ordertype", element));
            detail.setComment(getTagValue("comment", element));
        }

        return detail;
    }
     
    private static ItemOrdered itemOrdered(Node node) {
        ItemOrdered item = new ItemOrdered();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            org.w3c.dom.Element element = (org.w3c.dom.Element) node;
            item.setName(getTagValue("name", element));
            item.setQuantity(getTagValue("quantity", element));
            item.setUnitPrice(getTagValue("unitprice", element));
        }
        return item;
    }
          
    private static Restaurant restaurantDetail(Node node) {
        Restaurant rdetail = new Restaurant();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            org.w3c.dom.Element element = (org.w3c.dom.Element) node;
            rdetail.setRestaurantName(getTagValue("name", element));
            rdetail.setRestaurantMobile(getTagValue("mobile", element));
            rdetail.setRestaurantEmail(getTagValue("email", element));
            rdetail.setPostalCode(getTagValue("postalcode", element));
            rdetail.setStreet(getTagValue("streetname", element));
            rdetail.setCity(getTagValue("cityname", element));
            rdetail.setCountry(getTagValue("countryname", element));
        }
        return rdetail;
    }

    private static String getTagValue(String tag, org.w3c.dom.Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }
}
