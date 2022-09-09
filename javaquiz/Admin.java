/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaquiz;

/**
 *
 * @author 
 */
import java.util.*;

public class Admin extends User{

private static int hotelNumber=1;

private int adminPin;
//public static Hotel[] hotels= new Hotel[10];
static ArrayList<Hotel> hotelsCreated= new ArrayList<Hotel>();
Scanner scan=new Scanner(System.in);



public static int getHotelNumber() {
	return hotelNumber;
}


public static void setHotelNumber(int hotelNumber) {
	Admin.hotelNumber = hotelNumber;
}


public int getAdminPin() {
	return adminPin;
}


public void setAdminPin(int adminPin) {
	this.adminPin = adminPin;
}



public Admin(int x) {
	super(x);
}


public Admin() {
	super(2);
	this.setName("Naura");
	this.adminPin=543210;
	
	System.out.println("\t\t\t\t ADMIN PAGE\n\nEnter Admin name:\t");
	String name=scan.nextLine();
	
	System.out.println("\nEnter pin:\t");
	int pin=scan.nextInt();
	scan.nextLine();
	
	if(name.equalsIgnoreCase(this.getName())&&pin==this.adminPin) {
		System.out.println("\n\n\t\t\t\tWelcome "+this.getName()+"!");
	}
	else {
		System.out.println("Wrong name or password");
		Admin admin=new Admin();
	}
	
	//super();
}


public void hotelCreate(){
	
	System.out.print("Number of hotels to be registered:\t");
	int numberOfHotels= scan.nextInt();
	scan.nextLine();
	for(int i=1;i<=numberOfHotels; i++) {
		System.out.println("\n\t\tHotel Number "+hotelNumber);
		System.out.println("\n Hotel Name:\t");
		String name=scan.nextLine();
		
		
		System.out.println("Hotel Location:\t");
		String location=scan.nextLine();
		
	
		System.out.println("Hotel Price per day:\t");
		int price=scan.nextInt();
		scan.nextLine();
		
		
		
		Hotel hot1=new Hotel(name,location,price);
		Admin.hotelsCreated.add(hot1);
		
		hotelNumber++;
	}
       
}


public void evaluation(){
	for(Hotel i: hotelsCreated) {
    if(i.recommendations>=100&&i.recommendations<200){
    	i.rank=2;
    }
    else if(i.recommendations>=200&&i.recommendations<300){
        i.rank=3;
    }
    else if(i.recommendations>=300&&i.recommendations<400){
        i.rank=4;
    }
    else if(i.recommendations>=400){
        i.rank=5;
    }
	}
}


static void displayHotel(){
	System.out.println("");
	   System.out.printf("%10s%20s%20s%10s%20s%10s","Hotel ID","Hotel Name","Location","Price","Recommendations","Rank");
	   System.out.println();
	   System.out.println("");
	        for(Hotel i:hotelsCreated){
	            
	            System.out.printf("%7d | %17s | %17s | %,7d | %17d | %7d |",hotelsCreated.indexOf(i),i.hotelName,i.hotelLocation,i.price,i.recommendations,i.rank);
	            System.out.println();
	            }
	        }

}
