package com.service;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.controller.DBConnect;
import com.model.User;
import com.mysql.jdbc.Statement;

public class UserService {
	
	public void RegisterUser(User us) {
		
		try {
			
			String query = "insert into userregister values('"+us.getName()+"','"+us.getEmail()+"','"+us.getPassword()+"','"+us.getAddress()+"','"+us.getAddress2()+"','"+us.getCity()+"','"+us.getState()+"','"+us.getZip()+"')";
			
			Statement statement = (Statement) DBConnect.getConnection().createStatement();
			statement.executeUpdate(query);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public boolean validate(User us) {
		
		try {
//			System.out.println("reached validate first line");
			String query = "select * from userregister where userEmail = '"+ us.getEmail()+"' and userPassword = '"+ us.getPassword()+"'";

			
			java.sql.Statement statement = DBConnect.getConnection().createStatement();
			
			ResultSet rs = statement.executeQuery(query);
			if(rs.next()) {
				System.out.println("validation success");
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	public User getOne(User us) {
		
		try {
			String query = "select * from userregister where userEmail = '"+ us.getEmail()+"' and userPassword = '"+ us.getPassword()+"'";
//			System.out.println("Query: " + query);
//			System.out.println("Email: " + us.getEmail());
//		    System.out.println("Password: " + us.getPassword());
			java.sql.Statement statement = DBConnect.getConnection().createStatement();
//			System.out.println("reached get one");
			
			ResultSet rs = statement.executeQuery(query);
			if(rs.next()) {
//				System.out.println("reached get one two");
				us.setName(rs.getString("userName"));
				us.setEmail(rs.getString("userEmail"));
				us.setPassword(rs.getString("userPassword"));
				us.setAddress(rs.getString("userAddress"));
				us.setAddress2(rs.getString("userAddress2"));
				us.setCity(rs.getString("userCity"));
				us.setState(rs.getString("userState"));
				us.setZip(rs.getString("userZip"));
				
				return us;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public ArrayList<User> getAllUser(){
		try {
			ArrayList<User> listUser = new ArrayList<User>();
			
			String query = "select * from userregister";
			
			java.sql.Statement statement = DBConnect.getConnection().createStatement();
			ResultSet rs = statement.executeQuery(query);
			
			while(rs.next()) {
				User usr = new User();
				usr.setName(rs.getString("name"));
				usr.setEmail(rs.getString("email"));
				usr.setPassword(rs.getString("password"));
				usr.setAddress(rs.getString("address"));
				usr.setAddress2(rs.getString("address2"));
				usr.setCity(rs.getString("city"));
				usr.setState(rs.getString("state"));
				usr.setZip(rs.getString("zip"));
				
				listUser.add(usr);
				
			}
			
			return listUser;
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
	}
	
public User singleDataButton(User us) {
		
		try {
			String query = "select * from userregister where userEmail = '"+ us.getEmail()+"'";
			
			java.sql.Statement statement = DBConnect.getConnection().createStatement();
			
			ResultSet rs = statement.executeQuery(query);
			if(rs.next()) {
				us.setName(rs.getNString("name"));
				us.setEmail(rs.getNString("email"));
				us.setPassword(rs.getNString("password"));
				us.setAddress(rs.getNString("address"));
				us.setAddress2(rs.getNString("address2"));
				us.setCity(rs.getNString("city"));
				us.setState(rs.getNString("state"));
				us.setZip(rs.getNString("zip"));
				
				
				
				return us;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}

public void updateUser(User user) {
	System.out.println("wertyuiop");

	try {
		
//		String query = "update userregister set userName = '"+user.getName()+"' userEmail= '"+user.getEmail()+"' userPassword= '"+user.getPassword()+"' userAddress = '"+user.getAddress()+"' userAddress2 = '"+user.getAddress2()+"' userCity = '"+user.getCity()+"' userState= '"+user.getState()+"' userZip = '"+user.getZip()+"' where email = '"+user.getEmail()+"'";
		String query = "UPDATE userregister SET userName = '"+user.getName()+"', userEmail = '"+user.getEmail()+"', userPassword = '"+user.getPassword()+"', userAddress = '"+user.getAddress()+"', userAddress2 = '"+user.getAddress2()+"', userCity = '"+user.getCity()+"', userState = '"+user.getState()+"', userZip = '"+user.getZip()+"' WHERE userEmail = '"+user.getEmail()+"'";

//		System.out.println(query);
		
		java.sql.Statement statement = DBConnect.getConnection().createStatement();
		statement.executeUpdate(query);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public void deleteUser(User us) {
	try {
		
//		String query = "Delete from userregister where userEmail = '"+us.getEmail()+"'";
		String query = "DELETE FROM userregister WHERE userEmail = '" + us.getEmail() + "'";
		System.out.println(us.getEmail());

		System.out.println("deleted");
		java.sql.Statement statement =  DBConnect.getConnection().createStatement();
		statement.executeUpdate(query);
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}

}
