package com.syntax.class12;

public class Phone {

  String model;
  int storage;
  
  
  void pic() {
	  System.out.println(model+" can take picture . the storage is "+storage);
  }
  void lock() {
	  System.out.println(model+" doesnt have face id");
  }
  
  public static void main(String []args) {
	  
  
  
  Phone Iphone=new Phone();
  Phone Nokia=new Phone();
  Phone Android= new Phone();
  
  
  Iphone.model="12 pro max";
  Iphone.storage=256;  
  Iphone.pic();
  
  
  
  Nokia.model="N100";
  Nokia.storage=128;
  Nokia.pic(); 
  
  Android.model="Samsung";
  Android.storage=228;
  Android.lock();
  
  
  }







}
