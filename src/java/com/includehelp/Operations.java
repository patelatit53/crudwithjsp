package com.includehelp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Operations implements OperationsInterface {
	
	static String message ="";
	public String save(UserPOJO uObject) {
		int flag =0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MYDB","root","");	
			PreparedStatement ps = con.prepareStatement("INSERT INTO USERDETAILS VALUES(?,?,?,?);");
			ps.setString(1, uObject.getUserid());
			ps.setString(2, uObject.getEmail());
			ps.setString(3, uObject.getDepartment());
			ps.setLong(4, uObject.getPhone());
		
			flag =	ps.executeUpdate();
			if(flag!=0){
				message ="Saved SuccessFully";
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return message;
	}

	public List<UserPOJO> getListUsers() {
		System.out.println("inside getlist");
		List <UserPOJO> list = new ArrayList<UserPOJO>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MYDB","root","");	
			PreparedStatement ps = con.prepareStatement("SELECT * FROM USERDETAILS;");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				UserPOJO uObject = new UserPOJO();
				uObject.setUserid(rs.getString(1));
				uObject.setEmail(rs.getString(2));
				uObject.setDepartment(rs.getString(3));
				uObject.setPhone(rs.getLong(4));
							
				list.add(uObject);				
			}
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;		
	}
	
	public  String Update(UserPOJO uObject){
		 int status=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MYDB","root","");	
			PreparedStatement ps = con.prepareStatement("UPDATE USERDETAILS SET EMAIL=?,DEPARTMENT=?,PHONE=? WHERE USERID=?;");
			//Statement st=con.createStatement();
			ps.setString(1,uObject.getEmail());
                        
			ps.setString(2,uObject.getDepartment());
			ps.setLong(3,uObject.getPhone());
			ps.setString(4,uObject.getUserid());
                        status =ps.executeUpdate();
                        //getListUsers();
//                        String a=uObject.getEmail();
//                        System.out.println("getemail"+uObject.getEmail());
//			String b=uObject.getDepartment();
//			String c=uObject.getPhone()+"";
//			String d=uObject.getUserid();
                       // "UPDATE employees SET FIRST_NAME ='" + FIRST_NAME
                       //String updateStmt ="UPDATE employees SET FIRST_NAME ='" + FIRST_NAME + "',LAST_NAME='" + LAST_NAME + "',EMAIL='" + EMAIL + "' WHERE EMPLOYEE_ID='" + EMPLOYEE_ID + "'";
//String ps = ("UPDATE USERDETAILS SET EMAIL='"+a+"',DEPARTMENT='"+b+"',PHONE='"+c+"' WHERE USERID='"+d+"'");
//			st.executeUpdate(ps);

                       
			if(status==0){
				message ="failed SuccessFully";
			}
                        
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		
		return message;
	}
	
	public  String deleteUser(String userid){
		int status=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MYDB","root","");	
			PreparedStatement ps = con.prepareStatement("DELETE FROM USERDETAILS WHERE USERID=?;");
			
			
			ps.setString(1, userid);

			status =ps.executeUpdate();
			if(status!=0){
				message ="Record Deleted SuccessFully";
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return message;
	}
}