/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaquiz;

import java.util.Scanner;

/**
 *
 * @author user
 */

    /**
     * @param args the command line arguments
     
   public static void main(String[] args) {
        
        Admin name=new Admin("Naura");
        Hotel hotel[]=new Hotel[5];
        
       // name.register_hotels(name, location, 0, hotel, 0);
        Hotel hotel1= new Hotel("Chariot","Muea", 4000);
        Hotel hotel2= new Hotel("St Claire","Molyko", 2000);
        Hotel hotel3= new Hotel("Mountain","Buea Town", 5000);
        Hotel hotel4= new Hotel("Mount Zion","Muea", 3000);
        Hotel hotel5= new Hotel("Zena","Muea", 2000);
        
       hotel[0]= hotel1;
       hotel[1]= hotel2;
       hotel[2]= hotel3;
       hotel[3]= hotel4;
       hotel[4]= hotel5;
       Hotel.display(hotel);
    }}
 /* Scanner welcome=new Scanner(System.in);
       
         int x=welcome.nextInt();
         User log=new User();
          log.loginuser();
          switch(x){
              case 1:
                   log.loginuser();
                   break;
         
              default:
                  System.out.println("----------------------------------------------------------------Enter the right choice----------------------------------------------------------------\n");    
          }
        
      }
    
    }

*/
public class JavaQuiz {
    Scanner scan=new Scanner(System.in);
	String response;
	int choice;
	
	
		//String response; 
		
	public void Login() {	
		while(true) {
		System.out.println("**********Welcome to Smart City Hotel Management Service**********");
		System.out.println();
		//System.out.println("=============Welcome to our Hotel management Service===============");
		System.out.println("\n\nLogin \nAs Client  or  Admin:\t");
		
	    response=scan.nextLine();
	    if(response.equalsIgnoreCase("client")) {
	    	System.out.println();
	    	runUser();
	    	
	    }
	    
	    else if(response.equalsIgnoreCase("admin")) {
	    	System.out.println();
	    	runAdmin();
	    	
	    }
		}
	}
		   

	
	public void runUser() {
		 
		Admin admin= new Admin(1);
		 User user= new User();
		  // Hotel[] hotels= new Hotel[10];
		while(true) {   
			
		  
		  System.out.println("\n\n");
		   System.out.println("********MENU*********");
                    System.out.println("");
	        System.out.println("Option 1- Book hotel");
	        System.out.println("Option 2- Display list of registered hotels");
	        System.out.println("Option 3- Exit");
	        
	        System.out.println();
	        choice=scan.nextInt();
	        scan.nextLine();
	        System.out.println();
	        switch (choice) {
	        case 1: 
	        	
             user.book();
             admin.evaluation();
             
             break;
	              
	        case 2: 
	        	
	              Admin.displayHotel();
	              
	              System.out.println("Do you wish to book a hotel from the list above?\nYes or No");
                   response=scan.nextLine();
	              
	              if(response.equalsIgnoreCase("yes")) {
	            	  System.out.println("Hotel ID:\t");
		                 
		                 int id=scan.nextInt();
		                 scan.nextLine();
		                 System.out.println();
		                 System.out.println("Hotel chosen:");
		                  System.out.println("Name of hotel:\t"+Admin.hotelsCreated.get(id).hotelName+"\nRank of hotel:\t"+Admin.hotelsCreated.get(id).rank+"\nLocation:\t"
		                         +Admin.hotelsCreated.get(id).hotelLocation+"\nPrice per day:\t"+Admin.hotelsCreated.get(id).price);
		                  System.out.println();
		        		  
		                  Admin.hotelsCreated.get(id).recommendations++;
		        		  
		        		  user.setHotel(Admin.hotelsCreated.get(id));
		        		 
		        		  
		        		  User.bookedUsers.add(user);
		        		  User.bookedHotels.add(user.getHotel());
		        		// bookedUser[userNumber]=this;
//		        		  User.usersPerHotels.add(bookedUsers);
//		        		  User.usersPerHotels.add();
		        		  
		        		 User.userNumber++;
		        		  admin.evaluation();
		        		 System.out.println("Thanks for using our services have a nice stay in SMART CITY");
		    
	            	  
	              }
	              
	              else {
	            	  System.out.println("Thank you for visiting Smart City");
	              }
	              
	              break;
	              
	        case 3: 
	        	
	        	System.out.println("Thank you for visiting Smart City");
	              
	              break;
	              
	         default: 
	        	 System.out.println("Invalid Choice");
	        	// runner();
	        	 
	        
	        }
	       
	        
	        if(choice==3) {
	        	break;
	        }
		}
		
	        
	}
	
	
	public void runAdmin() {
		
		Admin admin=new Admin();
		 
		  // Hotel[] hotels= new Hotel[10];
		while(true) {   
		  
		  System.out.println("\n\n");
		   System.out.println("*********MENU*********");
                    System.out.println("");
	        System.out.println("Option 1- Create hotel");
	        System.out.println("Option 2- View lists of clients");
	        System.out.println("Option 3-View lists of booked hotels");
	        System.out.println("Option 4-Display hotels registered");
	        System.out.println("Option 5-Exit");
	        
	        System.out.println();
	      
	        choice=scan.nextInt();
	        scan.nextLine();
	        System.out.println();
	        switch (choice) {
	        case 1: 
	        	
	        	admin.hotelCreate();
           
           break;
           
	        case 2: 
	        	
	            User.displayUsersBooked();
	              
	              break;
	              
            case 3: 
	        	
	            User.displayHotelsBooked();
	              
	              break;
	              
	        case 4: 
	        	
	              Admin.displayHotel();
	              
	             
	              break;
	              
	        case 5: 
	        	
	        	System.out.println("Thank you trusting our services");
	              
	              break;
	              
	         default: 
	        	 System.out.println("Invalid Choice");
	        	// runner();
	        	 
	        
	        }
	        
	        
	        if(choice==5) {
	        	break;
	        }
		}
		
	        
	}
}



