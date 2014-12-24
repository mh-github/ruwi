package com.mhalgosolinc.ruwi.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
*
* @author mhussain
*/
@Embeddable
public class Address implements Serializable {

   private static final long serialVersionUID = 1L;
   private String streetDetails1;
   private String streetDetails2;
   private String city;
   private String state;
   private int zip;
   private String country;

   /**
    * @return the streetDetails1
    */
   public String getStreetDetails1() {
       return streetDetails1;
   }

   /**
    * @param streetDetails1 the streetDetails1 to set
    */
   public void setStreetDetails1(String streetDetails1) {
       this.streetDetails1 = streetDetails1;
   }

   /**
    * @return the streetDetails2
    */
   public String getStreetDetails2() {
       return streetDetails2;
   }

   /**
    * @param streetDetails2 the streetDetails2 to set
    */
   public void setStreetDetails2(String streetDetails2) {
       this.streetDetails2 = streetDetails2;
   }

   /**
    * @return the city
    */
   public String getCity() {
       return city;
   }

   /**
    * @param city the city to set
    */
   public void setCity(String city) {
       this.city = city;
   }

   /**
    * @return the state
    */
   public String getState() {
       return state;
   }

   /**
    * @param state the state to set
    */
   public void setState(String state) {
       this.state = state;
   }

   /**
    * @return the zip
    */
   public int getZip() {
       return zip;
   }

   /**
    * @param zip the zip to set
    */
   public void setZip(int zip) {
       this.zip = zip;
   }

   /**
    * @return the country
    */
   public String getCountry() {
       return country;
   }

   /**
    * @param country the country to set
    */
   public void setCountry(String country) {
       this.country = country;
   }
}
