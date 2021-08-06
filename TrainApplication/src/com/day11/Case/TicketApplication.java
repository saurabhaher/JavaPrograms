package com.day11.Case;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;



public class TicketApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException, FileNotFoundException 
	{
		Scanner s1 = new Scanner(System.in);
	
		TrainDAO t1 = new TrainDAO();
		Train passengerTrain;	
		System.out.println("Choose one of the following");
		System.out.println(" 1. book the ticket\n 2. enquiry of train\n 3. no of ticket booked\n 4. print all the tickets\n 5. exit\n");
		int Switch =s1.nextInt();
		switch(Switch)
		{    
		case 1:    
		{
			  // Train number verification 
			System.out.println("Enter the Train Number");
			int trainNo = s1.nextInt(); 
			passengerTrain = t1.findTrain(trainNo);
			if (passengerTrain==null)
			{	s1.close();
				return;
			}
			
			
			//Date verification
			System.out.println("Enter the Travel Date");
			String travelDate =s1.next();
			
			DateTimeFormatter formatter_1 = DateTimeFormatter.ofPattern("d/MM/yyyy");
			LocalDate date1 = LocalDate.parse(travelDate, formatter_1);
			LocalDate todayDate = LocalDate.now();  
			if (date1.isBefore(todayDate))
			{	
				s1.close();
				System.out.println("Travel date is before current date");
				return;
			}
			
			// store date and train data in ticket
			Ticket passengerTicket =new Ticket(date1, passengerTrain);
			
			
			//Enter the information of passenger
			System.out.println("Enter number of passengers");
			int noOfPassengers=s1.nextInt();
			s1.nextLine();
			for (int i=0;i<noOfPassengers;i++)
			{
				
				System.out.println("Enter Passenger Name");	
				String passengerName = s1.nextLine();
				System.out.println("Enter Age");
				int passengerAge = s1.nextInt();
				System.out.println("Enter Gender (M/F)");
				char passengerGender = s1.next().charAt(0);
				s1.nextLine();
				passengerTicket.addPassenger(passengerName, passengerAge, passengerGender);
				
			}	
			
			//Write the ticket into file
			passengerTicket.writeTicket();
			
			s1.close();
		}
		 break;  
		case 2:    
		{
			  // Train number verification 
			System.out.println("Enter the Train Number");
			int trainNo = s1.nextInt(); 
			passengerTrain = t1.findTrain(trainNo);
			if (passengerTrain==null)
			{	s1.close();
				return;
			}
			else 
				System.out.println("train is available :"+passengerTrain.getTrainName());
			
		}
		 break;   
		case 3:    
		{
			
		} 
		break;  
		case 4:    
			 
		break;
		
		case 5:    
			 
		break;  
				
		
		 
		} 
		
		
	
		
		
	}

}
