package com.manufacturer;

public class Manufacturer {
 private String manufacturerName;
 private String manufacturerAddress;
 private String manufacturerNumber;
 private Manufacturer(String manufacturerName,String manufacturerAddress,String ManufacturerNumber) {
	 this.manufacturerName=manufacturerName;
	 this. manufacturerAddress= manufacturerAddress;
	 this.manufacturerNumber=manufacturerNumber;
 }
 public String getManufacturerName() {
	 return manufacturerName;
 }
 public String getManufacturerAddress() {
	 return manufacturerAddress;
 }
 public String getManufacturerNumber() {
	 return manufacturerNumber;
 }
 public String toString() {
	 return "manufacturerName:"+manufacturerName+"\nmanufacturerAddress:"+manufacturerAddress+"\nmanufacturerNumber:"+manufacturerNumber;
 }
 public static Manufacturer getManufacurerObject(String manufacturerName,String manufacturerAddress,String manufacturerNumber) {
	 if(manufacturerNumber.length()!=0) {
		 return null;
	 }
	return new Manufacturer(manufacturerName,manufacturerAddress,manufacturerNumber);
	 }
}
