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

public class User{


// int recomendation=0;
 
  private String name;
  private int age;
  private int contact;
  private String gender;
  private Hotel hotel;
 // static User[] bookedUser= new User[100];
  static ArrayList<User> bookedUsers= new ArrayList<User>();
  static ArrayList<Hotel> bookedHotels= new ArrayList<Hotel>();
  static int userNumber=0;
  
  static List usersPerHotels= new ArrayList();
  //User.usersPerHotel.add(bookedUsers);
 
  

  
  Scanner scan=new Scanner(System.in);
  
  
  
  
  
  public User(int x) {
	super();
}



public User() {
	  System.out.print("Input username:\t");
	  String name= scan.nextLine();
	  this.name=name;
	  
	  System.out.println("Male or Female");
	  String gender= scan.nextLine();
	  this.gender=gender;
	  
	  System.out.print("Input age of user:\t");
	  int age= scan.nextInt();
	  scan.nextLine();
	  this.age=age;
	  
	  System.out.print("Input telephone number of user:\t");
	  int contact= scan.nextInt();
	  scan.nextLine();
	  this.contact=contact;
	  
	  System.out.println();
	  System.out.println();
	  System.out.println("\t\t\t\tWelcome "+this.name+" to Smart City");
}
  
  

public Hotel getHotel() {
	return hotel;
}



public void setHotel(Hotel hotel) {
	this.hotel = hotel;
}



public String getName(){
      return name;
  }
 
