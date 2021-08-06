package com.day11.Case;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;





public class TrainDAO {
	
	private final String DRIVER_NAME="jdbc:oracle:thin:";
	private final String DB_URL="@127.0.0.1:1521:XE";
	private final String USERNAME="hr";
	private final String PASSWORD="saurabh";

	public  Train findTrain(int TrainNumber) throws ClassNotFoundException, SQLException
	{
		//step 1 - register the driver
		Class.forName("oracle.jdbc.OracleDriver");
		//Step 2 - establish a connection
		Connection connection = DriverManager.getConnection(DRIVER_NAME+DB_URL,USERNAME, PASSWORD);
		//Step 3 - create a statement
		Statement statement = connection.createStatement();
		//Step 4 - pass the SQL query and get the result
		
		ResultSet resultSet;
		try {
			resultSet = statement.executeQuery("SELECT * FROM TRAINS WHERE TRAIN_NO="+TrainNumber);
			resultSet.next();
			Train t1 = new Train();
			t1.setTrainNo(resultSet.getInt(1));
			t1.setTrainName(resultSet.getString(2));
			t1.setSource(resultSet.getString(3));
			t1.setDestination(resultSet.getString(4));
			t1.setTicketPrice(resultSet.getDouble(5));
			return t1;
		} 
		catch (SQLException e) {
			
			System.out.println("this train number doesnt exists");
			return null;
		}
	
	}
	
}
