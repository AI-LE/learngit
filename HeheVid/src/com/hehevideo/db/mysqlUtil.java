package com.hehevideo.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class mysqlUtil {

	/**
	 * @param sql
	 * 增加数据
	 * @return 受影响行数
	 */
	public static int add(String sql) {
        int i=0;
        DBConnection db = new DBConnection();
        try {        
            PreparedStatement preStmt = (PreparedStatement) db.conn.prepareStatement(sql);
            preStmt.executeUpdate();

            preStmt.close();
            db.close();//关闭连接 
            i = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;//返回影响的行数，1为执行成功;
    }
	//更新数据
    public static int update(String sql) {
        int i =0;
        DBConnection db = new DBConnection();
        try {
            PreparedStatement preStmt = (PreparedStatement) db.conn.prepareStatement(sql);
            preStmt.executeUpdate();
            preStmt.close();
            db.close();
            i = 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    
    //查询
    public static List<Map<String,String>> sel(String sql, String[] params){
        // String sql ="select * from employee";
    	
    	
    	List<Map<String,String>> listmap = new ArrayList<>();
    	
         DBConnection db = new DBConnection();
         ResultSet rs = null;
         try {
            Statement stmt = (Statement) db.conn.createStatement();
            rs = (ResultSet) stmt.executeQuery(sql);
            while(rs.next()){
            	
            	Map<String,String> map = new HashMap<String,String>();
            	for(int i = 0; i < params.length; i++) {
            		
            		map.put(params[i], rs.getString(params[i]));
            	}
            	listmap.add(map);
            }
            rs.close();
            db.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return listmap; 
    }

    //删除数据，删除成功返回1
    public static int del(String delstr) {
        int i=0;
        DBConnection db = new DBConnection();
        try {    
            PreparedStatement preStmt = (PreparedStatement) db.conn.prepareStatement(delstr);
            preStmt.executeUpdate();
            
            preStmt.close();
            db.close();
            i = 1;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return i;
    }
    //查询返回字符串类型的值
    public static String getInstance(String sql,String para){

    	String string="";
    	 DBConnection db = new DBConnection();
         ResultSet rs = null;
         try {
            Statement stmt = (Statement) db.conn.createStatement();
            rs = (ResultSet) stmt.executeQuery(sql);
            while(rs.next()){
            	string = rs.getString(para);
            }
            rs.close();
            db.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return string; 
    }

}
	
	

