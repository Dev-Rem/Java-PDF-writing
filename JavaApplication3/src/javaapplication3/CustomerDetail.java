/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Aremu Oluwaseyi Festus(https://github.com/Dev-Rem)
 */
public class CustomerDetail extends Address {

    private String firstName;
    private String lastName;
    private String orderType;
    private String comment;

    public CustomerDetail() {

    }

    public CustomerDetail(String firstName, String lastName, String orderType, 
            String comment, String street, String city, String country, String postalCode) {
        super(street, city, country, postalCode);
        this.firstName = firstName;
        this.lastName = lastName;
        this.orderType = orderType;
        this.comment = comment;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String fullName() {
        return this.firstName + " " + this.lastName;
    }

    public String joinAddress() {
        return this.getPostalCode() + ", " + this.getStreet() + " " + this.getCity() + ", "
                + "" + this.getCountry();
    }

}
