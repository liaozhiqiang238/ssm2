package com.cxk.MSS.dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BaseDao {
	public Connection getConnecion() {
    	Connection con=null;
    	try{
    		Context tce=new InitialContext();
    		DataSource d=(DataSource)tce.lookup("java:comp/env/ds");
    		con=d.getConnection();
     	}catch (Exception e) {
    		e.printStackTrace();
		}
    	return con;   	 
    } 
}
