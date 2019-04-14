package com.aile.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mysqlUtil {

	public static void main(String[] args) {
		List< Map<String,String> > maplist = new ArrayList<>();
		String sqlget = "select * from books";
		String[] params = { "bookId" ,"bookname","booktype","bookauthor"};
		maplist = show(sqlget, params);
		for(int i = 0; i < maplist.size(); i++) {
			String outstr = "id:" + maplist.get(i).get("bookId") + "||bookname:" + maplist.get(i).get("bookname");
			System.out.println(outstr);
		}

		
	}
	public static int add(String sql) {
        int i=0;
        DBConnection db = new DBConnection();
        try {        
            PreparedStatement preStmt = (PreparedStatement) db.conn.prepareStatement(sql);
            preStmt.executeUpdate();
            //Statement statement = (Statement) db.conn.createStatement();
            //statement.executeUpdate(sql);
            
            preStmt.close();
            db.close();//鍏抽棴杩炴帴 
            i = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;//杩斿洖褰卞搷鐨勮鏁帮紝1涓烘墽琛屾垚鍔�;
    }
    //
    public static int show(String sql){
        
            return 0;
        
    }

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
    

    public static List< Map<String,String> > show(String sql, String[] params){
        // String sql ="select * from employee";
    	
    	
    	List< Map<String,String> > listmap = new ArrayList<>();
    	
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

}
	
	