  public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public void setName(String name){
       this.name=name;
  }
  public int getAge(){
      return age;
  }
  public void setAge(int age){
       this.age=age;
  }
  public int getContact(){
      return contact;
  }
  public void setContact(int contact){
      this.contact=contact;
  }


  

public void book() {
    System.out.println("");
    
	System.out.println("**********Welcome to the booking window**********");
        System.out.println("");
	System.out.println("You may now book a hotel?\nHow do you wish to search for your hotel,\tinput 1- for search by location and \t2- for search by ranking");
        System.out.println("Input 1-To search by location");
        System.out.println("\nInput 1-To search by ranking");
	int choice=scan.nextInt();
	scan.nextLine();
	if(choice==1) {
		System.out.print("Input location:\t");
		String location= scan.nextLine();
		book(location);
	}
	
	if(choice==2) {
		System.out.print("Input rank within the range 1 to 5:\t");
		int rank= scan.nextInt();
		book(rank);
	}
        else{
            System.out.println("Choice invalid!");
        }
}


public void book(String Hotellocation){
	  int flag=0;
	  int i=0;
	  for(i=0; i< Admin.hotelsCreated.size();i++){
		
			  if(Admin.hotelsCreated.get(i).hotelLocation.trim().equalsIgnoreCase(Hotellocation)){
				  System.out.println("\n");
				  
				  System.out.println("Hotel ID:\t"+i+"\nName of hotel:\t"+Admin.hotelsCreated.get(i).hotelName+"\nRank of hotel:\t"+Admin.hotelsCreated.get(i).rank+"\nLocation:\t"
						  +Admin.hotelsCreated.get(i).hotelLocation+"\nPrice of hotel:\t"+Admin.hotelsCreated.get(i).price);
				  
				  flag++;
			  }   
	  }
	  
	  
	  if(flag>0){
		  System.out.println("Give ID of hotel chosen\t");
		  
		  int id=scan.nextInt();
		  System.out.println();
		  System.out.println("Verify the hotel chosen:");
		  System.out.println("Name of hotel Chosen:\t"+Admin.hotelsCreated.get(id).hotelName+"\nRank of hotel:\t"+Admin.hotelsCreated.get(id).rank+"\nLocation:\t"
				  +Admin.hotelsCreated.get(id).hotelLocation+"\nPrice of hotel:\t"+Admin.hotelsCreated.get(id).price);
		  System.out.println();
		  
		  Admin.hotelsCreated.get(id).recommendations++;
		  
		  this.hotel=Admin.hotelsCreated.get(id);
		  this.hotel.hotelName=Admin.hotelsCreated.get(id).hotelName;
		  this.hotel.hotelLocation=Admin.hotelsCreated.get(id).hotelLocation;
		  this.hotel.price=Admin.hotelsCreated.get(id).price;
		  
		  User.bookedUsers.add(this);
		  User.bookedHotels.add(this.hotel);
		// bookedUser[userNumber]=this;
//		  User.usersPerHotels.add(bookedUsers);
//		  User.usersPerHotels.add();
		  
		 userNumber++;
		 
		 System.out.println("Thanks for using our services have a nice stay in SMART CITY");
	  }
	  if(flag==0){
		  System.out.println("No hotel(s) with that location, whould you like to choose from the hotels displayed above?");
	  }
	  
}


public void book(int Hotelrank){
	 int flag=0;
	    int i=0;
	    for(i=0;i< Admin.hotelsCreated.size();i++){
	             if(Admin.hotelsCreated.get(i).rank==Hotelrank){
	            	 System.out.println("\n");
	                
	                 System.out.println("Hotel ID:\t"+i+"\nName of hotel:\t"+Admin.hotelsCreated.get(i).hotelName+"\nRank of hotel:\t"+Admin.hotelsCreated.get(i).rank+"\nLocation:\t"
	                         +Admin.hotelsCreated.get(i).hotelLocation+"\nPrice of hotel:\t"+Admin.hotelsCreated.get(i).price);
	                 
	                 flag++;
	                 }
	            
	        
	    }
	    if(flag>0){
	         System.out.println("Give ID of hotel chosen\t");
	                 
	                 int id=scan.nextInt();
	                 System.out.println();
	                 System.out.println("The hotel chosen is:");
	                  System.out.println("Name of hotel:\t"+Admin.hotelsCreated.get(id).hotelName+"\nRank of hotel:\t"+Admin.hotelsCreated.get(id).rank+"\nLocation:\t"
	                         +Admin.hotelsCreated.get(id).hotelLocation+"\nPrice of hotel:\t"+Admin.hotelsCreated.get(id).price);
	                  System.out.println();
	        		  
	                  Admin.hotelsCreated.get(id).recommendations++;
	        		  
	        		  this.hotel=Admin.hotelsCreated.get(id);
	        		  this.hotel.hotelName=Admin.hotelsCreated.get(id).hotelName;
	        		  this.hotel.hotelLocation=Admin.hotelsCreated.get(id).hotelLocation;
	        		  this.hotel.price=Admin.hotelsCreated.get(id).price;
	        		  
	        		  User.bookedUsers.add(this);
	        		  User.bookedHotels.add(this.hotel);
	        		// bookedUser[userNumber]=this;
//	        		  User.usersPerHotels.add(bookedUsers);
//	        		  User.usersPerHotels.add();
	        		  
	        		 userNumber++;
	        		 
	        		 System.out.println("Thanks for using our services have a nice stay in SMART CITY");
	    }
	    if(flag==0){
	        System.out.println("No hotel(s) with that location, whould you like to choose from the hotels displayed above?");
	    }
	    
	    
      }


static void displayUsersBooked(){
	System.out.println();
	   System.out.printf("%-30s%-10s%-5s%10s%20s","User Name","Gender","age","Contact","Hotel booked" );
	   System.out.println();
	   System.out.println();
	        for(User i:bookedUsers){
	            
	            System.out.printf("%-30s%-10s%-5s%10s%20s",i.name,i.gender,i.age,i.contact,i.hotel.hotelName);
	            System.out.println();
	            }
	        }



static void displayHotelsBooked(){
	System.out.println();
	 System.out.printf("%-20s%20s%10s%20s%10s","Hotel Name","Location","Price","Recommendations","Rank" );
	 System.out.println();
	 System.out.println();
	 
	        for(Hotel i:bookedHotels){
	            
	            System.out.printf("%-20s%20s%,10d%10d%10d",i.hotelName,i.hotelLocation,i.price,i.recommendations,i.rank);
	            System.out.println();
	            }
	        }


}
