/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaquiz;

import java.util.Scanner;

/**
 *
 * @author 
 */

public class Hotel {
String hotelName;
String hotelLocation;
int rank=1;
int price;
int recommendations=0;

Scanner scan=new Scanner(System.in);
	
	int choice;


    public Hotel(String hotelName, String hotelLocation, int price) {
        this.hotelName = hotelName;
        this.hotelLocation = hotelLocation;
        this.price = price;
        
    }
}
    /*public void Login() {	
		while(true) {
		System.out.println("**********Welcome to Smart City Hotel Management Service**********");
		System.out.println();
		//System.out.println("=============Welcome to our Hotel management Service===============");
		System.out.println("\n\nLogin \nAs Client  or  Admin:\t");
		
	    response=scan.nextLine();
	    if(response.equalsIgnoreCase("client")) {
	    	System.out.println();
	    	userRunner();
	    	
	    }
	    
	    else if(response.equalsIgnoreCase("admin")) {
	    	System.out.println();
	
    
}*/
